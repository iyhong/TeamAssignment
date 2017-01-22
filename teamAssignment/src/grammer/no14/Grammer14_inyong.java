package grammer.no14;
/*다음 프로그램 컴파일과 실행시 출력되는 결과는?
 * 답은 3번..

① 컴파일되지 않는다.
② 컴파일 후 실행시 "01121342345566778989"처럼 0부터 9까지의 숫자를 섞어서 출력한다.
③ 컴파일 후 실행시 "01234567890123456789"처럼 0부터 9까지의 숫자를 순서대로 출력한다.
④ 컴파일 후 실행시 IllegalThreadStateException이 발생한다.

그 이유는 ?

*/
public class Grammer14_inyong {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread2_iy t = new Thread2_iy(i);
			//start()는 객체의 run()을 호출해 주는데 
			//그냥 run()을 호출하는것 과 가장 큰 차이는
			//run()은 새로운 쓰레드가 생기지 않고
			//start()는 새로운 쓰레드를 생성한다.
			//run()과 start()를 실행시켜서 비교해보자
			//run()의 결과는 항상 같다 순서대로 실행된다.
			//그에반해 star()는 실행할때마다 결과는 달라지는것을 볼수 있다.
			t.run();
			//t.start();
		}
		for (int i = 0; i < 10; i++) {
			//Thread2_iy t = new Thread2_iy(1);
			//t.start();
			System.out.println("main()의 "+i);
		}
	}
}

class Thread2_iy extends Thread {
	int no;
	Thread2_iy(int no){
		this.no = no;
	}
	@Override
	public void run() {
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for (int i = 0; i < 10; i++) {
			System.out.println(this.no+"의 run()의 "+i);
		}
	}
}
