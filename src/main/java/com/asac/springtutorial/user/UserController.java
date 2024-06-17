package com.asac.springtutorial.user;

import com.asac.springtutorial.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor // 1. 생성자 주입 (Constructor Injection, Spring 공식 추천)
// @RequiredArgsConstructor  : setter로 접근하지 못함, 생성자로만 접근이 가능하다. 생성자로만 init할 수 있다.
// final이 붙은 필드만 사용한다.
public class UserController {

    // 1. 생성자 주입 (Constructor Injection, Spring 공식 추천)
    private final UserService userService; // final을 사용한다.

    // 2. 필드 주입 (Property Injection)
//    @Autowired
//    private UserService userService;
    // 3. 수정자 주입 ((Setter) Method Injection)
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService){
//        this.userService = userService;
//    }

//    @GetMapping("")
//    public String user(Model model){
//        model.addAttribute("name", "홍길동");
//        model.addAttribute("age", 10);
//        model.addAttribute("job","쾌걸춘향");
//
//        return "/user/user"; // ModelAndView랑 다른점은 개발자인 나는 model만 신경쓸게!!!
//    }

    @GetMapping( "/detail")
    public User detail(){
        return userService.getUser(1);
    }

}
