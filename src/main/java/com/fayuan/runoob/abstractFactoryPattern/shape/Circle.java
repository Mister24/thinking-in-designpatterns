/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern.shape;

/**
 * 圆形
 *
 * @author mr.24
 * @version Id: Circle, v 1.0 2019-07-06 23:10 Exp $$
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}