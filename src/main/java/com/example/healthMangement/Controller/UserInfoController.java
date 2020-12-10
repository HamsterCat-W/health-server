package com.example.healthMangement.Controller;

import com.example.healthMangement.Entity.UserInfo;
import com.example.healthMangement.Entity.UserInfoDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserInfoController {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserInfoDAO userInfoDAO;

    //查询全部
    @GetMapping("/user")
    public List<UserInfo> getAllStudents(){
        logger.info("========>查询userinfo表的所有数据");
        return userInfoDAO.findAll();
    }

    //id查询
    @GetMapping("/user/{userId}")
    public UserInfo getUserById(@PathVariable String userId){
        logger.info("========>查找了userId="+userId+" 的user信息");
        return userInfoDAO.findById(userId);
    }


    //插入
    @PostMapping(value = "/user/add", consumes = "application/json",produces = "application/json")
    public int insertById(@RequestBody UserInfo userInfo){
        logger.info("========>加入了userId="+userInfo.getUserId()+" 的新用户");
        return userInfoDAO.insert(userInfo);
    }

    //删除
    @DeleteMapping("/user/delete/{userId}")
    public int deleteById(@PathVariable String userId){
        logger.info("========>删除了userId="+userId+" 的用户");
        return userInfoDAO.deleteById(userId);
    }

    //修改
    @PutMapping(value = "/user/update",consumes = "application/json",produces = "application/json")
    public int update(@RequestBody UserInfo userInfo){
        logger.info("========>修改了userId="+userInfo.getUserId()+" 的用户");
        return userInfoDAO.update(userInfo);
    }




}
