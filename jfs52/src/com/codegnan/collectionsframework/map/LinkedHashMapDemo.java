package com.codegnan.collectionsframework.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<>();
		
		//put()
		map.put("12333333333", "Ramesh");   //Entry
		map.put("19394949494", "Kumar");    //Entry
		map.put("39394949494", "Sravani");//Entry
		map.put("59394949494", "Rohini");//Entry
		map.put("89394949494", "Kabitha");//Entry
	
        System.out.println(map);
        
        //keySet() - to retrieve  all the keys
        System.out.println(map.keySet());
        
        //values() - to retrieve all the values
        System.out.println(map.values());
        
        
        //entrySet() - retrieves set of entries
        for(Entry entry  :map.entrySet()) {
        	//to get the key and value of Entry
        	System.out.println("Key: "+entry.getKey()+" "+"Value: "+entry.getValue()); 
        }
		
	}
	
	

}
