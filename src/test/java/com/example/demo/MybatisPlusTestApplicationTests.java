package com.example.demo;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.User;

import mapper.UserMapper;

@SpringBootTest
class MybatisPlusTestApplicationTests {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void selectList() {
		//查詢時不需條件就設定null
		List<User> list= userMapper.selectList(null);
		list.forEach(System.out::println);
	}

//	@Test
//	public void insert() {
//		User user = new User();
//		user.setId(5);
//		user.setPassword("spy002");
//		user.setUsername("");
//		userMapper.insert(user);
//		System.out.println("新增"+user.getUsername()+"用戶成功!");
//	}
	
//	@Test
//	public void testDelete() {
//		//根據Map設定條件刪除用戶
//		Map<String, Object> usermap = new HashMap<>();
//		//刪除條件，username是他的
//		usermap.put("username", "ittttt");
//		int result= userMapper.deleteByMap(usermap);
//		System.out.println("修改行數" + result);
//	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(2);
		user.setUsername("佛傑");
		user.setPassword("Spy001");
		int result = userMapper.updateById(user);
		System.out.println("修改行數"+ result);
	}
	
	@Test
	public void testSelect() {
		System.out.println("===========================");
		//直接把該號user實體存入user
		User user = userMapper.selectById(7);
		System.out.println(user);
	}

	//根據多個ID查詢
	@Test
	public void testSelect2() {
		System.out.println("===============SpyxFamily===============");
		List<Integer> list  = Arrays.asList(2,3,7);
		List<User> spyfamily = userMapper.selectBatchIds(list);
		spyfamily.forEach(System.out::println);
	}
}
