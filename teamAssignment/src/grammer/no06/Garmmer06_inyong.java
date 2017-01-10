package grammer.no06;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.

public class Garmmer06_inyong{
	public static void main(String[] args) {
		Car_inyong c = new Car_inyong();
		Ship_inyong s = new Ship_inyong();
		Robot_inyong r = new Robot_inyong();
		r.test(c);
		//Robot클래스의 test메서드는 매개변수 타입이Testable 인데..
		//Ship클래스는 Testable 인터페이스를 상속받아 구현하지 않았기때문에
		//Testable타입에 대입될수 없다.
		//따라서 가능하게 하려면 Ship 클래스가 Testable 을 구현(상속)하도록 하면된다.
		r.test(s);
		r.test(r);
	}
}

class Elect_inyong {
	int value;
}

interface Testable_inyong {
}

class Car_inyong extends Elect_inyong implements Testable_inyong {
}

class Ship_inyong extends Elect_inyong implements Testable_inyong{
}

class Robot_inyong extends Elect_inyong implements Testable_inyong {
	void test(Testable_inyong t) {
		if (t instanceof Elect_inyong) { //instanceOf메서드는 t객체가 Elect를 참조할 수 있으면 true 없으면 false값을 리턴한다.
			System.out.println("test하다");
		}
	}

}
