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
		
		List<MenuPojo> lMenu = new ArrayList<MenuPojo>();
		lMenu.add(new MenuPojo("orchidé", "fleur", "http://localhost:9080/orchide"));
		lMenu.add(new MenuPojo("yuka", "fleur"));
		
		return lMenu;
	}
	
	
	@RequestMapping(value="orchide", method={RequestMethod.GET}, produces="application/json")
	@ResponseBody
	public List<ItemPojo> getOrchi(){
		
		List<ItemPojo> lItem = new ArrayList<ItemPojo>();
		lItem.add(new ItemPojo("Balius"));
		lItem.add(new ItemPojo("Costemp"));
		
		return lItem;
	}
}
