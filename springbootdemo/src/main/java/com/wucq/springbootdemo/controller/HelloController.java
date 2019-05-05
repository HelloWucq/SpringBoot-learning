package com.wucq.springbootdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @RequestMapping("/info")
    public Map<String,String> getInfo(@RequestParam String name){
        Map<String,String> map=new HashMap<>();
        map.put("name", name);
        return map;
    }
}