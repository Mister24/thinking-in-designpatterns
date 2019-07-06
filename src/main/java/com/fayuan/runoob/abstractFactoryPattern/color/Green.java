/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern.color;

/**
 * 绿色
 *
 * @author mr.24
 * @version Id: Green, v 1.0 2019-07-06 23:12 Exp $$
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}