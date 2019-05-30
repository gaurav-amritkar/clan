/**
 * 
 */
package com.myfamily.clan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.myfamily.clan.model.Myself;

/**
 * @author gaurav_amritkar
 *
 */
@Repository
public class ClanDao {
	
	private static List<Myself> list = new ArrayList<Myself>(); 
	
	static {
		Myself M1 = new Myself("N1", 11);
		M1.setFather(new Myself("F1", 41));
		M1.setMother(new Myself("M1", 31));
		
		Myself M2 = new Myself("N2", 12);
		M2.setFather(new Myself("F2", 42));
		M2.setMother(new Myself("M2", 32));
		
		Myself M3 = new Myself("N3", 13);
		M3.setFather(new Myself("F3", 43));
		M3.setMother(new Myself("M3", 33));
		
		list.add(M1);
		list.add(M2);
		list.add(M3);
	}
	
	public List<Myself> getAll() {
		return list;
	}
	
	public void addMember(Myself m) {
		list.add(m);
	}

}
