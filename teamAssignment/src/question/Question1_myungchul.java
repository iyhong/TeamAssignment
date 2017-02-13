package question;

public class Question1_myungchul {

		//1. 다음 중 아래의 메서드를 올바르게 오버로딩 한 것을 모두 고르고 이유를 설명해 주세요.
			/*long add(int a, int b) { return a+b;}
			a. long add(int x, int y) { return x+y;}
			b. long add(long a, long b) { return a+b;}
			c. int add(byte a, byte b) { return a+b;}
			d. int add(long a, int b) { return (int)(a+b);}*/
			//a를 제외한 b,c,d 이다
			//오버로딩은 메소드에 있는 매개변수의 타입이나 갯수로 오버로딩이 성립이 된다.
			//a를 오버로딩 할 경우 매개변수타입 갯수를 증가 시키거나 감소시키면 된다.
	
		/*2.다음 중 초기화에 대한 설명으로 옳지 않은 것을 모두 고르고 이유를 설명해 주세요.
			a.  멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다
			b.  지역변수는 사용하기 전에 반드시 초기화해야 한다
			c.  초기화 블럭보다 생성자가 먼저 수행된다 → 초기화 블럭이 먼저 수행된다.
			d.  명시적 초기화를 제일 우선적으로 고려해야 한다
			e.  클래스변수보다 인스턴스변수가 먼저 초기화된다 → 클래스변수가 먼저 초기화됨*/
			
			//답은 c,e이다.
			//c:초기화 블록은 클래스의 초기화와 관련된 작업을 수행하는데 생성자보다 먼저 호촐이 되며
			//클래스 초기화 블록와 인스턴스 초기화 블록으로 구분이 된다.
			//생성자보다 먼저 인스턴스 초기화 블록이 실행이 된다.
			//e:인스턴스 변수가 먼저 초기화가 되는게 아니라 클래스 변수가 초기화가 된다 다음 인스턴스 변수가 초기화가 실행이 된다.
			//class가 처음 로딩될떄 한번 초기화가 이루어 지고, 인스턴스는 생성될때마다 각 인스턴스별로 초기화가 이루어진다.
	final static boolean LOG_ENABLE = false;

	public static void main(String[] args) {
		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass(0);

	}
}

class TestClass {
	// 클래스 초기화 블록
	static {
		System.out.println("클래스 초기화 블록");
	}

	// 인스턴스 초기화 블록
	{
		System.out.println("인스턴스 초기화 블록");
	}

	TestClass() {
		System.out.println("기본 생성자");
	}

	TestClass(int value) {
		System.out.println("생성자 오버로딩");
	}
}
