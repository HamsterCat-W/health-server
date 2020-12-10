package com.example.healthMangement.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@CrossOrigin 下面这个类跨域
@RestController
public class testController {
    @CrossOrigin
    //下面这个方法跨域
    @RequestMapping("/test")
    public String test(){
        return "welcome";
    }
}
