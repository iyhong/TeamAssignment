package grammer.no06;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.

public class Garmmer06_choiym {
	public static void main(String[] args) {
		Car_cym c = new Car_cym();
		Ship_cym s = new Ship_cym();
		Robot_cym r = new Robot_cym();
		r.test(c);
		r.test(s);
		//Ship은 Testable_cym 인터페이스를 상속받지않았으므로 s는 Testable_cym타입의 매개변수가
		//아니므로 컴파일에러가 발생한다.
		//따라서 Ship_cym클래스 역시 Testable_cym인터페이스를 상속받거나 해당메소드를 삭제해야한다.
		r.test(r);
	}
}

class Elect_cym {
	int value;
}

interface Testable_cym {
}

class Car_cym extends Elect_cym implements Testable_cym {
	//Elect_cym을 상속받고 Testable_cym을 구현함
	//int value를 상속받아 가지고있는상태 Testable_cym타입을 지니고 있는 상태
}

class Ship_cym extends Elect_cym {
	//Elect_cym을 상속받아 int value를 가지고있는상태
}

class Robot_cym extends Elect_cym implements Testable_cym {
	//Elect_cym을 상속받고 Testable_cym을 구현함
	//int value를 상속받아 가지고있는상태 Testable_cym타입을 지니고 있는 상태
	void test(Testable_cym t) {
		//리턴없는 test메소드 선언 매개변수로 Testable타입의 t를 받는다.
		if (t instanceof Elect) { //instanceOf메서드는 t객체가 Elect를 참조할 수 있으면 true 없으면 false값을 리턴한다.
			System.out.println("test하다");
		}
	}

}
