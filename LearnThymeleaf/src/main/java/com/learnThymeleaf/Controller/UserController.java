package com.learnThymeleaf.Controller;

import com.learnThymeleaf.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handle variable expression request

    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("swaraj","123@gmail.com",
                "teach lead", "M");
        model.addAttribute("user",user) ;

        return "variable-expression";
    }

    //handler method to handle selection expression

    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user = new User("abhipsa","234@gmail.com" ,"Hr","F") ;
        model.addAttribute("user",user);
        return "selection-expression";

    }

    //handler method to manage expression request
    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }

    //handler method to handle link expression
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression" ;
    }

    //handler method to handle fragment expression
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model){
        User admin = new User("admin","567@gmail.com","klp","M");
        User swaraj = new User("swaraj","123@gmail.com",
                "teach lead", "M");
        User abhipsa = new User("abhipsa","234@gmail.com" ,"Hr","F") ;
        List<User> list = new ArrayList<>();
        list.add(admin);
        list.add(swaraj);
        list.add(abhipsa);
        model.addAttribute("users",list);
        return "users";
    }

    // handler method
    @GetMapping("/if-unless")
    public String ifUnless(Model model){
        User admin = new User("admin","567@gmail.com","klp","M");
        User swaraj = new User("swaraj","123@gmail.com",
                "teach lead", "M");
        User abhipsa = new User("abhipsa","234@gmail.com" ,"Hr","F") ;
        List<User> list = new ArrayList<>();
        list.add(admin);
        list.add(swaraj);
        list.add(abhipsa);
        model.addAttribute("users",list);
        return "if-unless";
    }

    @GetMapping("switch-case")
    public String switchCase(Model model){
        User user = new User(
                "swaraj",
                "ramesh@gmail.com",
                "admin",
                "M"
        );
        model.addAttribute("users",user) ;
        return "switch-case";
    }
}
