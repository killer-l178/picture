package com.yupi.yupicturebackend.common;

import lombok.Data;

/**
 * @Description 通用的分页请求类
 * @Author yy_Li
 * @Date 2025/3/3
 */
@Data
public class PageRequest {
    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = "descend";
}
