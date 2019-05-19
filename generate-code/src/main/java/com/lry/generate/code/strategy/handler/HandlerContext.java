package com.lry.generate.code.strategy.handler;

import com.lry.generate.code.strategy.utils.BeanTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by qinqin on 2019/5/15.
 * <p>
 * 处理器上下文，根据类型获取相应的处理器
 */
public class HandlerContext {
    Logger logger = LoggerFactory.getLogger(HandlerContext.class);

    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type) {

        logger.info("handlerMap > " + handlerMap);

        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type: " + type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
