package grammer.no05;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//소스 설명 주석달기 
public class Grammer05 {
	public static void main(String[] args) {
		Template t = new Test();
		//
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

	abstract void first();

	abstract void second();

	final void third() {
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
		super.third();
		System.out.println("Override third");
	}
	

}
