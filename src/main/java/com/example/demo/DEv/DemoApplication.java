package com.example.demo.DEv;

import com.example.demo.DEv.Service.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        Student student = context.getBean(Student.class);
//        student.setAge(10);
//        System.out.println(student.getAge());
        //
        Dev dev = context.getBean(Dev.class);
        dev.build();

    }


}
