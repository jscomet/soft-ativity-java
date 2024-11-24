package homwork.soft.activity.service;


import com.baomidou.mybatisplus.extension.service.IService;
import homwork.soft.activity.entity.po.UserRole;
import homwork.soft.activity.entity.dto.UserRoleQuery;
import homwork.soft.activity.entity.vo.UserRoleVO;

import java.util.List;

/**
 * (UserRole)表服务接口
 *
 * @author jscomet
 * @since 2024-11-24 09:26:02
 */
public interface UserRoleService extends IService<UserRole> {
    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    UserRoleVO queryById(String userId);

    /**
     * 查询多条数据
     *
     * @param current  查询页面
     * @param pageSize 查询条数
     * @param param    查询参数
     * @return 对象列表
     */
    List<UserRoleVO> queryAll(int current, int pageSize, UserRoleQuery param);

    /**
     * 通过实体作为筛选条件计数
     *
     * @param param 查询参数
     * @return 数量
     */
    int count(UserRoleQuery param);

}

