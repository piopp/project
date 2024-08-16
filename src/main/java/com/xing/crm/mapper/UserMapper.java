package com.xing.crm.mapper;

import com.xing.crm.model.Userm;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserMapper {
   public int findCountByMap(HashMap<String, Object> params);

   public  List<Userm> findListByMap(HashMap<String, Object> params);

   public void insert(Userm userm);


   public void update(Userm userm);

   public  Userm findByUserId(String id);

   public void deleteById(String id);
}
