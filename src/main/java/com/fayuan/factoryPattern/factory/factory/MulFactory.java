/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.factory.factory;

import com.fayuan.factoryPattern.factory.operation.MulOperation;
import com.fayuan.factoryPattern.factory.operation.Operation;

/**
 * 乘法工厂
 *
 * @author mr.24
 * @version Id: MulFactory, v 1.0 2019-06-29 00:23 Exp $$
 */
public class MulFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("乘法运算");
        return new MulOperation();
    }
}
