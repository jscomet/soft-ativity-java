package homwork.soft.activity.entity.po;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serial;
import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author jscomet
 * @since 2024-11-24 09:26:02
 */
@Data
public class UserRole implements Serializable {
    @Serial
    private static final long serialVersionUID = -30696759645873659L;
    /**
     * 学工号
     */
    @Schema(description = "学工号")
    @TableField(value = "user_id")
    private String userId;

    /**
     * 角色id
     */
    @Schema(description = "角色id")
    @TableField(value = "role_id")
    private Integer roleId;


}
