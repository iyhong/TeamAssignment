package question02;
/*
 *	다음중 코드의 실행결과는 무엇인가? 4번
 *	1. ABC123
 *	   After:ABC123
 *	2. 456
 *	   After:456
 *	3. ABC123456
 *	   After:ABC123456
 *	4. ABC123
 *	   After:ABC123456
 */

public class Choiym_Question02 {
	static String str = "ABC123";
	//스태틱영역에 String타입의 변수 str을 선언하고 값으로 ABC123을 대입
	public static void change(String str) {
		Choiym_Question02.str += "456";
		//static영역의 str 에 문자열 456을 더함( 이 경우는 String이기 때문에 문자열을 더하는 개념이
		//아닌 ABC123456 문자열을 가지는 새로운 객체를 만들어줌
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		//여기서 콘솔에 출력하는 str은 스태틱영역의 str이 아닌 메인메소드안의 지역변수 str을 출력
		//ABC123
		change(str);
		//static영역의 str변수에 +456을 해줌 ABC123456
		System.out.println("After:" + Choiym_Question02.str);
		//After:ABC123456이 출력됨
	}
}
