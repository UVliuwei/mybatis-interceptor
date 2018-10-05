package com.uv.service;

import com.uv.dao.UserMapper;
import com.uv.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @author liuwei
 * @date 2018/10/4 18:02
 *
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(String name, int age, String sex) {
        userMapper.insertUser(name, age, sex);
    }

    public List<User> getUsers() {
        return userMapper.getUsers();
    }

}
