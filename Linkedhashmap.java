package com.collectionconcept;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {

	public static void main(String[] args) {
		//create object of linked hash map
		Map<Integer,String> lhm=new LinkedHashMap();
		lhm.put(101, "lavish");
		lhm.put(102, "suman");
		lhm.put(103, "magesh");
		System.out.println(lhm);
		
		//access the value using key
		String name=(String) lhm.get(102);
		System.out.println(name);
		
        //check if key is exist
		if(lhm.containsKey(103)) {
			System.out.println("key 103 exist");
		}
			
		//remove the data
		lhm.remove(101);
		System.out.println(lhm);
		
		lhm.put(104,  "swapnil");
		lhm.put(105,  "kushal");
		System.out.println(lhm);
		
		//iterate over key and value
		for(Map.Entry<Integer, String> entry:lhm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());			
		}
		
		//iterating over values
		for(String value:lhm.values()) {
			System.out.println(value);		
		}
		
		//iterating over key
		for (int key:lhm.keySet()) {
			System.out.println(key);
		}
		
		//size of linked hash map
		System.out.println(lhm.size());
		
		//clear the linked hash map
		lhm.clear();
		System.out.println(lhm);
		}
	}


