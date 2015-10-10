package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.UserPojo;

@Repository
public class UserDao extends AbstractDao {

	public List<UserPojo> getList(){
		StringBuilder query = new StringBuilder(100);
		query.append("Select id, nom, id_job from T_USER");
		
		
		return this.getJdbcTemplate().query(query.toString(), new RowMapper<UserPojo>(){
			@Override
			public UserPojo mapRow(ResultSet rs, int rownum) throws SQLException{
				return new UserPojo(
						rs.getInt("id"),
						rs.getString("nom"),
						rs.getInt("id_job")
						);
			}			
		});
	}	
	
}
