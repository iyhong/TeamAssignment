package grammer.no13;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//이유는? 
//try catch finally 다 출력되려면?
public class Grammer13_choiym {
	public static void main(String[] args) {
		test();
		//test메소드 실행
	}

	static void test() {
		try {
			System.out.println("try");
			//try 콘솔에 출력
			System.exit(0);
			// java에서 exit를 만나면 모든것을 종료시킨다. 때문에 try가 콘솔에 출력되고 System.exit()를 만나게 되어 프로그램이 
			//종료되므로 이 아래 부분은 실행되지 않는다.
			//따라서 콘솔에는 try만 출력된다. try catch finally 다 출력되려면 exit()로 메인을 종료시키지 않아야 한다.
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
