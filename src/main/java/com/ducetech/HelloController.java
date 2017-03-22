package com.ducetech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testLogLevel() {
	    logger.debug("Logger Level ：DEBUG");
	    logger.info("Logger Level ：INFO");
	    logger.error("Logger Level ：ERROR");
	    return "";
	}
	
	@RequestMapping("/hello")
	public String index(){
		return "Hello World";
	}
	
}
