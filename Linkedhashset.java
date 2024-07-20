package com.collectionconcept;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet lhs1=new LinkedHashSet<>();
		lhs1.add(78);
		lhs1.add(86);
		lhs1.add(23);
		lhs1.add(86);
		lhs1.add(78);
		System.out.println(lhs1);
		
		System.out.println(lhs1.size());
		
		//series of the data
		Iterator itr=lhs1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
