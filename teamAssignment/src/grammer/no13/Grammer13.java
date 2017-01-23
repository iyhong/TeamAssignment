package grammer.no13;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//이유는? 
//try catch finally 다 출력되려면?
public class Grammer13 {
	public static void main(String[] args) {
		test();
	}

	static void test() {
		try {
			System.out.println("try");
		
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
