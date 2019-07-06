/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern;

import com.fayuan.runoob.abstractFactoryPattern.color.Color;
import com.fayuan.runoob.abstractFactoryPattern.shape.Shape;

/**
 * 抽象工厂
 *
 * @author mr.24
 * @version Id: AbstractFactory, v 1.0 2019-07-06 23:16 Exp $$
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
