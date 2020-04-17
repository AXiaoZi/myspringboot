package com.example.myspringboot.controller;

import com.example.myspringboot.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: myspringboot
 * @Package: com.example.myspringboot.controller
 * @ClassName: UserCount
 * @Author: MaCheng
 * @Description:
 * @Date: 2020/4/17 14:24
 * @Version: 1.0
 */

@RestController
@RequestMapping("/user")
public class UserCount {


    @GetMapping("count")
    public int getUserCount(){
        User user = new User();
        return user.getId();
    }

}
