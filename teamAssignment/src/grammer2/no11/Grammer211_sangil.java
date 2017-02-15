package grammer2.no11;

/*
다음 자바 코드 실행시 출력되는 결과는?
*/
public class Grammer211_sangil {
public static void main(String[] args) {
	Person_si[] Person_sis = new Person_si[2]; //추상클래스 타입의 참조변수 배열을 통해서 서로 다른 종류의 인스턴스를 하나의 그룹처럼 묶어서 사용할 수 있다.
	Person_sis[0] = new Dancer_si(); //Dancer와 Actor는 같은 조상클래스를 상속받았으므로 배열 인덱스에 각각 새로운 객체변수를 생성할 수 있다.
	Person_sis[1] = new Actor_si(); //0번째 인덱스에는 Dancer가 1번째 인덱스에는 Actor가 존재한다.
	for (int i = 0; i < Person_sis.length; i++) { 
		//i =0; Dancer_si의 play 메서드가 호출되고 str변수값이 "춤춘다"로 초기화되어 출력된다.
		//i =1; Actor_si의 play 메서드가 호출되고 str값이 "연기한다"로 초기화되어 출력된다.
		Person_sis[i].play(); 
		Person_sis[i].display();
	}
}
}

abstract class Person_si { //추상클래스
	String str;
	
	abstract void play();

	void display() {
		System.out.println(str);
	}
}

class Dancer_si extends Person_si { //추상클래스를 상속받은 클래스
	@Override
	protected void play() {
		str = "춤춘다";
	}
}

class Actor_si extends Person_si { //추상클래스를 상속받은 클래스
	@Override
	protected void play() {
		str = "연기한다";
	}
}
