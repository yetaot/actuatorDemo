package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.ducetech.DemoApplication;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ApplicationTests {
	
	@Value("${com.didispace.blog.name}")
   	private String name;
	
    @Value("${com.didispace.blog.title}")
    private String title;
	
    @Value("${com.didispace.blog.number}")
    private String number;
    
	@Test
	public void getHello() throws Exception {
		System.err.println(name);
		//Assert.assertEquals(name, "DD");
		//Assert.assertEquals(title, "Spring Boot");
	}

}
