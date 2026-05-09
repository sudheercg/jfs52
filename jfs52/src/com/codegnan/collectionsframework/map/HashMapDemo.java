package com.codegnan.collectionsframework.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hMap = new HashMap<>();
		
		//put()
		hMap.put("12333333333", "Ramesh");   //Entry
		hMap.put("19394949494", "Kumar");    //Entry
		hMap.put("39394949494", "Sravani");//Entry
		hMap.put("59394949494", "Rohini");//Entry
		hMap.put("89394949494", "Kabitha");//Entry
	
        System.out.println(hMap);
        
        //keySet() - to retrieve  all the keys
        System.out.println(hMap.keySet());
        
        //values() - to retrieve all the values
        System.out.println(hMap.values());
        
        
        //entrySet() - retrieves set of entries
        for(Entry entry  :hMap.entrySet()) {
        	//to get the key and value of Entry
        	System.out.println("Key: "+entry.getKey()+" "+"Value: "+entry.getValue()); 
        }
		
	}
	
	

}
