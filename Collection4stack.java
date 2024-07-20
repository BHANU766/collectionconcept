package com.collectionconcept;

import java.util.Stack;

public class Collection4stack {

	public static void main(String[] args) {
		Stack st1=new Stack<>();
		
		System.out.println(st1.isEmpty());
		
		st1.push(76);
		st1.push(100);
		st1.push(98);
		st1.push(56);
		st1.push(43);
		
		System.out.println(st1);
		
		st1.pop();
		System.out.println(st1);
		
		System.out.println(st1.isEmpty());
		
		System.out.println(st1.peek()); 

	}

}
