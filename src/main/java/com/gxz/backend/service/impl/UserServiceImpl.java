package com.gxz.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gxz.backend.entity.User;
import com.gxz.backend.mapper.UserMapper;
import com.gxz.backend.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<User> queryAll() {
//        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(User::getId, 0);
        return baseMapper.selectList(null);
    }

    @Override
    public int addUser(User user) {
        return baseMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("id", user.getId());
        return baseMapper.update(user, updateWrapper);
    }

    @Override
    public int deleteUserById(int id) {
        return baseMapper.deleteById(id);
    }
}
