package com.bee.sample.ch1.controller;

import com.bee.sample.ch1.entity.User;
import com.bee.sample.ch1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloworldController {

    @Autowired UserService userService;

    @RequestMapping("/say.html")
    public @ResponseBody String say(@RequestParam String args){
        //参数必须为args
        return "hello world !";
    }

    @GetMapping(path = "/{userId}/get.html")
    public String getUser(@PathVariable String userId, Model model){
        User userinfo = userService.getUserById(userId);
        model.addAttribute("user",userinfo);
        return "/userInfo.html";
    }
}
