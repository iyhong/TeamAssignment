package grammer.no10;

import java.util.*;
/*
	실행결과는? 이유는?
*/
public class Grammer10_YJ {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();

		st.push("0");
		st.push("1");
		st.push("2");
	
		while (!st.empty()) {
			System.out.print(st.pop());
		}
		System.out.print("/");
		while (!q.isEmpty()) {
			System.out.print(q.poll());
		}
	}
}

/*	 Stack 안에 push로 값을 집어 넣게되면 
  		ㅣ2ㅣ
  		ㅣ1ㅣ
  		ㅣ0ㅣ 요런식으로 값이 담겨있게 된다.
  	Stack 은 First In Last Out 이기 때문에 
  		마지막에 들어 간 값이 먼저 나오게 된다.
 		그러므로 210/가출력된다.
 
	Queue 안에 offer로 값을 집어 넣게되면 
 	 	ㅣ2ㅣ
 		ㅣ1ㅣ
  		ㅣ0ㅣ  Stack 과 마찬가지로 값이 담기게 되지만
 			Queue는 First In First Out 이기 때문에
 			맨처음 들어간 값이 나오게 된다
 			그러므로 012가 출력된다
 	 
 	 
 */
