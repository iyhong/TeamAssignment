package grammer.no05;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//소스 설명 주석달기 
public class Grammer05_inyong {
	public static void main(String[] args) {
		TemplateInyong t = new TestInyong();
		//Template 클래스는 추상클래스이기때문에 객체화 할수없다
		//Template t1 = new Template();
		t.play();
	}
}

abstract class TemplateInyong {
	void play() {
		first();
		second();
		third();
	}

	abstract void first();

	abstract void second();

	//final을 삭제하던지 오버라이딩 하지말던지
	void third() {
		System.out.println("third");
	}
}

class TestInyong extends TemplateInyong {
	@Override
	void first() {
		System.out.println("Override first");
	}

	@Override
	void second() {
		System.out.println("Override second");
	}
	
	@Override
	//third메서드는 부모클래스에서 final(상수화)되어있기때문에 override할수없다.
	void third() {
		super.third();
		System.out.println("Override third");
	}
	

}
