/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.factoryPattern.impl;

import com.fayuan.runoob.factoryPattern.Shape;

/**
 * 长方形 —— 实现类
 *
 * @author mr.24
 * @version Id: Rectangle, v 1.0 2019-07-06 11:48 Exp $$
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::Draw() method.");
    }
}
