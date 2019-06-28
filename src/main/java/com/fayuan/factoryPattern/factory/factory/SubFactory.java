/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.factory.factory;

import com.fayuan.factoryPattern.factory.operation.Operation;
import com.fayuan.factoryPattern.factory.operation.SubOperation;

/**
 * 减法工厂
 *
 * @author mr.24
 * @version Id: SubFactory, v 1.0 2019-06-29 00:22 Exp $$
 */
public class SubFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("减法运算");
        return new SubOperation();
    }
}
