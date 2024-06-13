package com.asac.springtutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

// @Controller : 클래스 내부에 API에 대한 처리를 위한 메서드를 갖는다. API와 mapping을 시키는 역할이다.
@Controller
public class indexController {

    // @RequestMapping : 어떤 요청에 대해 처리할 것인지
    // method : get, post가 들어간다.
    // value : url이 들어간다.

    // 반환할 수 있는 방법은 두가지가 있다.
    // 1. ModelAndView ModelAndView는 View템플릿에 Model을 넣는 것을 의미한다.
    // 2. String

    @RequestMapping(method = RequestMethod.GET, value = "/a-side")
    @ResponseBody // 내가 반환하는 것은 전부 데이터로 반환하겠습니다. 라는 의미 ResponseBody를 쓰지 않으면 페이지를 반환한다.
    public ModelAndView indexA(){
//        1. 첫번쨰 방식
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("tester.html");
//        2. 두번째 방식
        ModelAndView modelAndView = new ModelAndView("tester.html");
        modelAndView.addObject("name","Aaron");
        modelAndView.addObject("age",10);

        return modelAndView;
//        return "tester.html"; // tester.html 이라고 하는 View Template을 /templates/ 안에서 찾아줘, 이 String은 View Template 명칭이구나.
    }

    @RequestMapping(method = RequestMethod.GET, value = "/b-side")
    public String indexB(Model model){ // ModelMap과 차이점이 없다.
        model.addAttribute("name","Baron");
        model.addAttribute("age",10);
        return "tester.html";
    }
}
