package com.gxz.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gxz.backend.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    List<User> queryAll();
    int addUser(User user);
    int updateUser(User user);
    int deleteUserById(int id);
}
