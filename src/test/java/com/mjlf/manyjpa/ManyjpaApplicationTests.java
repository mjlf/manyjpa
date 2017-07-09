package com.mjlf.manyjpa;

import com.mjlf.manyjpa.entity.Love;
import com.mjlf.manyjpa.server.LoverServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyjpaApplicationTests {


	@Autowired
	private LoverServer loverServer;

	@Test
	public void contextLoads() {
		Love love = new Love();
		love.setId(3);
		love.setName("whf");
		System.out.println(loverServer.insert(love));
		System.out.println(loverServer.find(2));
	}

}
