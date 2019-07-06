/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern;

import com.fayuan.runoob.abstractFactoryPattern.color.Color;
import com.fayuan.runoob.abstractFactoryPattern.shape.Shape;

/**
 * @author mr.24
 * @version Id: AbstractFactoryDemo, v 1.0 2019-07-07 00:13 Exp $$
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // 获取Circle对象
        Shape circleShape = shapeFactory.getShape("CIRCLE");

        circleShape.draw();

        // 获取RecTangle对象
        Shape recTangleShape = shapeFactory.getShape("RECTANGLE");
        recTangleShape.draw();

        /**********************************************************************/
        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color redColor = colorFactory.getColor("RED");
        redColor.fill();

        Color buleColor = colorFactory.getColor("BLUE");
        buleColor.fill();
    }
}
