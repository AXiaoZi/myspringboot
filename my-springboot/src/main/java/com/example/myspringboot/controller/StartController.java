package com.example.myspringboot.controller;

import com.example.myspringboot.entity.User;
import com.example.myspringboot.result.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/start")
@Slf4j
public class StartController {
    @RequestMapping("/springboot")
    public String startSpringBoot() {
        return "Welcome to the world of Spring Boot!";
    }


    @GetMapping("/user")
    public JsonResult<User> getUser() {
        User user = new User(1, "倪升武", "123456");
        return new JsonResult<>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List<User>> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "倪升武", "123456");
        User user2 = new User(2, "达人课", "123456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList, "获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map<String, Object>> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User(1, "倪升武", null);
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 4153);
        return new JsonResult<>(map);
    }


    @RequestMapping("/log")
    public String testLog() {
        log.debug("debug");
        log.info("info");
        log.error("error");
        log.warn("warn");

        // 可以使用占位符打印出一些参数信息
        String str1 = "blog.itcodai.com";
        String str2 = "blog.csdn.net/eson_15";
        log.info("======倪升武的个人博客：{}；倪升武的CSDN博客：{}", str1, str2);

        return "success";
    }

    @Value("${url.myUrl}")
    private String url;

    @GetMapping("/url")
    public String getUrl(){
        log.info(url);
        return url;
    }
}
