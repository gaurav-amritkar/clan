package com.myfamily.clan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClanApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testAdd() {
	      String str = "Junit is working fine";
	      assertEquals("Junit is working fin",str);
	   }
	@Test
	public void testAdd2() {
	      String str = "Junit is working fine";
	      assertEquals("Junit is working fine",str);
	   }
}
