package grammer.no10;

import java.util.*;
/*
	실행결과는? 이유는?
*/
public class Grammer10_myungchul {
	public static void main(String[] args) {
		Stack st = new Stack();
		//Stack클래스는 데이터를 쌓아올리는 형태로 0,1,2 순으로 들어간다. 데이터를 불러올떄는
		//맨위에 위치해 있는 2 숫자부터 불러오게 된다. 
		Queue q = new LinkedList();
		//Queue클래스는 Stack과 처음 입력하는 방식은 똑같으나 데이터를 불러오게 되면 먼저 입력한 값이
		//출력하게 된다.
		st.push("0");
		st.push("1");
		st.push("2");
		//push는 새로운 데이터를 스택에 삽입하는 메소드이다. 1씩 증가시켜 데이터를 삽입한다.
		//스텍에 들어간 값이 0,1,2로 들어가 있다.
		q.offer("0");
		q.offer("1");
		q.offer("2");
		//offer 메소드는 Queue클래스의 객체에 데이터를 넣게 된다.
		//0,1,2 식으로 입력하게 된다.
		while (!st.empty()) {
			System.out.print(st.pop());
			//pop는 삭제(추출)하는 메소드이며 맨 위에 있는 데이터부터 삭제를 시켜 1씩 감소를 한다.
			//출려문에서 나오는 결과값은 2,1,0 210으로 값이 나오게 된다.
		}
		System.out.print("/");
		while (!q.isEmpty()) {
			System.out.print(q.poll());
			//poll메소드는 Queue에 있는 데이터를 꺼내온다
			//Queue 객체에 데이터가 없을 경우에는 null로 반환이 되어 결과창에는 아무것도 나오지 않는다.
		}
		System.out.println();
		//
		Stack s = new Stack();
		st.push("t");
		st.push("e");
		st.push("s");
		st.push("t");
		
		//첫번째 while문 통해서 st.pop메소드를 통해 데이터가 가는 출력된 값 순서가 tset로 나오게 된다.
		//s.push 통해서 다시 입력하게 되는데 tset로 스택에 쌓이게 되고
		while(!st.empty()){
			s.push(st.pop());
		}
		//두번쨰 while문 통해 s.pop()메소드가 출력문에 의해서 나오는데 test로 나오게 된다. 
		while(!s.empty()){
			System.out.print(s.pop());
		}
	}
}
