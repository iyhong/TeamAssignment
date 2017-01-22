package grammer.no13;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//이유는? 
//try catch finally 다 출력되려면?
public class Grammer13_myungchul {
	public static void main(String[] args) {
		test();
	}

	static void test() {
		try {
			System.out.println("try");
			System.exit(0);
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
/*
 * System.exit(0)는 딱 여기까지 그만두고 종료하게 만든다.
 * 그 이후 코드들은 실행을 못하게 된다.
 * 결과값은 try가 나온다.
 * 그러나 try catch finally를 출력하게 할려면
 * 	System.exit(0)문장을 지우면 된다.
 * 그러면 그다음에 있는 문장(코드)가 실행이 되고 
 * 예외처리를 만들어 catch finally를 실행하게 되고
 * 출력값은
 * try catch finally이 나온다.
 * 
 */
 