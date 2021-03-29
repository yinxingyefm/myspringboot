package com.ywj.myspringboot.mapper;

import com.ywj.myspringboot.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ywj
 * @since 2021-03-28
 */
public interface UserMapper extends BaseMapper<User> {

     List<User> seleteByName(@Param("name") String name);
}
