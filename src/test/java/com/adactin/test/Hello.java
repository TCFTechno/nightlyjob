package com.adactin.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hello {

	public static void main(String[] args) {

	//list of price 20 10 40 60 
		//list vegetables  ladyfinger   onion 
		
		

	//ouput  vegetables :  price
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("ladyfinger", 20);
		map.put("potatos", 10);
		map.put("tamato", 40);
		map.put("onion", 60);
		
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			
			
			String key = entry.getKey();
	
			Integer value = entry.getValue();

		System.out.println(key+" : "+value);
		}
		
	}

}