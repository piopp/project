package com.xing.crm.service;

import com.xing.crm.model.PageResult;
import com.xing.crm.model.Provider;

/*
 * 静，谦虚谨慎，心胸宽广容纳所有好的坏的
 * crm
 * 2021/4/24
 */
public interface ProviderService {

    PageResult<Provider> findPageResult(Provider condition, int page, int limit);

    void save(Provider provider);

    Provider findByProviderId(String id);

    void update(Provider provider);

    void deleteById(String id);
}
