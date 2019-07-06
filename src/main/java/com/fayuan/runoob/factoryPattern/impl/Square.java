/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.factoryPattern.impl;

import com.fayuan.runoob.factoryPattern.Shape;

/**
 * 正方形 —— 实现类
 *
 * @author mr.24
 * @version Id: Square, v 1.0 2019-07-06 11:50 Exp $$
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
