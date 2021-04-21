package com.shivash.jenkin.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringGitJenkinTestApplicationTests {
	public static Logger logger =LoggerFactory.getLogger(SpringGitJenkinTestApplicationTests.class);
	@Test
	 contextLoads() {
		logger.info("test case executing....");
		logger.info("test case executing second time....");
		logger.info("test case executing third time....");
		assertEquals(true,true);
	}

}
