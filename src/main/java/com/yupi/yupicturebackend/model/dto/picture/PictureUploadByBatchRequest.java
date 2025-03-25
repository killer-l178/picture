package com.yupi.yupicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadByBatchRequest implements Serializable {

    /*
    * 搜索词
    * */
    private String searchText;

    /*
    * 批量抓取数量
    * */
    private Integer count = 10;

    /*
    * 图片名称前缀
    * */
    private String namePrefix;

    private static final long serialVersionUID = 1L;
}