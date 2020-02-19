package com.mySqlConfig;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MySqlConfig {

	@Bean
	public JdbcTemplate getUser() throws Exception {
		Properties properties = new Properties();
		properties.setProperty("username", "admin");
		properties.setProperty("password", "1q2w3e4r!");
		properties.setProperty("url",
				"jdbc:mysql://hongik-jolup-project-2020-2.cv82uv6zsmuz.us-east-2.rds.amazonaws.com:3306/db?autoReconnect=true&useTimezone=true&serverTimezone=UTC");
		BasicDataSource createDataSource = BasicDataSourceFactory.createDataSource(properties);
		return new JdbcTemplate(createDataSource);
	}
}