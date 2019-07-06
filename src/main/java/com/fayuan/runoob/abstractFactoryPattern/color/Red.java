/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern.color;

/**
 * 红色
 *
 * @author mr.24
 * @version Id: Red, v 1.0 2019-07-06 23:11 Exp $$
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
