package com.yupi.yupicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 * @Author yy_Li
 * @Date 2025/3/5
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 8735650154179439661L;
    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
