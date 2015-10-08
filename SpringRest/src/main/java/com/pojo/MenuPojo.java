package com.pojo;

import java.io.Serializable;

public class MenuPojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3626842272873936950L;
	
	
	private String menuName;
	private String serviceUrl;
	
	public MenuPojo(){
		
	}

	public MenuPojo(String menuName){
		this.menuName = menuName;
	}
	
	public MenuPojo(String menuName, String serviceUrl){
		this.menuName = menuName;
		this.serviceUrl = serviceUrl;
	}
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}


	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	

}
