package com.xing.crm.service;

import com.xing.crm.model.MonthIncome;
import com.xing.crm.model.Order;
import com.xing.crm.model.PageResult;
import com.xing.crm.model.PieVo;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * 静，谦虚谨慎，心胸宽广容纳所有好的坏的、先苦后甜
 * crm
 * 2021/4/25 16:21
 */

public interface OrderService {
    PageResult<Order> findPageResult(Order condition, int page, int pageSize);

    void save(Order order);

    Order findByOrderId(String id);

    void deleteByOrderId(String id);

    List<MonthIncome> getMonthIncomes();

    List<PieVo> getPie();

    void update(Order order);
}
/*
*

   public List<MonthIncome> getMonthIncomes();

   public boolean isLogin(String name, String wecharno);

   public List<PieVo> getPie();*/