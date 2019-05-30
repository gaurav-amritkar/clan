/**
 * 
 */
package com.myfamily.clan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfamily.clan.dao.ClanDao;
import com.myfamily.clan.model.Myself;

/**
 * @author gaurav_amritkar
 *
 */
@Service
public class ClanService {
	
	@Autowired
	private ClanDao dao;
	
	public List<Myself> getAll() {
		return dao.getAll();
	}
	
	public void addMember(Myself m) {
		dao.addMember(m);
	}
	
	public void removeMember(String name) {
		dao.removeMember(name);
	}

}
