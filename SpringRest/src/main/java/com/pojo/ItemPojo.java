package com.pojo;

public class ItemPojo {
	private int id;
	private String nom;
	private String category;
	private boolean aviability;
	
	public ItemPojo(){
		
	}
	
	public ItemPojo(int id, String nom){
		this.id = id;
		this.nom = nom;
	}
	
	public ItemPojo(int id, String nom, String category){
		this.id = id;
		this.nom = nom;
		this.category = category;
	}
	
	public ItemPojo(int id, String nom, String category, boolean aviability){
		this.id = id;
		this.nom = nom;
		this.category = category;
		this.aviability = aviability;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAviability() {
		return aviability;
	}

	public void setAviability(boolean aviability) {
		this.aviability = aviability;
	}
}
