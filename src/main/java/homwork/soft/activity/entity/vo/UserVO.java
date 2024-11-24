package homwork.soft.activity.entity.vo;

import homwork.soft.activity.entity.po.Role;
import homwork.soft.activity.entity.po.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 用户(User)视图模型
 *
 * @author jscomet
 * @since 2024-11-24 11:31:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserVO extends User {
    List<Role> roles;
}
