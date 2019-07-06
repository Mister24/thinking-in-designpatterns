/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern.factory;

import com.fayuan.runoob.abstractFactoryPattern.AbstractFactory;
import com.fayuan.runoob.abstractFactoryPattern.color.Color;
import com.fayuan.runoob.abstractFactoryPattern.shape.Circle;
import com.fayuan.runoob.abstractFactoryPattern.shape.Rectangle;
import com.fayuan.runoob.abstractFactoryPattern.shape.Shape;
import com.fayuan.runoob.abstractFactoryPattern.shape.Square;

/**
 * @author mr.24
 * @version Id: ShapeFactory, v 1.0 2019-07-07 00:11 Exp $$
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
