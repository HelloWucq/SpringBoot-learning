package com.wucq.springbootdemo.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WebLogTestController
 */
@RestController
@RequestMapping("/log")
public class WebLogTestController {

    @RequestMapping("/test")
    public String test() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "TEST";
    }
}