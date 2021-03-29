package com.ywj.myspringboot.controller;



import com.ywj.myspringboot.entity.User;
import com.ywj.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ywj
 * @since 2021-03-28
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/show")
    public String show(Model model){
        List<User> list = userService.list();
        model.addAttribute("list",list);
        return "show";
    }
    @RequestMapping("/delete")
    public String delUser(@RequestParam Integer id){
       userService.removeById(id);
        return "redirect:/user/show";
    }

    //保存user数据
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "userAdd";
    }

    @RequestMapping("/add")
    public String add(User user) {
        userService.save(user);
        return "show";
    }

    //修改user数据
    @RequestMapping("/toEdit")
    public String toEdit(Model model, Integer id) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "userEdit";
    }

    @RequestMapping("/edit")
    //@ResponseBody
    public String edit(User user) {
        userService.saveOrUpdate(user);
        return "redirect:/user/show";
    }

}

