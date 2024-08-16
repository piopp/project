package com.xing.crm.service.impl;

import com.xing.crm.mapper.ProviderMapper;
import com.xing.crm.model.PageResult;
import com.xing.crm.model.Provider;
import com.xing.crm.model.Provider;
import com.xing.crm.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/*
 * 静，谦虚谨慎，心胸宽广容纳所有好的坏的
 * crm
 * 2021/4/24
 */

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderMapper providerMapper;
    @Override
    public PageResult<Provider> findPageResult(Provider condition, int page, int pageSize) {
        PageResult<Provider> result = new PageResult<Provider>();
        result.setCode(0);
        result.setMsg("");

        HashMap<String, Object> params = new HashMap<String, Object>();

        params.put("condition", condition);
        params.put("start", (page - 1) * pageSize);
        params.put("pageSize", pageSize);

        //获取总记录数据
        int totalCount = providerMapper.findCountByMap(params);
        //获取查询的数据
        List<Provider> list = providerMapper.findListByMap(params);


        result.setCount(totalCount);
        result.setData(list);
        return result;
    }

    @Override
    public void save(Provider provider) {
        providerMapper.insert(provider);
    }

    @Override
    public Provider findByProviderId(String id) {
       return providerMapper.findByProviderId(id);
    }

    @Override
    public void update(Provider provider) {
        providerMapper.update(provider);
    }

    @Override
    public void deleteById(String id) {
        providerMapper.deleteById(id);
    }


}
