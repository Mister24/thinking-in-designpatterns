package com.fayuan.strategyPattern.enums;

import com.google.common.base.Enums;
import org.springframework.util.StringUtils;

public enum BizTypeEnums {
    
    PAY_OUT,
    
    OTP;
    
    BizTypeEnums getByBizType(String bizType) {
        if (StringUtils.isEmpty(bizType)) {
            return null;
        }
        
        return Enums.getIfPresent(BizTypeEnums.class, org.apache.commons.lang3.StringUtils.upperCase(bizType)).orNull();
    }
}
