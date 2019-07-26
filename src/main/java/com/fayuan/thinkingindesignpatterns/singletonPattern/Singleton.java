/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.thinkingindesignpatterns.singletonPattern;

/**
 * 单例模式，线程安全
 *
 * @author mr.24
 * @version Id: Singleton, v 1.0 2019-07-26 21:59 Exp $$
 */
public class Singleton {
    public static final Singleton singleton = new Singleton();

    /**
     * 禁止产生多个对象
     */
    private Singleton() {}

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void doSomething() {}
}
