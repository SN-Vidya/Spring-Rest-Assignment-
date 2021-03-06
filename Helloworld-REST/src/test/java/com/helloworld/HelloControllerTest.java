package com.helloworld;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloworldRestApplication.class)
public class HelloControllerTest {

	@Autowired
	private HelloController helloController;

	@Test
	public void testApplicationLload() {
		assertNotNull("HelloController is not loaded", helloController);
	}
}

