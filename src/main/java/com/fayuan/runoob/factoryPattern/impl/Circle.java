/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.factoryPattern.impl;

import com.fayuan.runoob.factoryPattern.Shape;

/**
 * 圆形 —— 实现类
 *
 * @author mr.24
 * @version Id: Circle, v 1.0 2019-07-06 11:51 Exp $$
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
