package com.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.pojo.UserPojo;

@RestController("/users")
public class UserService {
	
	private final static Logger log = Logger.getLogger(UserService.class);
	
	@Autowired
	private UserDao userDao;
	
	
	@RequestMapping(method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public List<UserPojo> getUsers(){
		log.info("Debut - getUsers");
		return userDao.getList();
	}
}
