package com.fayuan.strategyPattern;

import com.fayuan.strategyPattern.enums.BizTypeEnums;

public interface BizHandler {
    
    void handle(HandlerContext context);
    
    BizTypeEnums currentBiz();
}
