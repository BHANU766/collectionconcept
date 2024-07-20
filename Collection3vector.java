package com.collectionconcept;

import java.util.Enumeration;
import java.util.Vector;

public class Collection3vector {

	public static void main(String[] args) {
		Vector vector=new Vector();
		
		vector.add("lavish");
		vector.add("suman");
		vector.add("swapnil");
		vector.add("harini");
		
		System.out.println(vector);
		
		for (Enumeration<String> e = vector.elements(); e.hasMoreElements();)
               System.out.println(e.nextElement()); 
	}
        
}
