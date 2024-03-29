package com.legend.service;

import com.legend.domain.User;
import com.legend.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    //第一种方式对应的Service
    public List<User> listAll() {
        return userMapper.selectAll();
    }

    //第二种方式对应的Service
    public int saveUser(User user) {
        return userMapper.save(user);
    }
}

