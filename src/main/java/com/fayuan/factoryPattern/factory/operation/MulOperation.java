/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.factory.operation;

/**
 * 乘法操作
 *
 * @author mr.24
 * @version Id: MulOperation, v 1.0 2019-06-27 22:14 Exp $$
 */
public class MulOperation implements Operation {
    @Override
    public double getResult(double num1, double num2) throws Exception {
        return num1 * num2;
    }
}