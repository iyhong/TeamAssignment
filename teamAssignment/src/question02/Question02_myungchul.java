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
 *
 *	정답은 4번이다.
 *	이유는 main메서드에서 str 지역변수로 선언된 str에 값인 ABC123을 대입하고
 *	처음 출력은 ABC123으로 나오게 된다.
 *	그다음 change(str)메소드로 실행이 되어 
 *	필드변수로 선언되어 있는 str을 통해서 ABC123 += 456 의 값이 필드변수 str 안에 ABC123456이 들어 가게 된다
 *	main으로 돌아가 Question02_myungchul.str에 나오는 출력된 값이 ABC123456이 출력이 된다. 
 *	
 */

public class Question02_myungchul {
	static String str = "ABC123";

	public static void change(String str) {
		Question02_myungchul.str += "456";
		//필드변수의 값과 456 문자열이 합쳐지면서 필드 변수에는 ABC123456이 들어 가게 된다.
	}

	public static void main(String[] args) {
		String str = "ABC123";//지역변수로 선언된 str있다.
		System.out.println(str);//지역변수의 값이 그대로 출력이 된다.
		change(str);//지역변수의 값이 change메소드로 대입하게 되고
		System.out.println("After:" + Question02_myungchul.str);//필드 변수의 값이 출력이 된다.
	}
}
