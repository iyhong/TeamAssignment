package grammer.no05;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//소스 설명 주석달기 
public class Grammer05_YJ {
	public static void main(String[] args) {
		Template t = new Test();
		//Template 클래스타입으로 객체참조변수 t를 선언하고 
		//Test(); 메소드를 통해 객체참조변수 t에 주소값을 할당한다.
		Template t1 = new Template();
		
		t.play();
	}
}

abstract class Template {
	void play() {
		first();
		second();
		third();
	}
		// abstract 추상메소드
		/*
		  	● 추상 메소드가 하나 이상 포함되면 반드시 추상 클래스로 선언되어야 한다.
			● 반드시 추상 클래스를 상속하는 자식 클래스에서 부모가 가진 추상 메소드를 모두 오버라이딩 해야 한다.
			● 추상 클래스에서 추상 메소드가 아닌 일반 메소드를 포함시킬 수 있다.
			● 추상 메소드는 몸체가 없고 선언부만 존재한다.
		 */
	abstract void first();	

	abstract void second();

	final void third() {						//클래스 앞에 final이 붙으면 상속할수없다
		System.out.println("third");
	}
}

class Test extends Template {
	@Override
	void first() {
		System.out.println("Override first");
	}

	@Override
	void second() {
		System.out.println("Override second");
	}
	
	@Override
	void third() {
		super.third();		//부모클래스의 메소드를 호출할때 사용한다 
		System.out.println("Override third");	//
	}
	

}
