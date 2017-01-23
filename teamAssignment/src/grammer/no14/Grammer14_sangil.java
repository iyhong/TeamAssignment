package grammer.no14;
/*다음 프로그램 컴파일과 실행시 출력되는 결과는? 3번

① 컴파일되지 않는다.
② 컴파일 후 실행시 "01121342345566778989"처럼 0부터 9까지의 숫자를 섞어서 출력한다.
③ 컴파일 후 실행시 "01234567890123456789"처럼 0부터 9까지의 숫자를 순서대로 출력한다.
④ 컴파일 후 실행시 IllegalThreadStateException이 발생한다.

그 이유는 ?
Thread에는 run과 start 메서드가 있다. 둘의 차이점은 메인과 동시에 스레드를 사용하느냐 아니면 메인의 콜스택만 사용하느냐의 차이이다.
좀 더 자세히 말해보자면 start 메서드는 메인 명령어를 실행하는 콜스택 이외에도 스레드가 사용할 새로운 콜스택도 만들어 준다. 
그러나 run 메서드는 단지 thread의 run 메서드를 호출하는 것으로 콜스택은 main이 가진 것 밖에 없다. 
*/
public class Grammer14_sangil {
	public static void main(String[] args) {
		Thread_sangil t = new Thread_sangil();
		t.run();
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}

class Thread_sangil extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}
