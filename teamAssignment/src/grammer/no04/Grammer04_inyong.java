package grammer.no04;

public class Grammer04_inyong {
	public static void main(String[] args) {
		//TestInyong 클래스의 getInstance()메서드는  static 메서드이므로 클래스명.메서드명으로 호출되며
		//getInstance()메서드는 TestInyong클래스에 있는 클래스변수인 TestInyong형 t 값이 null이면
		//TestInyong클래스로 새로운객체를 생성하여 t 에 담고 t를리턴, t가 null 이 아니면 담겨있는 t를 리턴한다.
		TestInyong t1 = TestInyong.getInstance();
		//그러므로 또다시 getInstance() 메서드를 호출하면 이미 TestInyong t 는 null이 아니므로 똑같은 객체를 리턴한다.
		//그래서 결국 t1과 t2는 같은 객체를 가리킴
		TestInyong t2 = TestInyong.getInstance();
		
		//t1객체의 x값을 5로 셋팅하고
		t1.setX(5);
		//t2객체의 x값을 10으로 셋팅하면, 결국 t1과 t2는 같은객체이므로 t1.x=5 로셋팅하고 t2.x=5 에서t2.x=10 으로 바뀌게된다.
		t2.setX(10);
		//결국 출력하면 10,10이 출력됨
		System.out.println(t1.getX());
		System.out.println(t2.getX());
	}
}

class TestInyong {
	private static TestInyong t;
	private int x;

	private TestInyong() {
	}

	public static TestInyong getInstance() {
		if (t == null) {
			t = new TestInyong();
		}
		return t;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}


}
