package com.lry.generate.code.strategy.controller;

import com.lry.generate.code.strategy.impl.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinqin on 2019/5/16.
 */
@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping
    public String mydemo(@RequestParam("type") String type) {
        return demoService.handlers(type);
    }
}
