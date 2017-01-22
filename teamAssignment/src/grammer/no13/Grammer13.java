package grammer.no13;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//이유는? 
//try catch finally 다 출력되려면?
public class Grammer13 {
	public static void main(String[] args) {
		//test();
		outTest();
		returnTest();
	}

	static void test() {
		try {
			System.out.println("try");
			//main()메서드를 종료시키는 명령어
			//return과는 좀 다르다 return은 자신메서드만 종료
			//그런데 try절에서는 return을 시키더라도 finally가 있다면
			//finally 안에 있는 명령은 실행한다.
			System.exit(0);
			boolean a = true;
			if(a){
				return;
			}
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			boolean a = true;
			if(a){
				return;
			}			
			System.out.println("finally");
		}
	}
	//return이 자신메서드 종료하는지 확인하는 메서드
	static void returnTest(){
		boolean a = true;
		if(a){
			System.out.println("01");
			return;
		}
		System.out.println("02");
	}
	
	//System.exit(0)가 상위메서드를 종료시키는건지 확인하는 메서드
	static void outTest(){
		test();
	}
}
