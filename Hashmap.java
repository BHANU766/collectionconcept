package com.collectionconcept;

import java.util.HashMap;

import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
			//create object of hash map
			Map<Integer,String> hm=new HashMap();
			hm.put(101, "lavish");
		
			String name=(String) hm.get(102);
			System.out.println(name);	hm.put(102, "suman");
			hm.put(103, "magesh");
			System.out.println(hm);
			
			//access the value using key
			
	        //check if key is exist
			if(hm.containsKey(103)) {
				System.out.println("key 103 exist");
			}
				
			//remove the data
			hm.remove(101);
			System.out.println(hm);
			
			hm.put(104,  "swapnil");
			hm.put(105,  "kushal");
			System.out.println(hm);
			
			//iterate over key and value
			for(Map.Entry<Integer, String> entry:hm.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());			
			}
			
			//iterating over values
			for(String value:hm.values()) {
				System.out.println(value);		
			}
			
			//iterating over key
			for (int key:hm.keySet()) {
	 			System.out.println(key);
			}
			
			//size of linked hash map
			System.out.println(hm.size());
			
			//clear the linked hash map
			hm.clear();
			System.out.println(hm);
			
		



	}

}
