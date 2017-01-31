package algorithm.no03;

/*
	재귀를 이용해서 
	피보나치 수열을 만들어 출력해보세용.
	
	함수 내에서 자기 자신을(함수)를 계속적으로 콜 하면서 풀어가는 방식이다.
	스택(Stack)이라고 생각할 수 있다.
	함수가 콜 되면서 최근에 자신을 부른 원래 함수가 스택에 차곡차곡 쌓이게 됨.
	중요한건 
	처음 불려진 함수에서(스택 맨 밑에있는 메소드) return 되는 값이 최종 return 값이 된다

*/
public class Algorithm03_myungchul {

	public static void main(String[] args) {
		int a = 20;

		for (int i = 0; i <= a; i++) {
			System.out.println(fibo(i));
		}
	}

	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		}else{
			return fibo(n-2) + fibo(n-1);
		}
	}
}
