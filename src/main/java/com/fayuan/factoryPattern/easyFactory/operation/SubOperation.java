/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.easyFactory.operation;

/**
 * 减法操作
 *
 * @author mr.24
 * @version Id: SubOperation, v 1.0 2019-06-27 22:13 Exp $$
 */
public class SubOperation implements Operation {
    @Override
    public double getResult(double num1, double num2) throws Exception {
        return num1 - num2;
    }
}
