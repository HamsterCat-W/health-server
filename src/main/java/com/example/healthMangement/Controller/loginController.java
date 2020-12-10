package com.example.healthMangement.Controller;


import com.example.healthMangement.Entity.UserInfo;
import com.example.healthMangement.Entity.UserInfoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class loginController {
    @Autowired
    UserInfoDAO userInfoDAO;
    @RequestMapping("/login/{username}/{password}")
    public int login(@PathVariable String username,String password){


        return 1;
    }

}
