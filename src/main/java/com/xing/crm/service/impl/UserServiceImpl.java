package com.xing.crm.service.impl;

import com.xing.crm.mapper.UserMapper;

import com.xing.crm.model.PageResult;
import com.xing.crm.model.Userm;
import com.xing.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public PageResult<Userm> findPageResult(Userm condition, int page, int pageSize) {

        PageResult<Userm> result = new PageResult<Userm>();
        result.setCode(0);
        result.setMsg("");

        HashMap<String, Object> params = new HashMap<String, Object>();

        params.put("condition", condition);
        params.put("start", (page - 1) * pageSize);
        params.put("pageSize", pageSize);

        //获取总记录数据
        int totalCount = userMapper.findCountByMap(params);
        //获取查询的数据
        List<Userm> list = userMapper.findListByMap(params);


        result.setCount(totalCount);
        result.setData(list);
        return result;
    }

    @Override
    public void save(Userm userm) {
        userMapper.insert(userm);
    }

    @Override
    public void update(Userm userm) {
        userMapper.update(userm);
    }

    @Override
    public Userm findByUserId(String id) {
        return userMapper.findByUserId(id);
    }

    @Override
    public void deleteById(String id) {
        userMapper.deleteById(id);
    }


}