package homwork.soft.activity.service;


import com.baomidou.mybatisplus.extension.service.IService;
import homwork.soft.activity.entity.po.User;
import homwork.soft.activity.entity.dto.UserQuery;
import homwork.soft.activity.entity.vo.UserVO;

import java.util.List;

/**
 * 用户(User)表服务接口
 *
 * @author jscomet
 * @since 2024-11-24 11:31:19
 */
public interface UserService extends IService<User> {
    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    UserVO queryById(String userId);

    /**
     * 查询多条数据
     *
     * @param current 查询页面
     * @param pageSize 查询条数
     * @param param 查询参数
     * @return 对象列表
     */
    List<UserVO> queryAll(int current, int pageSize, UserQuery param);

    /**
     * 通过实体作为筛选条件计数
     *
     * @param param 查询参数
     * @return 数量
     */
    int count(UserQuery param);

}

