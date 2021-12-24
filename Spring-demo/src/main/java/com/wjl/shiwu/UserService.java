package com.wjl.shiwu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class UserService {
	@Autowired
	UserDao user;
	
	public int insertOne(String username,Integer id) {
		return user.insertOne(username, id);
	}
}
