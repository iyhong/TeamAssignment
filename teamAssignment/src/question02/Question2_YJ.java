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

public class Question2_YJ {
	static String str = "ABC123";

	public static void change(String str) {
		Question2_YJ.str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After:" + Question2_YJ.str);
	}
}
