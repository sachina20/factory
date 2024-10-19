package com.example.demo.DEv.Service;

import lombok.Value;
import org.springframework.stereotype.Component;

@Component
@Value
public class Dev {
    Desktop computer;

    public void build() {
        computer.compile();
    }
}
