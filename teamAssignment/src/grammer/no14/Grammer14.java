package grammer.no14;
/*다음 프로그램 컴파일과 실행시 출력되는 결과는?

① 컴파일되지 않는다.
② 컴파일 후 실행시 "01121342345566778989"처럼 0부터 9까지의 숫자를 섞어서 출력한다.
③ 컴파일 후 실행시 "01234567890123456789"처럼 0부터 9까지의 숫자를 순서대로 출력한다.
④ 컴파일 후 실행시 IllegalThreadStateException이 발생한다.

그 이유는 ?

*/
public class Grammer14 {
	public static void main(String[] args) {
		Thread2 t = new Thread2();
		t.run();
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}
