package com.uv.test;
/*
 * @author uv
 * @date 2018/10/4 18:06
 *
 */

import com.uv.entity.User;
import com.uv.service.UserService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String []args) {

        String[] locations = {"applicationContext.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(locations);
        UserService userService = (UserService)context.getBean("userService");
//
        List<User> users = userService.getUsers();
        System.out.println(users.size());
//        User user = new User();
//        user.setAge(20);
//        user.setName("Tony");
//        user.setSex("男");
//        userService.insertUser("Tony", 20, "男");
    }

}
