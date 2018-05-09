package com.note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getuser")
    @ResponseBody
    private String getUser(){

        return "wzcc";
    }
    private int getAge(){

        return 1;
    }
}
