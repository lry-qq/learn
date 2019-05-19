package com.lry.generate.code.strategy.handler.biz;

import com.lry.generate.code.strategy.handler.AbstractHandler;
import com.lry.generate.code.strategy.handler.HandlerType;
import org.springframework.stereotype.Component;

/**
 * Created by qinqin on 2019/5/16.
 */
@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {
    @Override
    public String handle(String type) {
        return type + "-normal";
    }
}
