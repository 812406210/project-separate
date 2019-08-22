package com.yangwj.separate.controller;

import com.yangwj.separate.dao.UserDao;
import com.yangwj.separate.entity.User;
import com.yangwj.separate.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RequestMapping("")
@RestController
public class UserController {
    @Resource
    UserService userService;
    @Resource
    UserDao userDao;

    @RequestMapping("getById")
    public User getUserById(HttpServletRequest request){
        String userId = request.getParameter("id");
        User user= userDao.selectById(userId);
        return user;
    }

    @RequestMapping("delById")
    public String delUserById(HttpServletRequest request){
        String userId = request.getParameter("id");
        int delRet = userService.deleteByPrimaryKey(Integer.parseInt(userId));
        System.out.println(delRet);
        return delRet+"";
    }

    @RequestMapping("add")
    public String insertUser(HttpServletRequest request){
        User user = new User();
        for (int i = 1; i < 10000; i++) {
            user.setAge(i);
            user.setId(i);
            user.setPassword("passwd"+i);
            user.setUserName("userName"+i);
            userService.insert(user);
        }
        return "success";
    }

}
