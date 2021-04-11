package com.y.test;

import com.y.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Test1 {
    @Autowired
    private UserRepository userRepository;
    public void test(){
        System.out.println(userRepository.findAll());
    }
}
