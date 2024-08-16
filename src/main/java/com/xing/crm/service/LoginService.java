package com.xing.crm.service;

import com.xing.crm.model.User;

public interface LoginService {


    public User checkLogin(String name, String password) ;
}
