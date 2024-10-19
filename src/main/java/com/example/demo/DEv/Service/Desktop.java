package com.example.demo.DEv.Service;

import com.example.demo.DEv.Computer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Primary
@Service("desktop")
@Component
public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.println("Compiling Faster in desktop");
    }
}
