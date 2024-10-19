package com.example.demo.DEv.Service;

import com.example.demo.DEv.Computer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class Laptop implements Computer {
    Laptop(){
        System.out.println("Laptop class is initialized");
    }
    @Override
    public void compile(){
        System.out.println("compiling is slow in laptop ");
    }
}
