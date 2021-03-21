package com.legend.mapper;

import com.legend.common.MyMapper;
import com.legend.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;



@Mapper
public interface UserMapper extends MyMapper<User> {
    //第一种方式，注解sql，方便，但维护性略差
    @Select("select * from users")
    List<User> selectAll();

    //第二种方式，xml方式，易维护
    int save(User user);

    //第三种方式：通用mapper，本身提供了很多现成的增删改查sql；例如：int deleteByPrimaryKey()
}
