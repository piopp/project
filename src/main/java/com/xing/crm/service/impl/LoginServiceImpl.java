package com.xing.crm.service.impl;

import com.xing.crm.mapper.LoginMapper;
import com.xing.crm.model.User;
import com.xing.crm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User checkLogin(String name, String password) {

        return loginMapper.checkLogin(name, password);
    }
}

