package com.example.healthMangement.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserInfoDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询全部
    public List<UserInfo> findAll() {
        return jdbcTemplate.query("select * from userinfo", new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
    }

    //根据ID进行查询
    public UserInfo findById(String id) {
        return jdbcTemplate.queryForObject("select * from userinfo where userId=?", new Object[]{id}, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
    }

    //根据用户名和密码查询
    public UserInfo getUserInfo(String username,String password){
        return jdbcTemplate.queryForObject("select * from userinfo where username=? and password=?",new Object[]{username,password},new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
    }

    //根据ID进行删除操作
    public int deleteById(String id) {
        return jdbcTemplate.update("delete from userinfo where userId=?", new Object[]{id});
    }

    //根据ID进行插入操作
    public int insert(UserInfo user) {

        return jdbcTemplate.update("INSERT INTO userinfo (userId,username,password,email,tel,userRole,userState) VALUES (?,?,?,?,?,?,?)",
                new Object[]{
                        user.getUserId(),
                        user.getUsername(),
                        user.getPassword(),
                        user.getEmail(),
                        user.getTel(),
                        user.getUserRole(),
                        user.getUserState()
                });
    }

    //根据ID进行更新操作
    public int update(UserInfo user) {
        return jdbcTemplate.update("update userinfo set username=?,password=?,email=?,tel=?,userRole=?,userState=? where userId=?",
                new Object[]{
                        user.getUsername(),
                        user.getPassword(),
                        user.getEmail(),
                        user.getTel(),
                        user.getUserRole(),
                        user.getUserState(),
                        user.getUserId()
                });
    }
}
