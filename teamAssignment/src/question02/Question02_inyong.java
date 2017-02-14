package question02;
/*
 *	다음중 코드의 실행결과는 무엇인가?
 *	1. ABC123
 *	   After:ABC123
 *	2. 456
 *	   After:456
 *	3. ABC123456
 *	   After:ABC123456
 *	4. ABC123
 *	   After:ABC123456
 */

// 정답은 4번 
// 첫번째 str은 지역변수인 str(abc123)이고
// 두번째 change()메서드에 매개변수로 전달된것도 abc123이다..
// 하지만 change()메서드는 전달받은 지역변수값은 사용하지않고 static변수에 456문자열을 더하기만 한다.
// 그러고 After: 다음의 출력메세지는 static변수값을 출력하므로 ABC123456 이 출력된다.
public class Question02_inyong {
	static String str = "ABC123";

	public static void change(String str) {
		Question02_inyong.str += "456";
	}

	public static void main(String[] args) {
		String str = "abc123";
		System.out.println(str);
		change(str);
		System.out.println("After:" + Question02_inyong.str);
	}
}
