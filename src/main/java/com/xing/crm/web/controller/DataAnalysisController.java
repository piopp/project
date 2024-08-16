package com.xing.crm.web.controller;

import com.xing.crm.model.MonthIncome;
import com.xing.crm.model.PieVo;

import com.xing.crm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("dataanalysis")
public class DataAnalysisController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("income")
    public String income(){
        return "dataanalysis/income";
    }

    @RequestMapping("pie")
    public String pie(){
        return "dataanalysis/pie-custom";
    }

    @RequestMapping("monthIncomes")
    @ResponseBody
    public List<MonthIncome> monthIncomes(){
        List<MonthIncome> list=orderService.getMonthIncomes();
        return list;
    }

    @RequestMapping("/pieVo")
    @ResponseBody
    public List<PieVo> pieVo(){
        return orderService.getPie();

    }


}
