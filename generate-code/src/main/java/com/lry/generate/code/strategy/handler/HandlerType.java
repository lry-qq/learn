package com.lry.generate.code.strategy.handler;

import java.lang.annotation.*;

/**
 * Created by qinqin on 2019/5/15.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {

    String value();

}
