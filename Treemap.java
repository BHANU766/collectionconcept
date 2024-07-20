package com.collectionconcept;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		
       TreeMap<Integer,String> tm=new TreeMap<>();
       tm.put(1,  "john");
       tm.put(2,  "ashish");
       tm.put(3,  "john");
       tm.put(2,  "ashish ranjan");
       tm.put(4,  "john");
       System.out.println(tm);
	}

}
