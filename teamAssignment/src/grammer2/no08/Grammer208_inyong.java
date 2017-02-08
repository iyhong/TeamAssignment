package grammer2.no08;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	주석을 쓰시오!
	
	출력결과 : 10 true
*/

public class Grammer208_inyong {
	private static int result = 0;
	private static boolean flag = false;

	public static void main(String[] args) {
		setResult(10);
		display();
	}

	public static void setResult(int x) {
		//생각과 다른 이유는 이곳 or연산자때문이다.
		//or연산자는 둘중하나면 true이다 그런데...
		//첫번째에서 true가 나온다면..? 뒤에 연산은 하지 않고 true를 리턴해버림..
		//따라서 method1(10)은 true를 리턴하므로  method2()는 실행하지 않아버림 그래서 *10을 수행하지 않음
		//그래서 flag는 true이고 x값은 10을 곱하지 않고 그냥 10인것이다.
		flag = method1(x) || method2();
	}

	public static boolean method1(int x) {
		boolean temp = false;
		if (x > 0) {
			result = x;
			temp = true;
		}
		return temp;
	}

	public static boolean method2() {
		result = result * 10;
		return true;
	}

	public static void display() {
		System.out.print(result + " ");
		System.out.println(flag);
	}
}
