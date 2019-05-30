/**
 * 
 */
package com.myfamily.clan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.myfamily.clan.dao.ClanDao;

/**
 * @author gaurav_amritkar
 *
 */
public class TestClan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClanDao dao = new ClanDao();
		dao.getAll().forEach(
				(m) -> {System.out.println(m.toString());}
				);
		dao.removeMember("N2");
		System.out.println();
		dao.getAll().forEach(
				(m) -> {System.out.println(m.toString());}
				);
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
