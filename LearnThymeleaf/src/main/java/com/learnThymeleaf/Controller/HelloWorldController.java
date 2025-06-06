package com.learnThymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    //http://localhost:8081/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(Model model){
        model.addAttribute("message","hello world");
        model.addAttribute("message1","my name is swaraj ");
        return "hello-world" ;
    }
}
