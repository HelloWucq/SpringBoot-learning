package com.wucq.springbootdemo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * HttpSessionListenerDemo
 */
@WebListener
public class HttpSessionListenerDemo implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session 被创建！");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("ServletContext被销毁！");
    }
}