package com.asac.springtutorial.controller.user;

import com.asac.springtutorial.controller.user.dto.JobRequestDto;
import com.asac.springtutorial.controller.user.dto.JobResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController // ResponseBody와 Controller를 합친 Controller이다.
@RequestMapping("/job")
public class JobController {

    // @PathVariable : GET : /job/detail/{id} = next.js에서는 Dynamic Segment라고 한다.
    // @RequestParam : GET : /job/detail?key=value = next.js에서는 SearchParams
    // @RequestBody : POST : /job/detail -> body : {...} = await request.json()

//    @GetMapping("/detail/{id}")
//    public JobDto job(@PathVariable(value = "id") Integer id, @RequestParam(required = false, value = "p") String position,
//                      @RequestParam(required = false, value="i") Integer year) { // @RequestParam의 인자(value)값을 넣어주면 해당 인자 값으로 접근한다.
//
//        return new JobDto("Aaron " + id, "Web Application Developer : " + position, "BackEnd - " + year);
//    }

    @PostMapping("/detail/{id}")
    public JobResponseDto job(@PathVariable(value = "id") Integer id,
                              //@ModelAttribute JobRequestDto dto,
                              @RequestBody JobRequestDto dto) {
        return new JobResponseDto("Aaron " + id, "Web Application Developer : " + dto.getPosition(),
                "BackEnd - " + dto.getYear());
    }
}

//@Controller
//@RequestMapping(method = RequestMethod.GET,value = "/") // method 단위
//@RequestMapping("/user") // 클래스 단위
//ModelAndView // 클래스(구현체)
//ModelMap // 클래스(구현체)
//Model // 인터페이스 (다형성) : 수많은 구현체를 커버할 수 있어서
//// 우리가 객체를 생성하는가? 아니 그럼 누가? Spring이 생성해준다. Spring이 생성해준 객체가 바로 Spring Bean !!!
//// - 인터페이스 기반의 Spring Bean을 사실상의 표준 : Best practice
//@ResponseBody
//@RestController
//@@RestControllerAdvice
//@GetMapping
//@PostMapping
//@PathVariable -parameters 명시를 해줘야한다는 오류가 뜬다면 @PathVariable("id") Integer id
//@RequestParam // required = false 명시 필요
//@ModelAttribute // required = false 명시 불필요 (그냥 값이 없으면 알아서 null 반환)
//@RequestBody + @ResponseBody