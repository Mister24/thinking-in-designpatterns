package com.fayuan.strategyPattern;

import com.fayuan.strategyPattern.enums.BizTypeEnums;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class BizHandlerHolder implements ApplicationContextAware, InitializingBean {
    
    @Setter
    private ApplicationContext applicationContext;
    
    private static Map<BizTypeEnums, BizHandler> handlers;
    
    @Override
    public void afterPropertiesSet() throws Exception {
        handlers = this.applicationContext.getBeansOfType(BizHandler.class).values().stream()
                .collect(Collectors.toMap(BizHandler::currentBiz, v -> v));
    }
    
    public static BizHandler getBizHandler(String biz) {
        return Optional.ofNullable(handlers.get(BizTypeEnums.valueOf(biz)))
                .orElseThrow(() -> new RuntimeException(String.format("wrong type of %s", biz)));
    }
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    
    }
    
}
