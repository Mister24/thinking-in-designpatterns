/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern.color;

/**
 * 蓝色
 *
 * @author mr.24
 * @version Id: Blue, v 1.0 2019-07-06 23:14 Exp $$
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
