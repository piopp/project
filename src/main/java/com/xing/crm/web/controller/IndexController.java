package com.xing.crm.web.controller;

import com.xing.crm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/login2")
    public String login2(String name,String password){
     /*   User user = new User(name,password);*/
        return "login2";
    }


}
