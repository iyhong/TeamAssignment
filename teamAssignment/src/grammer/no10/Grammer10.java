package grammer.no10;

import java.util.*;
/*
	실행결과는? 이유는?
*/
public class Grammer10 {
	public static void main(String[] args) {
		Stack st = new Stack(); 
								
		Queue q = new LinkedList();
								   

		st.push("0"); 
		st.push("1"); 
		st.push("2"); 
		q.offer("0"); 
		q.offer("1"); 
		q.offer("2"); 
		while (!st.empty()) {			
			System.out.print(st.pop()); 
										
		}
		System.out.print("/");
		while (!q.isEmpty()) {			
			System.out.print(q.poll()); 
										 
		}
	}
}
