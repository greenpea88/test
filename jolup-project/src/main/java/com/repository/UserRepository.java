package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	final String USERS = "User";

	public void signup(String userId, String name, String password, String encKey) throws Exception {
		String sql = String.format("INSERT INTO %s VALUES(?, ?, ?, ?)", USERS);
		jdbcTemplate.update(sql, userId, name, password, encKey);
	}

}
