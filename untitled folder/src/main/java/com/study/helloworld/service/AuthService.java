package com.study.helloworld.service;

import com.study.helloworld.annotation.Auth;
import org.springframework.stereotype.Component;

@Component
public class AuthService {

    @Auth("ALL")
    public void login(){
        System.out.println("IN LOGIN SERVICE");
    }
}
