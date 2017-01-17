package grammer.no10;
/*
실행결과는? 이유는?
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings(value = { "all" })
public class Grammer10_inyong {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		//스택은 맨 처음에 들어온것은 맨마지막에 나가고 맨 마지막에 들어온것은 맨 처음나간다 ex)탄창
		//큐 or LinkedList는 먼저들어온게 먼저나가고 나중에들어온게 나중에 나간다 ex)에스컬레이터
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
		System.out.print("/");
		
		//스택 두개를 이용해서 큐 구현하기
		st.push("홍");
		st.push("인");
		st.push("용");
		Stack s = new Stack();
		while (!st.empty()){
			s.push(st.pop());
		}
		while (!s.empty()) {
			System.out.print(s.pop());
		}
	}
}
