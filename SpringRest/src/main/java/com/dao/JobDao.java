package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.JobPojo;

@Repository
public class JobDao extends AbstractDao{
	
	public List<JobPojo> getList(){
		StringBuilder query = new StringBuilder(50);
		query.append("select id, job_nom from T_JOB");
		
		return this.getJdbcTemplate().query(query.toString(), new RowMapper<JobPojo>(){
			
			@Override
			public JobPojo mapRow(ResultSet rs, int rownum) throws SQLException{
				return new JobPojo(
						rs.getInt("id"),
						rs.getString("job_nom"));
			}
		});
	}

}
