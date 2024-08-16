package com.xing.crm.web.controller;

import com.xing.crm.model.User;
import com.xing.crm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService userService;


    @PostMapping("/login")
    public String login(String name, String password, HttpSession session, Model model){

        User user = userService.checkLogin(name, password);
        if(user==null){
            model.addAttribute("flag","用户名或者密码错误!");
            return "login";
        }else {
            session.setAttribute("user",user);

            return "index";
        }

    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();//session失效
        return "login";
    }
  /*  @GetMapping("/register")
    public String register(){
        return "register";
    }*/



}
