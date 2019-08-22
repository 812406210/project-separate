package com.yangwj.separate.service.serviceImpl;

import com.yangwj.separate.dao.UserDao;
import com.yangwj.separate.entity.User;
import com.yangwj.separate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public Integer insert(User record) {
        return userDao.insert(record);
    }
}
