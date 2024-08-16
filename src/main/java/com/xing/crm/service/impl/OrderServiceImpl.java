package com.xing.crm.service.impl;

import com.xing.crm.mapper.OrderMapper;
import com.xing.crm.model.*;
import com.xing.crm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 静，谦虚谨慎，心胸宽广容纳所有好的坏的、先苦后甜
 * crm
 * 2021/4/25 16:34
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public PageResult<Order> findPageResult(Order condition, int page, int pageSize) {
        PageResult<Order> result = new PageResult<>();
        result.setCode(0);
        result.setMsg("");

        HashMap<String, Object> params = new HashMap<String,Object>();
        params.put("condition",condition);
        params.put("start", (page-1)*pageSize);
        params.put("pageSize", pageSize);
        //获取总记录
       int totalCount=orderMapper.findCountByMap(params);
       result.setCount(totalCount);
       //获取查询的结果
       List<Order> list= orderMapper.fingListByMap(params);
       result.setData(list);
       return result;
    }

    @Override
    public void save(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public Order findByOrderId(String id) {
        return orderMapper.findByOrderId(id);
    }

    @Override
    public void deleteByOrderId(String id) {
        orderMapper.deleteByOrderId(id);
    }

    @Override
    public List<MonthIncome> getMonthIncomes() {
        return orderMapper.getMonthIncomes();
    }




    @Override
    public List<PieVo> getPie() {
        List<ProviderBarVo> list = orderMapper.getPie();
        List<PieVo> pieVoList =list.stream()
                .map(e ->new PieVo(
                        e.getSale(),
                        e.getName()
                )).collect(Collectors.toList());
        return pieVoList;

    }

    @Override
    public void update(Order order) {
            orderMapper.update(order);
    }

}

/*
*



    @Override
    public void update(CourseOrder order) {
        orderMapper.update(order);
    }

    @Override
    public List<MonthIncome> getMonthIncomes() {
        return orderMapper.getMonthIncomes();
    }




    @Override
    public List<PieVo> getPie() {
        List<ProviderBarVo> list = orderMapper.getPie();
        List<PieVo> pieVoList =list.stream()
                .map(e ->new PieVo(
                        e.getSale(),
                        e.getName()
                )).collect(Collectors.toList());
        return pieVoList;

    }


    @Override
    public boolean isLogin(String name, String wecharno) {
        CourseOrder courseOrder=new CourseOrder();
        courseOrder.setName(name);
        courseOrder.setWecharno(wecharno);

        List<CourseOrder> users =orderMapper.selectUser(courseOrder);
        if(users.size()>0 ){
            return true;
        }
        return false;
    }

*/