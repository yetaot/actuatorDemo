package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.ducetech.DemoApplication;
import com.ducetech.model.User;
import com.ducetech.model.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserTests {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	@Rollback
	public void findByName() throws Exception {
		User u = userMapper.findByName("AAA");
		System.out.println(u.getAge());
		Assert.assertEquals(20, u.getAge().intValue());
	}
	
}
