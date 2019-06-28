/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.factoryPattern.factory.factory;

import com.fayuan.factoryPattern.factory.operation.Operation;

/**
 * 工厂接口
 *
 * @author mr.24
 * @version Id: Factory, v 1.0 2019-06-27 23:28 Exp $$
 */
public interface Factory {
    public Operation createOperation();
}
