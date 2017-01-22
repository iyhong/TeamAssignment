package grammer.no14;
/*다음 프로그램 컴파일과 실행시 출력되는 결과는?

① 컴파일되지 않는다.
② 컴파일 후 실행시 "01121342345566778989"처럼 0부터 9까지의 숫자를 섞어서 출력한다.
③ 컴파일 후 실행시 "01234567890123456789"처럼 0부터 9까지의 숫자를 순서대로 출력한다.
④ 컴파일 후 실행시 IllegalThreadStateException이 발생한다.

그 이유는 ?

*/
public class Grammer14_choiym {
	public static void main(String[] args) {
		Thread2_choiym t = new Thread2_choiym();
		t.run();
		//t객체참조변수의 run메소드 호출시킴
		for (int i = 0; i < 10; i++) {
			//i가 10보다 작으면 for문을 반복 (10번 반복됨 i = 0~9)
			System.out.print(i);
		}
		//01234567890123456789가 나올것으로 예상
	}
}

class Thread2_choiym extends Thread {
	//Thread클래스를 상속받음
	@Override
	public void run() {
		//Thread클래스의 run 메소드를 오버라이딩 해준다. 이때에 Thread의 흐름을 조정해 줄 수 있는데(예를들면 sleep을 사용하여 시간을
		//지연시키거나 하는 행동) 따로 정의된 것이 없어 바로 실행된다.
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
	}
	
}
