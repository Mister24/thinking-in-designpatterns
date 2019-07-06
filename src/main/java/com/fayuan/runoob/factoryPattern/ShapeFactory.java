/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.factoryPattern;

import com.fayuan.runoob.factoryPattern.impl.Circle;
import com.fayuan.runoob.factoryPattern.impl.Rectangle;
import com.fayuan.runoob.factoryPattern.impl.Square;

/**
 * 工厂类
 *
 * @author mr.24
 * @version Id: ShapeFactory, v 1.0 2019-07-06 11:52 Exp $$
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (null == shapeType) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE_SHAPE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE_SHAPE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE_SHAPE")) {
            return new Square();
        }

        return null;
    }
}
