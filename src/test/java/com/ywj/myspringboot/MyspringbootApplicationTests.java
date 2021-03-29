package com.ywj.myspringboot;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ywj.myspringboot.entity.User;
import com.ywj.myspringboot.mapper.UserMapper;
import com.ywj.myspringboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MyspringbootApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        System.out.println(userService.list(null));
    }
    @Test
    void addUser(){

        User user=new User();
        user.setName("gg");
        user.setAge(12);
        user.setEmail("2100435028@qq.com");
       // int insert = userMapper.insert(user);
        userService.save(user);


    }
    @Test
    void saveOrUpdate(){
        User user=new User();
       // user.setId((long) 1);
        user.setName("gg");
        user.setAge(12);
        user.setEmail("2100435028@qq.com");
        userService.saveOrUpdate(user);
    }
    @Test
    void delUSer(){
       // int i = userMapper.deleteById(6);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        boolean b = userService.removeByIds(list);
        System.out.println("删除成功"+b);

    }

    @Test
    public void testPage(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("age",12);
        Page<User> page = new Page<>(1,2);
        IPage<User> userIPage = userMapper.selectPage(page, userQueryWrapper);
        userIPage.getRecords().forEach(System.out::println);
    }
    @Test
    public void myselect(){
       List<User> aa = userMapper.seleteByName("aa");
        //List<User> aa = userService.seleteByName("aa");
        System.out.println(aa);
    }

}
