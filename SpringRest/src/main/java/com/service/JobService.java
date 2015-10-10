package com.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.JobDao;
import com.pojo.JobPojo;

@RestController("/jobs")
public class JobService {
	
	private final static Logger log = Logger.getLogger(JobService.class);
	
	
	@Autowired
	private JobDao jobDao;
	
	@RequestMapping(value="jobs", method=RequestMethod.GET, produces="application/json")
	@ResponseBody
	public List<JobPojo> getAll(){
		log.info("getAll - debut");
		return jobDao.getList();
	}

}
