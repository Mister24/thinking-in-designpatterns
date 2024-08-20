package com.fayuan.strategyPattern.handlers;

import com.fayuan.strategyPattern.BizHandler;
import com.fayuan.strategyPattern.HandlerContext;
import com.fayuan.strategyPattern.enums.BizTypeEnums;

public abstract class AbstractBizHandler implements BizHandler {
    
    @Override
    public void handle(HandlerContext context) {
    
    }
    
    @Override
    public BizTypeEnums currentBiz() {
        return null;
    }
}
