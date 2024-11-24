package homwork.soft.activity.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import homwork.soft.activity.dao.UserRoleDao;
import homwork.soft.activity.entity.po.UserRole;
import homwork.soft.activity.service.UserRoleService;
import homwork.soft.activity.entity.dto.UserRoleQuery;
import homwork.soft.activity.entity.po.UserRole;
import homwork.soft.activity.entity.vo.UserRoleVO;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

import java.util.List;

/**
 * (UserRole)表服务实现类
 *
 * @author jscomet
 * @since 2024-11-24 09:26:02
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {
    @Resource
    private UserRoleDao userRoleDao;

    @Override
    public UserRoleVO queryById(String userId) {
        return userRoleDao.queryById(userId);
    }

    @Override
    public List<UserRoleVO> queryAll(int current, int pageSize, UserRoleQuery param) {
        PageHelper.startPage(current, pageSize);
        return userRoleDao.queryAll(param);
    }

    @Override
    public int count(UserRoleQuery param) {
        return userRoleDao.count(param);
    }
}

