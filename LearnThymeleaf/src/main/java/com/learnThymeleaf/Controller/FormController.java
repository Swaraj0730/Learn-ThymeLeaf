package com.learnThymeleaf.Controller;

import com.learnThymeleaf.Model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    //handler method to handle user registration page request
    @GetMapping("register")
    public String userRegistrationPage(Model model){

        //empty user model object to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm) ;

        List<String> listProfession = Arrays.asList("developer","tester","architect");
        model.addAttribute("listProfession",listProfession);
        return "register-form";
    }

    //handler method to control user registration form submission request
    @PostMapping("register/save")
    public String submitForm(Model model ,
                             @ModelAttribute("userForm") UserForm userForm){

        model.addAttribute("userForm",userForm);
        return "register-successful";
    }
}
