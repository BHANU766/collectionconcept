package com.collectionconcept;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		//create an object of priority queue
		PriorityQueue<String> pq1=new PriorityQueue<String>();
		pq1.add("lavish");
		pq1.add("karthikeyan");
		pq1.add("harini");
		pq1.add("kushal");
		System.out.println(pq1);
		
		System.out.println(pq1.element());
		
		System.out.println(pq1.peek()); //recommended for stack not queue
		
		Iterator itr=pq1.iterator();
		while(itr.hasNext()) {
		  System.out.println(itr.next());
		}
		pq1.remove();
		System.out.println(pq1);
		
		pq1.poll();
		System.out.println(pq1); 
		
		pq1.clear();
		System.out.println(pq1.poll());
		
		System.out.println(pq1.remove());
		
		

	}

}
