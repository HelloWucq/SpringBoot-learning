package com.wucq.springbootdemo.controller;

import com.wucq.springbootdemo.aspect.TestAnnotation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestAspectController
 */
@RestController
@RequestMapping("/test")
public class TestAspectController {

    @TestAnnotation(name="abc")
    @RequestMapping("/show")
    public String show() {
        return "OK";
    }

    @RequestMapping("/show2")
    public String show2(){
        return "OK2";
    }
}