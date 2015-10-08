package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.ItemPojo;
import com.pojo.MenuPojo;

@RestController("/")
public class HelloService {

	@RequestMapping(value="menu" ,method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public List<MenuPojo> helloService(){	
		return generateMenu();
	}
	
	private List<MenuPojo> generateMenu(){
		List<MenuPojo> retour = new ArrayList<MenuPojo>();
		retour.add(new MenuPojo("animal"));
		retour.add(new MenuPojo("fleur"));
		retour.add(new MenuPojo("machine"));
		
		return retour;
	}
	
	
	@RequestMapping(value="items", method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public List<ItemPojo> getOrchi(){
		
		return generateItem();
	}
	
	
	private List<ItemPojo> generateItem(){
		List<ItemPojo> retour = new ArrayList<ItemPojo>();
		
		retour.add(new ItemPojo("orchidé", "fleur"));
		retour.add(new ItemPojo("yuka", "fleur"));
		retour.add(new ItemPojo("chat", "animal"));
		retour.add(new ItemPojo("chient", "animal"));
		retour.add(new ItemPojo("voiture", "machine"));
		retour.add(new ItemPojo("moto", "machine"));
		
		return retour;
	}
}
