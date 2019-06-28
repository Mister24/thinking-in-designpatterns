/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.factory.factory;

import com.fayuan.factoryPattern.factory.operation.AddOperation;
import com.fayuan.factoryPattern.factory.operation.Operation;

/**
 * 加法工厂
 *
 * @author mr.24
 * @version Id: AddFactory, v 1.0 2019-06-29 00:20 Exp $$
 */
public class AddFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("加法运算");
        return new AddOperation();
    }
}
