package com.wjl.shiwu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate j;
	
	@Transactional
	public int insertOne(String username,Integer id) {
		//String sql = "select count(*) from user";
		String sql = "insert into user values(?,?)";
		int i = j.update(sql,username,id);
		i = 10/0;
		return i;
		
		//return j.queryForObject(sql, Integer.class);
	}
}
