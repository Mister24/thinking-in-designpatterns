/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.factory.factory;

import com.fayuan.factoryPattern.factory.operation.Operation;
import com.fayuan.factoryPattern.factory.operation.DivOperation;

/**
 * 除法工厂
 *
 * @author mr.24
 * @version Id: DivFactory, v 1.0 2019-06-29 00:24 Exp $$
 */
public class DivFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("除法运算");
        return new DivOperation();
    }
}
