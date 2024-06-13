package com.asac.springtutorial.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(method = RequestMethod.GET, value = "")
    public String user(Model model){
        model.addAttribute("name", "Aaron");
        model.addAttribute("age",10);

        return "user/user.html";
    }

//    @GetMapping(value = "")
//    public String user(Model model){
//        model.addAttribute("name", "Aaron");
//        model.addAttribute("age",10);
//
//        return "user/user.html";
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/detail")
    public String userDetail(Model model){
        model.addAttribute("name", "Aaron");
        model.addAttribute("age",10);
        model.addAttribute("address", "Earth");
        model.addAttribute("job","Web Application Developer");
        model.addAttribute("specialty", "BackEnd");

        return "user/user-detail.html";
    }

//    @GetMapping(value = "/detail")
//    public String userDetail(Model model){
//        model.addAttribute("name", "Aaron");
//        model.addAttribute("age",10);
//        model.addAttribute("address", "Earth");
//        model.addAttribute("job","Web Application Developer");
//        model.addAttribute("specialty", "BackEnd");
//
//        return "user/user-detail.html";
//    }
}
