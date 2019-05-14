package com.mongodemo.controller;

import com.mongodemo.entity.UserMongo;
import com.mongodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author:devzhong
 * Date:2019/5/13 17:35
 */
@RestController
@RequestMapping("/log")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)

    public String addUs(@RequestBody UserMongo userMongo){
        userService.insert(userMongo);
        return "success";
    }
}
