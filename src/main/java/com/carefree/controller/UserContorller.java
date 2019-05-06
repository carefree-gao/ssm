package com.carefree.controller;


import com.carefree.model.User;
import com.carefree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserContorller {

    @Autowired
    UserService userService;

    @RequestMapping(value = "findList",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Object fingList() {

        return userService.findList(1,9);
    }



    @RequestMapping(value = "index")
    public String findLists() {


        return "index";
    }
}
