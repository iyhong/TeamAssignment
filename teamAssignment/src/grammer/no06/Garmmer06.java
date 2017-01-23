package grammer.no06;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.

public class Garmmer06 {
	public static void main(String[] args) {
		Car c = new Car();
		Ship s = new Ship();
		Robot r = new Robot();
		r.test(c);
		r.test(s);	//
		r.test(r);
	}
}

class Elect {
	int value;
}

interface Testable {
}

class Car extends Elect implements Testable {
}	//Car 는 Elect를 상속받고 Testable(인터페이스)을 구현한다.
	//int value;를 가지고있다.
class Ship extends Elect {
	//Ship 는 Elect 를 상속한다.
	//int value; 를 가지고있다
}

class Robot extends Elect implements Testable {
	//Robot은 Elect 를 상속받고 , Testable(인터페이스)를 구현한다.
	void test(Testable t) {
		if (t instanceof Elect) { //instanceOf메서드는 t객체가 Elect를 참조할 수 있으면 true 없으면 false값을 리턴한다.
			//
			//
			System.out.println("test하다");
		}
	}

}
