package grammer.no13;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//이유는? 
//exit 메소드를 호출하게되면 현재 실행되고있는 프로그램을 
//종료하게 되므로 
//try가 출력된다.


//try catch finally 다 출력되려면?
//try절에 있는 System.exit(0); <- 요걸 지우면된다.
public class Grammer13_YJ {
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
