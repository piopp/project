package com.xing.crm.web.controller;

import com.xing.crm.model.CURDResult;
import com.xing.crm.model.PageResult;
import com.xing.crm.model.Provider;
import com.xing.crm.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 静，谦虚谨慎，心胸宽广容纳所有好的坏的
 * crm
 * 2021/4/24
 */
@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping("/plist")
    public String plist(){
        return "/provider/list";
    }



    @RequestMapping("/plistJson")
    @ResponseBody
    public PageResult<Provider> listJson(Provider condition, int page, int limit){
        PageResult<Provider> result = providerService.findPageResult(condition,page,limit);
        return result;
    }

    @RequestMapping("/add")
    public String add(){
        return "/provider/add";
    }

    @RequestMapping("/save")
    @ResponseBody
    public CURDResult save(Provider provider){

        CURDResult result = new CURDResult();
        providerService.save(provider);
        return result;
    }

    @RequestMapping("/edit")
    public String edit(String id, Model model){
       Provider provider= providerService.findByProviderId(id);
       model.addAttribute("provider",provider);
        return "/provider/edit";
    }

    @RequestMapping("/update")
    @ResponseBody
    public CURDResult update(Provider provider){
        CURDResult result = new CURDResult();
        providerService.update(provider);
        return result;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public CURDResult delete(String id){
        CURDResult result = new CURDResult();
        providerService.deleteById(id);
        return result;
    }

}

