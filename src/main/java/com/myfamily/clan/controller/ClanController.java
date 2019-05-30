/**
 * 
 */
package com.myfamily.clan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.myfamily.clan.model.Myself;
import com.myfamily.clan.service.ClanService;

/**
 * @author gaurav_amritkar
 *
 */
@RestController
public class ClanController {
	
	@Autowired
	private ClanService service;
	
	@RequestMapping(value = "/")
	public ModelAndView getIndexPage() {
		return new ModelAndView("index.html");
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Myself> getAll() {
		return service.getAll();
	}
	
//	@RequestMapping(value = "/all", method = RequestMethod.GET)
//	public ModelAndView getAll() {
//		return new ModelAndView("allMembers.jsp", "model", service.getAll());
//	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addMember(@RequestBody Myself m) {
		service.addMember(m);
	}
	
	@RequestMapping(value = "/delete/{pv_name}", method = RequestMethod.DELETE)
	public void removeMember(@PathVariable(value = "pv_name") String name) {
		service.removeMember(name);
	}

}
