package com.gxz.backend;


import com.gxz.backend.entity.User;
import com.gxz.backend.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.gxz.backend.mapper")
class BackendApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void queryAllUser() {
		List<User> users = userMapper.selectList(null);
		for (User user : users) {
			System.out.println(user);
		}
	}

}
