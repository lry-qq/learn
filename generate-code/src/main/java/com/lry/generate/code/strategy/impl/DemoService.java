package com.lry.generate.code.strategy.impl;

import com.lry.generate.code.strategy.handler.AbstractHandler;
import com.lry.generate.code.strategy.handler.HandlerContext;
import com.lry.generate.code.strategy.handler.biz.NormalHandler;
import com.lry.generate.code.strategy.handler.biz.OkHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qinqin on 2019/5/16.
 */
@Service
public class DemoService {
    @Autowired
    HandlerContext handlerContext;

    /*
     *   使用注解方式替代if-else或者switch-case
     */
    public String handler(String type) {
        AbstractHandler handler = handlerContext.getInstance(type);

        return handler.handle(type) + "-demo";
    }

    /*
     *   正常策略模式
     */
    public String handlers(String type) {
        AbstractHandler handler = null;
        switch (type) {
            case "0":
                handler = new OkHandler();
                break;
            case "1":
                handler = new NormalHandler();
                break;
            case "2":
                handler = new OkHandler();
                break;
            default:
                handler = new NormalHandler();
                break;

        }
        return handler.handle(type);
    }
}
