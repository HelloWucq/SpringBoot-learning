package com.wucq.springbootdemo.controller;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.wucq.springbootdemo.entity.User;
import com.wucq.springbootdemo.service.UserService;

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

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/findUserById")
  public User findUserById(@RequestParam int id) throws Exception {
    User result= userService.findUserById(id);
    return result;
  }

  @RequestMapping(value="/findAllUsers")
  public List<User> findAllUsers() throws Exception{
    PageHelper.startPage(1,1);
    List<User> result=userService.findAllUsers();
    return result;
  }
}