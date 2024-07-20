package com.collectionconcept;

import java.util.LinkedList;
import java.util.Stack;

public class Collection2 {

	public static void main(String[] args) {
		LinkedList ll1=new LinkedList();
		Stack ss1=new Stack();
		ll1.add(10);
		ll1.add(20);
		System.out.println(ll1);
		
		ll1.push(30);
		System.out.println(ll1);
		
		ll1.addFirst("lavish");
		ll1.addLast("swapnil");
		
		ll1.add(3, 97);
		ll1.add(6,17);
		ll1.add(0,"bhanu");
		ll1.add("bhanu");
		System.out.println(ll1);
		
	//	ss1.push(10);
	//	ss1.push(20);
	//	ss1.push(30);
	//	System.out.println(ss1);
		
	//	ss1.pop();
	//	System.out.println(ss1);

	}

}
