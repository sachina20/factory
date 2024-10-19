package com.example.demo.DEv.Controller;

import com.example.demo.DEv.Service.Laptop;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/project")
@Value
public class DevController {
    Laptop computer;

    @GetMapping("/check")
    public String check() {
        computer.compile();
        return "yes";
    }

}
