package grammer.no05;

//다음 프로그램 컴파일과 실행시 출력되는 결과는? 결과없음. 컴파일 에러
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//소스 설명 주석달기 

public class Grammer05_sangil {
	public static void main(String[] args) {
		Template t = new Test();
		Template t1 = new Template(); //추상클래스는 객체를 생성할 수 없다. 
									  //객체를 생성할려면 abstract가 없는 클래스의 객체를 생성해야 한다.
		t.play(); //Test는 Template 클래스를 상속받았으므로 Template클래스의 play 메서드를 호출할 수 있다.
				  //그러나 first, second 메서드는 추상메서드로 호출할 수 없다.
				  //third 메서드는 final 제한자로 제한되어 있기 때문에 test에서 오버라이딩할 수 없다.
				  
	}
}

abstract class Template { //abstract를 사용한 추상클래스이다.
	void play() {
		first();
		second();
		third();
	}

	abstract void first(); //추상메서드로 구현할 내용도 완성되지도 않은 메서드를 뜻하며, 호출될 수도 없는 메서드이다.

	abstract void second();

	final void third() { //final 제한자가 붙으면 이 메서드를 더 이상 오버라이딩할 수 없다. 
						 //클래스에 붙으면 그 클래스를 상속할 수 없는 상태가 된다.
						 //변수 앞에 붙으면 그 값을 더 이상 변경할 수 없는 상수가 된다.
		System.out.println("third");
	}
}

class Test extends Template {
	@Override //오버라이딩은 부모클래스의 메서드에 구현부를 수정해서 사용할 때 쓸 수 있다.
	void first() {
		System.out.println("Override first");
	}

	@Override
	void second() {
		System.out.println("Override second");
	}
	
	@Override
	void third() { //에러가 나는 이유는 부모클래스인 Template의 third 메서드가 final로 제한이 되어 있기 때문이다. 
		super.third(); // final을 썼기 때문에 오버라이딩 할 수 없음.
		//super는 부모클래스의 필드값이나 메서드를 직접 호출할 때 사용한다.
		System.out.println("Override third");
	}
}
