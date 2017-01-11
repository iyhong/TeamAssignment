package grammer.no06;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.

public class Garmmer06_myungchul {
	public static void main(String[] args) {
		Car_MCL c = new Car_MCL();
		Ship_MCL s = new Ship_MCL();
		Robot_MCL r = new Robot_MCL();
		r.test(c);
		r.test(s);
		r.test(r);
		/*
		 * ship()메서드가 오류가 생기는 이유는 
		 * Testable 인터페이스를 구현 받지 못해서 오류가 발생한거다.
		 * 각 클래스마다 elect라는 클래스를 상속을 받았고
		 * car,robot만 Testable를 구현을 받아기 때문에 출력이 된다.
		 * 서로 공통되는 로직을 구현하여 사용할수가 있다.
		 * Extends는 하나의 클래스만 상속 가능하나 Implements는 다중 상속이 가능
		*/
	}
}

class Elect_MCL {
	int value;
}

interface Testable_MCL {
}

class Car_MCL extends Elect_MCL implements Testable_MCL {
}

class Ship_MCL extends Elect_MCL implements Testable_MCL{
}

class Robot_MCL extends Elect_MCL implements Testable_MCL {
	void test(Testable_MCL t) {
		if (t instanceof Elect_MCL) {//instanceof 연산자는 왼쪽이 오른쪽에 오는 클래스가 객체이거나 하위클래스의 객체일경우
								//true로 반환을 한다고 한다. 그렇지 않을 경우 false로 반환을 하구요.
			System.out.println("test하다");
		}
	}

}
