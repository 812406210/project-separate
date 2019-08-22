package com.yangwj.separate.service;

import com.yangwj.separate.entity.User;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    Integer insert(User record);
}
