package com.xing.crm.mapper;

import com.xing.crm.model.Provider;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/*
 * 静，谦虚谨慎，心胸宽广容纳所有好的坏的
 * crm
 * 2021/4/24
 */
@Repository
public interface ProviderMapper {
    int findCountByMap(HashMap<String, Object> params);

    List<Provider> findListByMap(HashMap<String, Object> params);

    void insert(Provider provider);

    Provider findByProviderId(String id);

    void update(Provider provider);

    void deleteById(String id);
}
