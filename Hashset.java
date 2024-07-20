package com.collectionconcept;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet hs1=new HashSet();
	//	hs1.add("lavish");
	//	hs1.add("magesh");
	//	hs1.add("mohan");
	//	hs1.add("magesh");
	//	hs1.add("lavish");
	//	System.out.println(hs1);
		
		Iterator<String> itr=hs1.iterator();
		//looping over collection data
		while(itr.hasNext()) {
		   System.out.println(itr.next());	
		}

 		hs1.add(78);
		hs1.add(86);
		hs1.add(23);
    	hs1.add(86);
    	hs1.add(78);
		System.out.println(hs1); 
		
		//foreach loop
		for(Object obj:hs1) {
			System.out.println(obj);
		}
		
	}
		
		
	}


