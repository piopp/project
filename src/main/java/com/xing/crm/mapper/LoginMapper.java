package com.xing.crm.mapper;

import com.xing.crm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LoginMapper {

  public User checkLogin(@Param("name") String name,@Param("password") String password);
}
