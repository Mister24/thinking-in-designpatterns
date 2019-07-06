/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.factoryPattern;

/**
 * 形状枚举
 *
 * @author mr.24
 * @version Id: ShapeTypeEnum, v 1.0 2019-07-06 11:54 Exp $$
 */
public enum ShapeTypeEnum {
    /** 圆形 */
    CIRCLE("CIRCLE_SHAPE", "圆形"),

    /** 长方形 */
    RECTANGLE("RECTANGLE_SHAPE", "长方形"),

    /** 正方形 */
    SQUARE("SQUARE_SHAPE", "正方形");

    private String name;
    private String description;

    ShapeTypeEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for property <tt>description</tt>.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }
}
