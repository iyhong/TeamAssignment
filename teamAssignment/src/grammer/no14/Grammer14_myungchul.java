package grammer.no14;
/*다음 프로그램 컴파일과 실행시 출력되는 결과는?

① 컴파일되지 않는다.
② 컴파일 후 실행시 "01121342345566778989"처럼 0부터 9까지의 숫자를 섞어서 출력한다.
③ 컴파일 후 실행시 "01234567890123456789"처럼 0부터 9까지의 숫자를 순서대로 출력한다.
④ 컴파일 후 실행시 IllegalThreadStateException이 발생한다.

그 이유는 ?
3번
run()객체에서 이 함수를 호출하는 경우 객체를 리시버로 전달받으므로,
특정 객체의 메서드나 필드를 연속적으로 호출하거나 값을 할당할 때 사용한다고 한다.
이미 생성된 객체에 연속된 작업이 필요할 때 사용한다.
*/
public class Grammer14_myungchul {
	public static void main(String[] args) {
		Thread21 t = new Thread21();
		t.run();//t객체에 상속받은 Thread21클래스에서 실행한 결과값을 run()메소드를 통해서
				//값이 나온 상태에서 다음 for문의 결과값이 나오게 된다. 
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}

class Thread21 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}
