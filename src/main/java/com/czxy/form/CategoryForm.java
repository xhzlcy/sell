package com.czxy.form;

import lombok.Data;

/**
 * @author xuhongzu
 * @version 1.0
 * @date 2019/9/3
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}

