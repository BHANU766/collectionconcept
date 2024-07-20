package com.collectionconcept;

import java.util.ArrayDeque;

public class Arraydeque {

	public static void main(String[] args) {
		//create an object of arraydeque
		ArrayDeque ad1=new ArrayDeque();
		ad1.add(10);
		ad1.add(60);
		ad1.add(10);
		ad1.add(50);
		ad1.add(30);
		ad1.add(50);
		System.out.println(ad1);
		
		ad1.addFirst(67);
		ad1.addLast(64);
		System.out.println(ad1);

	}

}
