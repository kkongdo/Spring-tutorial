package com.asac.springtutorial.controller.user;

import com.asac.springtutorial.controller.user.dto.JobDto;
import org.springframework.web.bind.annotation.*;

@RestController // ResponseBody와 Controller를 합친 Controller이다.
@RequestMapping("/job")
public class JobController {

    // @PathVariable : GET : /job/detail/{id} = next.js에서는 Dynamic Segment라고 한다.
    // @RequestParam : GET : /job/detail?key=value = next.js에서는 SearchParams
    // @RequestBody : POST : /job/detail -> body : {...} = await request.json()

    @GetMapping("/detail/{id}")
    public JobDto job(@PathVariable Integer id, @RequestParam("p") String position, @RequestParam("i") Integer year) { // @RequestParam의 인자(value)값을 넣어주면 해당 인자 값으로 접근한다.

        return new JobDto("Aaron " + id, "Web Application Developer : " + position, "BackEnd - " + year);
    }
}
