package grammer.no10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
	실행결과는? 이유는?
*/
public class Grammer10_sangil {
	public static void main(String[] args) {
		Stack st = new Stack(); //stack에는 데이터가 밑에서부터 하나씩 쌓인다 .가장 최근에 쌓인 데이터를 top이라고 부르며 가장 위에 있다.
								//데이터를 추가하거나 삭제할 때 변화가 있는 것은 항상 top이다.(후입선출)
		Queue q = new LinkedList();//Queue는 데이터가 먼저 들어간 것부터 제거된다. 가장 먼저 들어간 데이터가 front이고 가장 나중에 들어간 데이터가 rear이다.
								   //제거 메서드를 호출하면 front 데이터가 삭제되는 구조를 가진다. (선입선출)

		st.push("0"); //push는 데이터를 삽입하는 메서드이다.
		st.push("1"); //차례대로 0, 1 ,2 순으로 데이터가 삽입되고
		st.push("2"); //숫자 2가 top이 된다.
		q.offer("0"); //offer는 데이터를 삽입하는 메서드이다.
		q.offer("1"); //차례대로 0, 1, 2 순으로 삽입된다.
		q.offer("2"); //숫자 0이 front이고 2가 rear다.
		while (!st.empty()) {			//st가 비어있지 않으면 반복되는 반복문이다.
			System.out.print(st.pop()); //pop은 stack에 쌓인 데이터를 제거하는 메서드로 top에 해당하는 데이터를 제거한다.
										//그래서 하나씩 제거되면서 출력되는 것은 차례대로 2,1,0이 출력될 것이다.
		}
		System.out.print("/");
		while (!q.isEmpty()) {			//q가 비어있지 않으면 반복되는 반복문이다.
			System.out.print(q.poll()); //poll은 데이터를 하나씩 읽고 나서 제거하는 메서드이다. front에 있는 데이터부터 차례대로 제거된다.
										//가장 먼저 0이 다음 1, 2 순으로 콘솔창에 출력 후 제거된다. 
		}
	}
}
