package grammer.no06;

//다음 프로그램 컴파일과 실행시 출력되는 결과는? 컴파일 오류 발생
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오. 13라인에서 에러 발생 자세한 설명은 라인 옆에 주석으로

public class Grammer06_sangil {
	public static void main(String[] args) {
		Car1 c = new Car1();
		Ship1 s = new Ship1();
		Robot1 r = new Robot1();
		r.test(c); //Robot1클래스는 Testable1 인터페이스를 implements했고 Electro를 상속받았다.  
				   //Car1클래스로 생성한 c객체가 test 메서드의 t매개변수에 들어가 if문의 조건을 만족시키므로 "test하다"라는 문자열을 출력시킨다.
		r.test(s); //Ship1 클래스로 생성한 s 객체는 Testable1인터페이스를 implements하지 않았다. 
				   //그렇기 때문에 test 메서드의 매개변수인 t로 들어갈 수 없다. 이때문에 컴파일 에러가 발생한다.
		r.test(r); //r 객체는 Testable1 인터페이스를 implements하고 Electro를 상속받은 클래스로 생성된 객체기 때문에 
				   //test 메서드의 t매개변수로 들어갈 조건을 만족한다. 또한 Electro를 참조할 수 있기 때문에 if문도 true가 되고 "test하다" 문자열을 출력할 수 있다.
	}
}

class Electro {
	int value;
}

interface Testable1 {
}

class Car1 extends Electro implements Testable1 {
}

class Ship1 extends Electro {
}

class Robot1 extends Electro implements Testable1 {
	void test(Testable1 t) {
		if (t instanceof Electro) { //instanceOf메서드는 t객체가 Electro를 참조할 수 있으면 true 없으면 false값을 리턴한다.
			System.out.println("test하다");
		}
	}

}