package grammer.no05;

public class Grammer05_choiym {
	public static void main(String[] args) {
		Template_ym t = new Test_ym();
		/*Template_ym 클래스타입의 객체참조변수 t를 선언하고 new 연산자를 통해 생성된 
		Test_ym인스턴스의 주소값을 객체참조변수 t에 할당한다.*/
		
		//Template_ym t1 = new Template_ym();
		//Template_ym은 추상클래스이기때문에 객체화 할 수 없다.
		
		t.play();
		/*t의 주소값에 있는 인스턴스인 Test_ym의 play()를 호출한다.
		그러면 t.play는 first와 second, third 메소드를 각기 호출하는데
		first와 second는 오버라이드 되어있으므로 first, second 그리고 부모타입인 Template_ym이
		원래 가지고있던 third()에 third문자열이 콘솔창에 출력된다.*/
	}
}

abstract class Template_ym {
	//추상클래스 Template_ym을 생성
	void play() {
		//first(), second(), third()를 호출하고 리턴이 없는 추상메서드play()를 선언.
		first();
		second();
		third();
	}

	abstract void first();
	//리턴없는 추상메서드 first()선언
	abstract void second();
	//리턴없는 추상메서드 second()선언;
	final void third() {
		//리턴없는 third()선언하고 상수화 
		System.out.println("third");
		//third문자열을 콘솔에 출력하도록 한다.
	}
}

class Test_ym extends Template_ym {
	//Template_ym 추상클래스를 상속받은 Test_ym클래스를 생성
	@Override
	void first() {
		//부모타입인 Templayte_ym이 가지고있던 first()를 호출하면 first문자열을 출력하도록 오버라이드 한다.  
		System.out.println("first");
	}

	@Override
	void second() {
		//부모타입인 Templayte_ym이 가지고있던 second()를 호출하면 second문자열을 출력하도록 오버라이드 한다.
		System.out.println("second");
	}
/*	@Override
	void third() {
	//third는 final 선언이 되어있어 오버라이드 할 수 없다.
		super.third();
		//상속받은 부모의 third()를 호출
		System.out.println("Override third");
		//Override third문자열을 콘솔에 출력
	}
*/
}
