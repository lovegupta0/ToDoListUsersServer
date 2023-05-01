package com.ToDoListUsers.ToDoListUsers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ToDoListUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListUsersApplication.class, args);
	}

}
