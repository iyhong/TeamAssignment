package grammer2.no08;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	주석을 쓰시오!
*/

public class Choiym_Grammer208 {
	private static int result = 0;
	private static boolean flag = false;

	public static void main(String[] args) {
		setResult(10);
		//setResult메서드에 매개변수로 10을 넣어줌
		display();
		//display메서드 호출
	}

	public static void setResult(int x) {
		flag = method1(x) || method2();
		//or연산자 앞이 참인지 거짓인지 확인 한후 참이 아니라면 뒤에것이 참인지 아닌지 확인
		//method1(x)에 int x값으로 10을 넘겨받았으므로 true가 리턴됨 따라서 method2()는 연산하지 않고
		//바로 flag에 true값을 대입
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
		//따라서 result는 method1에서 세팅해준 10이 들어있고 flag는 true가 들어있다.
	}
}
