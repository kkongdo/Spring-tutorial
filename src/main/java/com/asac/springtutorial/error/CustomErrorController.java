package com.asac.springtutorial.error;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController implements ErrorController {
    @RequestMapping(method = RequestMethod.GET, value = "/error")
    public ModelAndView handleError(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        Integer statusCode = Integer.valueOf(status.toString());

        if(statusCode == HttpStatus.NOT_FOUND.value()){
            modelAndView.addObject("status", statusCode);
            modelAndView.addObject("type", HttpStatus.NOT_FOUND.getReasonPhrase());
        }else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()){
            modelAndView.addObject("status", statusCode);
            modelAndView.addObject("type", HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
        // return "/custom/error"
        modelAndView.setViewName("/custom/error");
        return modelAndView;
    }
}
