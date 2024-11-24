package homwork.soft.activity.entity.dto;

import homwork.soft.activity.entity.po.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户(User)查询参数
 *
 * @author jscomet
 * @since 2024-11-24 11:31:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends User {
}
