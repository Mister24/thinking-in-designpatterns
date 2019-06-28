/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.factory;

import com.fayuan.factoryPattern.factory.factory.Factory;
import com.fayuan.factoryPattern.factory.operation.Operation;


/**
 * 客户端
 *
 * @author mr.24
 * @version Id: Client, v 1.0 2019-06-29 00:27 Exp $$
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1. 使用反射机制实例化工厂对象
        Factory addFactory = (Factory) Class.forName("com.fayuan.factoryPattern.factory.factory.AddFactory").newInstance();
        Factory subFactory = (Factory) Class.forName("com.fayuan.factoryPattern.factory.factory.SubFactory").newInstance();

        // 2. 通过工厂对象创建相应实例对象
        Operation addOperation = addFactory.createOperation();
        Operation subOperation = subFactory.createOperation();

        System.out.println(addOperation.getResult(1, 1));
        System.out.println(subOperation.getResult(2, 1));
    }
}
