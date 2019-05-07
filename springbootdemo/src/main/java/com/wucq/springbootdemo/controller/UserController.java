package com.wucq.springbootdemo.controller;

import java.util.List;

import com.wucq.springbootdemo.entity.User;
import com.wucq.springbootdemo.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
@RequestMapping("/user")
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/findUserById")
  public User findUserById(@RequestParam int id) throws Exception {
    User result= userService.findUserById(id);
    return result;
  }
}