package com.yupi.yupicturebackend.exception;

/**
 * @Description 异常处理工具类
 * @Author yy_Li
 * @Date 2025/3/3
 */
public class ThrowUtils {
    /**
     * 断言式的封装
     * @param condition result yes or no
     * @param runtimeException 异常
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode){
        throwIf(condition, new BusinessException(errorCode));
    }

    public static void throwIf(boolean condition, ErrorCode errorcode, String message) {
        throwIf(condition, new BusinessException(errorcode, message));
    }
}
