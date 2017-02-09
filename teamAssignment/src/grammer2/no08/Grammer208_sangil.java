package grammer2.no08;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	주석을 쓰시오!
*/

public class Grammer208_sangil {
	private static int result = 0; 
	private static boolean flag = false;

	public static void main(String[] args) {
		setResult(10); //result값을 10으로 셋팅하고 flag값이 true로 바뀐다.
		display(); //10과 true를 출력한다.
	}

	public static void setResult(int x) {
		flag = method1(x) || method2(); //flag = true || true 이므로 true가 된다.
	}

	public static boolean method1(int x) { //x=10
		boolean temp = false;
		if (x > 0) { //true
			result = x; //result = 10
			temp = true;
		}
		return temp; //true를 리턴한다.
	}

	public static boolean method2() {
		result = result * 10; //result = 10 * 10으로 100이 된다. 하지만 이 메서드 안에서 생명주기가 끝난다. call by value(값에 의한 호출)이므로 
							  //callee에서 바뀐 값이 caller에 영향을 주지 않는다. 따라서 result값은 여전히 10이다.
		return true;
	}

	public static void display() {
		System.out.print(result + " "); //10을 출력한다.
		System.out.println(flag); //true를 리턴한다.
	}
}
