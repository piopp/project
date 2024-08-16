package com.xing.crm.mapper;

import com.xing.crm.model.MonthIncome;
import com.xing.crm.model.Order;
import com.xing.crm.model.ProviderBarVo;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

/*
 * 静，谦虚谨慎，心胸宽广容纳所有好的坏的、先苦后甜
 * crm
 * 2021/4/25 16:37
 */
@Repository
public interface OrderMapper {
    int findCountByMap(Map<String,Object> map);

    List<Order> fingListByMap(Map<String,Object> map);

    void insert(Order order);

    Order findByOrderId(String id);

    void deleteByOrderId(String id);

    List<MonthIncome> getMonthIncomes();


    List<ProviderBarVo> getPie();

    void update(Order order);
}

