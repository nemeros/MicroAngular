package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserPojo {
	
	private Integer id;
	private String nom;
	private String prenom;
	private Integer age;
	private Integer jobId;
	
	public UserPojo(){
		
	}
	
	public UserPojo(Integer id, String nom, Integer jobId){
		this.id = id;
		this.nom = nom;
		this.jobId = jobId;
	}
	

	public UserPojo(Integer id, String nom, String prenom, Integer age, Integer jobId){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.jobId = jobId;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	
}
