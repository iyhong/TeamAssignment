package question02;
/*
 *	다음중 코드의 실행결과는 무엇인가? 4번의 결과가 나온다.
 *	1. ABC123
 *	   After:ABC123
 *	2. 456
 *	   After:456
 *	3. ABC123456
 *	   After:ABC123456
 *	4. ABC123
 *	   After:ABC123456
 */

public class Question02_sangil {
	static String str = "ABC123"; //변수가 static 키워드가 사용되면 단 한 곳의 메모리 주소만을 바라 보기 때문에 static 변수가 공유된다.
								  //따라서 이 클래스 내에서 어디서든 사용할 수 있으며 값이 공유된다.

	public static void change(String str) {
		Question02.str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str); //str에 들어있는 문자열 그대로 출력된다.
		change(str); //change에서 static변수 str값을 받아와 456문자열을 추가했으므로 str값은 ABC123456이 된다.
		System.out.println("After:" + Question02.str); 
	}
}
