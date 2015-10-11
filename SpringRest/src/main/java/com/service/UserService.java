package com.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.pojo.UserPojo;

@RestController("/users")
public class UserService {
	
	private final static Logger log = Logger.getLogger(UserService.class);
	
	@Autowired
	private UserDao userDao;
	
	
	@RequestMapping(value="users", method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public List<UserPojo> getUsers(){
		log.info("Debut - getUsers");
		return userDao.getList();
	}
	
	
	@RequestMapping(value="users/{idUser}", method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public UserPojo getUser(@PathVariable("idUser") Integer id){
		return userDao.getUser(id);
	}
	
	@RequestMapping(value="users/{idUser}", method={RequestMethod.POST},consumes={"application/json", "text/html"}, produces="application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public void saveUser(@PathVariable("idUser") Integer id, @RequestBody UserPojo user){
		log.info("Debut sauvegarde");
		userDao.saveUser(id, user);
	}
}
