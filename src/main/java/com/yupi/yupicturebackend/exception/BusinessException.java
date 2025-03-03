package com.yupi.yupicturebackend.exception;

import lombok.Getter;

/**
 * @Description 自定义业务异常
 * @Author yy_Li
 * @Date 2025/3/3
 */
@Getter
public class BusinessException extends RuntimeException{
    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorcode) {
        super(errorcode.getMessage());
        this.code = errorcode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}
