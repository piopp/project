package com.xing.crm.service;


import com.xing.crm.model.PageResult;
import com.xing.crm.model.Userm;



public interface UserService {

    public PageResult<Userm> findPageResult(Userm condition, int page, int pageSize);


    public void save(Userm userm);


    public void update(Userm userm);


    public Userm findByUserId(String id);

    public void deleteById(String id);
}
