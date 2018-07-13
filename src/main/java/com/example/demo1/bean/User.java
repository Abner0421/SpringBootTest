package com.example.demo1.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class User implements Serializable{
	private Integer id;
	private String userName;
	private Integer age;
	
	public static void main(String[] args) {
		User user = new User();
		user.setId(1).setUserName("张射川").setAge(26);
		System.out.println(user.getId()+" "+ user.getUserName()+" "+user.getAge());
	}
}
