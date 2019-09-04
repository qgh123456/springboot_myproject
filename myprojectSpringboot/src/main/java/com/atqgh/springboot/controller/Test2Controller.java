package com.atqgh.springboot.controller;

import com.atqgh.springboot.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiguohui
 * @date 2019-09-03 18:25
 * @Description
 */
@Controller
public class Test2Controller {

    @RequestMapping("/tt")
    @ResponseBody
    public String tt(@Validated Student student){
        System.out.println(student.toString());
        return student.toString();
    }
    @RequestMapping("/tt2")
    @ResponseBody
    public String tt2(Student student){
        System.out.println("22222222222222");
        return "22222222222222222";
    }
    @RequestMapping("/tt3")
    @ResponseBody
    public String tt3(Student student){
        System.out.println("333333333333333");
        return "33333333333";
    }
}
