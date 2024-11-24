package homwork.soft.activity.util;

import cn.hutool.jwt.JWTUtil;
import homwork.soft.activity.constant.JwtClaimsConstant;
import homwork.soft.activity.constant.enums.RoleType;
import homwork.soft.activity.context.CurrentUserContext;
import homwork.soft.activity.entity.po.Role;
import homwork.soft.activity.entity.vo.UserVO;
import homwork.soft.activity.property.AppProperty;
import homwork.soft.activity.service.UserService;
import io.jsonwebtoken.Claims;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthUtils {
    @Resource
    private UserService userService;
    private static UserService service;

    @Resource(name = "appProperty")
    private AppProperty _appProperty;
    private static AppProperty appProperty;

    @PostConstruct
    public void init() {
        AuthUtils.service = this.userService;
        AuthUtils.appProperty = this._appProperty;
    }


    public static String createJwtToken(String userId) {
        Map<String, Object> payload = new HashMap<>();
        payload.put(JwtClaimsConstant.USER_ID, userId);
        return JwtUtils.createJWT(appProperty.getJwt().getSecretKey(), appProperty.getJwt().getTtl(), payload);
    }

    public static UserVO getUserDetails() {
        return CurrentUserContext.getCurrentUser();
    }

    public static void setUserDetails(UserVO user) {
        CurrentUserContext.setCurrentUser(user);
    }

    public static void removeUserDetails() {
        CurrentUserContext.removeCurrentUser();
    }

    /**
     * 是否有权限访问
     *
     * @return 是否
     */
    public static boolean isAuthenticated() {
        return getUserDetails() != null && getUserDetails().getUserId() != null;
    }

    public static boolean hasRole(RoleType type) {
        return hasRole(type.name());
    }

    public static boolean hasRole(String authority) {
        UserVO userDetails = getUserDetails();
        return userDetails.getRoles().stream().map(Role::getEname).anyMatch(authority::equals);
    }

    public static boolean hasAnyRole(RoleType... types) {
        for (RoleType type : types) {
            if (hasRole(type)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasAnyRole(String... authorities) {
        for (String authority : authorities) {
            if (hasRole(authority)) {
                return true;
            }
        }
        return false;
    }

}
