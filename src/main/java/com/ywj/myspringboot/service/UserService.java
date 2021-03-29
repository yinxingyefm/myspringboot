package com.ywj.myspringboot.service;

import com.ywj.myspringboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ywj
 * @since 2021-03-28
 */
public interface UserService extends IService<User> {
    List<User> seleteByName(String name);

}
