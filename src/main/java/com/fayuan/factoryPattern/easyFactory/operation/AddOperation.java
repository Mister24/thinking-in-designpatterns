/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.easyFactory.operation;

/**
 * 加法操作
 *
 * @author mr.24
 * @version Id: AddOperation, v 1.0 2019-06-27 22:12 Exp $$
 */
public class AddOperation implements Operation {
    @Override
    public double getResult(double num1, double num2) throws Exception {
        return num1 + num2;
    }
}
