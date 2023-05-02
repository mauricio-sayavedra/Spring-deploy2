package com.example.Springdeploy2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Key;

//@SpringBootTest
class SpringDeploy2ApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(Key,value)-> System.out.println(Key+""+value)
		);
	}

}
