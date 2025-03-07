package com.yupi.yupicturebackend.exception;
import lombok.Getter;

/**
 * @Description 自定义错误码
 * @Author yy_Li
 * @Date 2025/2/15
 */
@Getter
public enum ErrorCode {
    SUCCESS(0, "OK"),
    PARAMS_ERROR(40000, "请求参数错误"),
    NULL_ERROR(40001, "请求数据为空"),
    NOT_LOGIN(40100, "未登录"),
    NOT_FOUND_ERROR(40400, "请求数据不存在"),
    NO_AUTH(40101, "无权限"),
    SYSTEM_ERROR(50000, "系统内部异常"),
    OPERATION_ERROR(50001, "操作失败");

    private final int code;
    /**
     * 状态码信息
     */
    private final String message;


    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
