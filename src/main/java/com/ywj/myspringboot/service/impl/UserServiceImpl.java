package com.ywj.myspringboot.service.impl;

import com.ywj.myspringboot.entity.User;
import com.ywj.myspringboot.mapper.UserMapper;
import com.ywj.myspringboot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ywj
 * @since 2021-03-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> seleteByName(String name) {

        return userMapper.seleteByName(name);
    }
}
