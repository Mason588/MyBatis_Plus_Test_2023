package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
	@TableId(
			value="id",
			 type =
			 IdType.AUTO)
	int id;
	String username;
	String password;
}
