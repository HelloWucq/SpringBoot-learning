package com.wucq.springbootdemo.mapper;

import java.util.List;

import com.wucq.springbootdemo.entity.User;

/**
 * UserDao
 */
public interface UserMapper {

    public User findUserById(int userId) throws Exception;

    public User findUserByName(String username) throws Exception; 

    public void inserUser(User user) throws Exception;
    
    public List<User> findAllUsers()throws Exception;

    public void deleteUserById(int userId) throws Exception;

    public void updateUser(User user) throws Exception;

    public int saveUserBatch(List<User> list) throws Exception;

    public int delUserBatch(List<Integer>list) throws Exception;
    
}