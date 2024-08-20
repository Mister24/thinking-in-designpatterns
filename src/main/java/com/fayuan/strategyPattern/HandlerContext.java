package com.fayuan.strategyPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HandlerContext {
    
    /**
     * in
     */
    private Object input;
    
    /**
     * out
     */
    private Object output;
}
