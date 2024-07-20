package com.collectionconcept;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet ts1=new TreeSet<>();
		ts1.add("lavish");
		ts1.add("vijay");
		ts1.add("suman");
		ts1.add("lavish");
		ts1.add("vijay");
		System.out.println(ts1);
		
		Iterator itr=ts1.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
