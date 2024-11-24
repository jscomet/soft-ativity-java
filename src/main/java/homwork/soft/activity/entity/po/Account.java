package homwork.soft.activity.entity.po;

import cn.afterturn.easypoi.excel.annotation.Excel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serial;
import java.io.Serializable;

/**
 * 账号表(Account)实体类
 *
 * @author jscomet
 * @since 2024-11-24 09:35:29
 */
@Data
public class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 753913473819655429L;
    /**
     * 学工号
     */
    @Schema(description = "学工号")    
    @TableId(value = "user_id")
    private String userId;


    /**
     * 密码
     */
    @Schema(description = "密码")    
    @TableField(value = "password")
    private String password;

    /**
     * 微信openid
     */
    @Schema(description = "微信openid")    
    @TableField(value = "open_id")
    private String openId;


}
