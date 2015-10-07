package com.pojo;

import java.io.Serializable;

public class MenuPojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3626842272873936950L;
	
	
	private String menuName;
	private String menuParent;
	private String serviceUrl;
	
	public MenuPojo(){
		
	}
		
	public MenuPojo(String menuName, String menuParent){
		this.menuName = menuName;
		this.menuParent = menuParent;
	}
	
	public MenuPojo(String menuName, String menuParent, String serviceUrl){
		this.menuName = menuName;
		this.menuParent = menuParent;
		this.serviceUrl = serviceUrl;
	}
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuParent() {
		return menuParent;
	}
	public void setMenuParent(String menuParent) {
		this.menuParent = menuParent;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	

}
