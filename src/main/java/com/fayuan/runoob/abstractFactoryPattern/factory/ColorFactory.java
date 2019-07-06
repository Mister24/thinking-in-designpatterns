/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern.factory;

import com.fayuan.runoob.abstractFactoryPattern.AbstractFactory;
import com.fayuan.runoob.abstractFactoryPattern.color.Blue;
import com.fayuan.runoob.abstractFactoryPattern.color.Color;
import com.fayuan.runoob.abstractFactoryPattern.color.Green;
import com.fayuan.runoob.abstractFactoryPattern.color.Red;
import com.fayuan.runoob.abstractFactoryPattern.shape.Shape;

/**
 * @author mr.24
 * @version Id: ColorFactory, v 1.0 2019-07-06 23:32 Exp $$
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
