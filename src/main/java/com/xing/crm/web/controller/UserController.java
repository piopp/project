package com.xing.crm.web.controller;

import com.xing.crm.model.CURDResult;

import com.xing.crm.model.PageResult;
import com.xing.crm.model.Userm;
import com.xing.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userm")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/ulist")
    public String list(){
        return "/userm/list";
    }


    @RequestMapping("/listJson")
    @ResponseBody
    public PageResult<Userm> listJson(Userm condition, int page, int limit){
        PageResult<Userm> result = userService.findPageResult(condition,page,limit);
        return result;
    }


    @RequestMapping("/add")
    public String add(){
        return "/userm/add";
    }

    @RequestMapping("/save")
    @ResponseBody
    public CURDResult save(Userm userm){
        CURDResult result = new CURDResult();

            userService.save(userm);

        return result;
    }

    @RequestMapping("/save1")
    @ResponseBody
    public CURDResult save1(Userm userm){
        CURDResult result = new CURDResult();

            userService.update(userm);

        return result;
    }





    @RequestMapping("/delete")
    @ResponseBody
    public CURDResult delete(String id){
        CURDResult result = new CURDResult();
        userService.deleteById(id);
        return result;
    }




    @RequestMapping("/edit")
    public String edit(Model model,String id){
        Userm userm= userService.findByUserId(id);
        model.addAttribute("userm",userm);

        return "userm/edit";
    }




}
