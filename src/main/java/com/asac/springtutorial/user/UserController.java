package com.asac.springtutorial.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("")
    public String user(Model model){
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 10);
        model.addAttribute("job","쾌걸춘향");

        return "/user/user"; // ModelAndView랑 다른점은 개발자인 나는 model만 신경쓸게!!!
    }
    @GetMapping( "/detail")
    @ResponseBody
    public User detail(){
        return new User("Aaron",10,"Developer");
    }
}
