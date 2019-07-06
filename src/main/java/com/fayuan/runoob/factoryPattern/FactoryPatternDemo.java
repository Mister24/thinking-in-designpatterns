/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.factoryPattern;

/**
 * @author mr.24
 * @version Id: FactoryPatternDemo, v 1.0 2019-07-06 22:12 Exp $$
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // 获取Circle对象
        Shape circleShape = factory.getShape(ShapeTypeEnum.CIRCLE.getName());
        circleShape.draw();

        // 获取Rectangle对象
        Shape rectangleShape = factory.getShape(ShapeTypeEnum.RECTANGLE.getName());
        rectangleShape.draw();

        // 获取Square对象
        Shape squareShape = factory.getShape(ShapeTypeEnum.SQUARE.getName());
        squareShape.draw();
    }
}
