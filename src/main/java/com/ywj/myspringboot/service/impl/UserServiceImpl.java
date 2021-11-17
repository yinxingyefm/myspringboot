package com.ywj.myspringboot.service.impl;

import com.ywj.myspringboot.entity.User;
import com.ywj.myspringboot.mapper.UserMapper;
import com.ywj.myspringboot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ywj
 * @since 2021-07-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
