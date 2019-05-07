package com.wucq.springbootdemo.service;

import java.util.List;

import com.wucq.springbootdemo.entity.User;
import com.wucq.springbootdemo.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * StudentService
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int userId) throws Exception {
        User user = userMapper.findUserById(userId);
        return user;
    }

    public User findUserByName(String username) throws Exception {
        User user = userMapper.findUserByName(username);
        return user;
    }

    public void inserUser(User user) throws Exception {
        userMapper.inserUser(user);

    }

    public void deleteUserById(int userId) throws Exception {
        userMapper.deleteUserById(userId);
    }

    public void updateUser(User user) throws Exception {

        userMapper.updateUser(user);
    }

    public int saveUserBatch(List<User> list) throws Exception {
        int result=userMapper.saveUserBatch(list);
        return result;
    }

    public int delUserBatch(List<Integer> list) throws Exception {
        int result=userMapper.delUserBatch(list);
        return result;
    }
}