package question;

/*
		1. 다음 중 아래의 메서드를 올바르게 오버로딩 한 것을 모두 고르고 이유를 설명해 주세요.
			long add(int a, int b) { return a+b;}
			a. long add(int x, int y) { return x+y;}
			b. long add(long a, long b) { return a+b;}
			c. int add(byte a, byte b) { return a+b;}
			d. int add(long a, int b) { return (int)(a+b);}
			
			정답 : 
			a(x) -> 오버로딩은 매개변수갯수나 매개변수 타입이 달라야한다.
			b(o)
			c(x) -> 리턴타입이 다르면 안됨
			d(x) -> 리턴타입이 다르면 안됨

	
		2.다음 중 초기화에 대한 설명으로 옳지 않은 것을 모두 고르고 이유를 설명해 주세요.
			a.  멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다
			b.  지역변수는 사용하기 전에 반드시 초기화해야 한다
			c.  초기화 블럭보다 생성자가 먼저 수행된다
			d.  명시적 초기화를 제일 우선적으로 고려해야 한다
			e.  클래스변수보다 인스턴스변수가 먼저 초기화된다
			
			정답 :
			a(o)
			b(o)
			c(x) -> 초기화블럭이 먼저수행됨, 생성자는 호출될때(객체생성시) 초기화되고 블럭은 컴파일시 초기화된다.
			d(o)
			e(x) -> 클래스변수가 먼저 초기화된다. 마찬가지로 컴파일시 클래스변수는 초기화된다.,

*/
public class Question01_inyong {

	public static void main(String[] args) {
		TestClass1 t1 = new TestClass1();
		TestClass1 t2 = new TestClass1(0);

	}
}

class TestClass1 {
	// 클래스 초기화 블록
	static {
		System.out.println("1.클래스 초기화 블록");
	}
	// 인스턴스 초기화 블록
	{
		System.out.println("2.인스턴스 초기화 블록");
	}
	TestClass1() {
		System.out.println("3.기본 생성자");
	}
	TestClass1(int value) {
		System.out.println("4.생성자 오버로딩");
	}
}

