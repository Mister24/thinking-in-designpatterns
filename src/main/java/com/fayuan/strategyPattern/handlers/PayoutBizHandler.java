package com.fayuan.strategyPattern.handlers;

import com.fayuan.strategyPattern.HandlerContext;
import com.fayuan.strategyPattern.enums.BizTypeEnums;
import org.springframework.stereotype.Component;

@Component
public class PayoutBizHandler extends AbstractBizHandler {
    
    @Override
    public void handle(HandlerContext context) {
        System.out.println(this.currentBiz());
    }
    
    @Override
    public BizTypeEnums currentBiz() {
        return BizTypeEnums.PAY_OUT;
    }
}
