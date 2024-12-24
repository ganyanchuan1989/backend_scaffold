package com.gxz.backend.controller;

import com.gxz.backend.common.Constants;
import com.gxz.backend.common.ResponseCodeEnums;
import com.gxz.backend.common.ResponseInfo;
import com.gxz.backend.entity.User;
import com.gxz.backend.service.IUserService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/tes2")
//    @RequestMapping(method = RequestMethod.GET, value = "/test", headers = {"content-type=text/plain","content-type=text/html"})
    public ResponseEntity<ResponseInfo> ss(){
        MultiValueMap headers = new LinkedMultiValueMap();
        headers.add("Content-Type","application/json");
        return new ResponseEntity(ResponseInfo.success("111"), headers, HttpStatusCode.valueOf(200));
    }
    @RequestMapping("/login")
    public ResponseInfo<User> login(User user, HttpSession session) throws Exception {
        if("gxz".equals(user.getUserName()) && "123".equals(user.getUserPwd())) {
            session.setAttribute(Constants.SESSION_ATT_USER, user);
            return ResponseInfo.success(user);
        } else {
            return ResponseInfo.fail(ResponseCodeEnums.NO_LOGIN.getCode(), "请先登录");
        }
    }

    @PostMapping("/logout")
    public ResponseInfo<User> logout(User user, HttpSession session) throws Exception {
        Object user1 = session.getAttribute(Constants.SESSION_ATT_USER);
        if(user1 != null) {
            session.removeAttribute(Constants.SESSION_ATT_USER);
        }
        return ResponseInfo.success(user);
    }


    @RequestMapping("/list")
    public ResponseInfo<List<User>> queryAll() throws Exception {
        List<User> users = userService.queryAll();
        return ResponseInfo.success(users);
    }

    @RequestMapping("/test")
    public ResponseInfo test() throws Exception {
        log.info("hello");
        return ResponseInfo.success("Hello");
    }

    @RequestMapping("/error")
    public ResponseInfo testError() throws Exception {
        Map<String, String> map = null;
        map.put("a","");
        return ResponseInfo.success("");
    }
}
