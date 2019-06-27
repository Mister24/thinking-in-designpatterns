/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.easyFactory;

import com.fayuan.factoryPattern.easyFactory.impl.AddOperation;
import com.fayuan.factoryPattern.easyFactory.impl.DivOperation;
import com.fayuan.factoryPattern.easyFactory.impl.MulOperation;
import com.fayuan.factoryPattern.easyFactory.impl.SubOperation;

/**
 * @author mr.24
 * @version Id: EasyFactory, v 1.0 2019-06-27 22:39 Exp $$
 */
public class EasyFactory {
    public static Operation createOperation(String name) {
        Operation operation = null;
        switch (name) {
            default:
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
        }

        return operation;
    }
}
