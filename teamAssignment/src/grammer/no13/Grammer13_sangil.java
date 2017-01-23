package grammer.no13;

//다음 프로그램 컴파일과 실행시 출력되는 결과는? 이유는? 
//"try" 문자열만 출력된다.
//이유는 exit메서드로 메서드를 종료시켜버리기 때문에 try절에서 test메서드가 끝나버린다. 
//따라서 예외도 발생하지 않았고, finally절도 수행하지 않고 test메서드는 종료된다.


//try catch finally 다 출력되려면?
//모두 출력되게 할려면 exit메서드가 있는 라인을 삭제하면 된다.
public class Grammer13_sangil {
	public static void main(String[] args) {
		test();
	}

	static void test() {
		try {
			System.out.println("try");
			
			System.exit(0); //exit는 탈출메서드로서 try절이 끝나면 0을 반환해주는 메서드이다.
							//보통 main 메서드에서 return을 사용할 수 없으니 exit를 이용해 반환값을 줄 수 있다. 
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
