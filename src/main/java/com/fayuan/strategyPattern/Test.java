package com.fayuan.strategyPattern;

public class Test {
    
    public static void main(String[] args) {
        bizHandler("PAY_OUT", new HandlerContext());
    }
    static void bizHandler(String id, HandlerContext context) {
        BizHandlerHolder.getBizHandler(id).handle(context);
    }
}
