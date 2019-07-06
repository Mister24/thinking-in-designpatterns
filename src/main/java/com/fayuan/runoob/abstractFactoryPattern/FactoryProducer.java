/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.runoob.abstractFactoryPattern;

import com.fayuan.runoob.abstractFactoryPattern.factory.ColorFactory;
import com.fayuan.runoob.abstractFactoryPattern.factory.ShapeFactory;

/**
 * @author mr.24
 * @version Id: FactoryProducer, v 1.0 2019-07-06 23:35 Exp $$
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
