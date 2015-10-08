package com.pojo;

public class ItemPojo {
	private String nom;
	private String category;
	
	public ItemPojo(){
		
	}
	
	public ItemPojo(String nom, String category){
		this.nom = nom;
		this.category = category;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
