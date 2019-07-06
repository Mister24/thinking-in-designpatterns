/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern.shape;

/**
 * 正方形
 *
 * @author mr.24
 * @version Id: Rectangle, v 1.0 2019-07-06 23:09 Exp $$
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
