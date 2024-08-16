package com.xing.crm.web.controller;


import com.xing.crm.model.CURDResult;
import com.xing.crm.model.Order;
import com.xing.crm.model.PageResult;
import com.xing.crm.model.Provider;
import com.xing.crm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("save")
    @ResponseBody
    public CURDResult save(Order order){
        CURDResult result = new CURDResult();
        orderService.save(order);
        return result;
    }
    @RequestMapping("/update")
    @ResponseBody
    public CURDResult update(Order order){
        CURDResult result = new CURDResult();
        orderService.update(order);
        return result;
    }

    @RequestMapping("/list")
    public String list(){
        return "order/list";
    }




    @RequestMapping("/listJson")
    @ResponseBody
    //order condition为了查询而来
    //用PageResult 里面的四个值接收
    // code 状态码 成功与否
    //msg 成功失败后返回的信息
    //count 查询到的总条数
    //data json格式的所有查到的数据对象
    public PageResult<Order> listJson(Order condition,int page,int limit){
        PageResult<Order> result = orderService.findPageResult(condition,page,limit);
        return result;
    }

    @RequestMapping("/add")
    public String add(){
        return "order/add";
    }

    @RequestMapping("/edit")
    public String edit(Model model, String id){
        Order order= orderService.findByOrderId(id);
        model.addAttribute("order",order);
        return "/order/edit";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public CURDResult delete(String id){
        CURDResult result = new CURDResult();
        orderService.deleteByOrderId(id);
        return result;

    }






}
