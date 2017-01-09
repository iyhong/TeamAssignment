package grammer.no06;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.

public class Garmmer06 {
	public static void main(String[] args) {
		Car c = new Car();
		Ship s = new Ship();
		Robot r = new Robot();
		r.test(c);
		r.test(s);
		r.test(r);
	}
}

class Elect {
	int value;
}

interface Testable {
}

class Car extends Elect implements Testable {
}

class Ship extends Elect {
}

class Robot extends Elect implements Testable {
	void test(Testable t) {
		if (t instanceof Elect) {
			System.out.println("test하다");
		}
	}

}
