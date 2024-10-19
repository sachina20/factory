package com.example.demo.DEv.Controller;

import lombok.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/feature")
@Service
@Value
public class FeatureController {
    @GetMapping("/fetch")
    public String FeatureFetch(){
        return "Computer Is a electronic device";
    }
}
