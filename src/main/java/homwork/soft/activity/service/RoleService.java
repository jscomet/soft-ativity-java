package homwork.soft.activity.service;


import com.baomidou.mybatisplus.extension.service.IService;
import homwork.soft.activity.entity.po.Role;
import homwork.soft.activity.entity.dto.RoleQuery;
import homwork.soft.activity.entity.vo.RoleVO;

import java.util.List;

/**
 * 角色(Role)表服务接口
 *
 * @author jscomet
 * @since 2024-11-24 13:14:06
 */
public interface RoleService extends IService<Role> {
    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    RoleVO queryById(Integer roleId);

    /**
     * 查询多条数据
     *
     * @param current 查询页面
     * @param pageSize 查询条数
     * @param param 查询参数
     * @return 对象列表
     */
    List<RoleVO> queryAll(int current, int pageSize, RoleQuery param);

    /**
     * 通过实体作为筛选条件计数
     *
     * @param param 查询参数
     * @return 数量
     */
    int count(RoleQuery param);

    /**
     * 根据用户id获取角色
     * @param userId 用户id
     * @return 角色列表
     */
    List<Role> queryByUserId(String userId);
}

