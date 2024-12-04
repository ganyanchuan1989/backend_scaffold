package com.gxz.backend.controller;

import com.gxz.backend.common.ResponseInfo;
import com.gxz.backend.entity.User;
import com.gxz.backend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public ResponseInfo<List<User>> queryAll() throws Exception {
        List<User> users = userService.queryAll();
        return ResponseInfo.success(users);
    }

    @GetMapping("/test")
    public ResponseInfo test() throws Exception {
        return ResponseInfo.success("Hello");
    }
}
