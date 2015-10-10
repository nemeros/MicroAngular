package com.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.ItemPojo;
import com.pojo.MenuPojo;

@RestController("/")
public class HelloService {
	
	private static final Logger log = Logger.getLogger(HelloService.class);
	
	
	@RequestMapping(value="menu" ,method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public List<MenuPojo> getMenu(){	
		return generateMenu();
	}
	
	private List<MenuPojo> generateMenu(){
		List<MenuPojo> retour = new ArrayList<MenuPojo>();
		retour.add(new MenuPojo("animal"));
		retour.add(new MenuPojo("fleur"));
		retour.add(new MenuPojo("users"));
		
		return retour;
	}
	
	
	@RequestMapping(value="items", method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public List<ItemPojo> getAllItem(){
		
		return generateItem();
	}
	
	@RequestMapping(value="items/{id}", method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public ItemPojo getSpecificItem(@PathVariable("id") int id){
		List<ItemPojo> lItem = generateItem();
		 ItemPojo retour = null;
		 
		 for(ItemPojo i : lItem){
			 if(i.getId() == id){
				 retour = i;
				 break;
			 }
		 }
		 
		return retour;
	}
	
	private List<ItemPojo> generateItem(){
		List<ItemPojo> retour = new ArrayList<ItemPojo>();
		
		retour.add(new ItemPojo(1, "orchidé", "fleur", false));
		retour.add(new ItemPojo(2, "yuka", "fleur", false));
		retour.add(new ItemPojo(3, "chat", "animal", true));
		retour.add(new ItemPojo(4, "chient", "animal", true));
		retour.add(new ItemPojo(5, "voiture", "machine", false));
		retour.add(new ItemPojo(6, "moto", "machine",true));
		
		return retour;
	}
}
