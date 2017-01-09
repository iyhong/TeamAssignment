package grammer.no05;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//소스 설명 주석달기 
public class Grammer05_myungchul {
	public static void main(String[] args) {
		Template1 t = new Test1();
		//Template1 t1 = new Template1();//추상클래스인 Template1 부모클래스에서 인스턴스화를 못시킨다.자식클래스인 Test1을 인스턴화를 시켜야만 부모클래스를 연동할수 있다고 생각한다.
		t.play();
	}
}

abstract class Template1 {
	void play() {
		first();
		second();
		third();
	}

	abstract void first();

	abstract void second();

	/*final*/ void third() {//final 키워드는 주로 class 나 method 의 재정의(overriding)를 막기 위하여 사용되며,
						//맴버변수나 로컬변수 등에서 변수 초기화 이후 바꿀수 없는 변수를 만드는 용도
		System.out.println("third");
	}
}

class Test1 extends Template1 {//Test1클래스가 추상클래스를 Template1을 상속 받는다.
	@Override
	void first() {
		System.out.println("Override first");
	}

	@Override
	void second() {
		System.out.println("Override second");
	}
	
	@Override
	void third() {//third()매소드를 사용하기 위해서는 상속 받은 Template1에서 final를 지워야 한다.
		super.third();
		System.out.println("Override third");
	}
	

}
