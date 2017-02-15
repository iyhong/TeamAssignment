package grammer2.no11;
/*
	다음 자바 코드 실행시 출력되는 결과는?
*/
public class Grammer211_YJ {
	
	public static void main(String[] args) {
		Person_YJ[] persons = new Person_YJ[2];	
		persons[0] = new Dancer_YJ();
		persons[1] = new Actor_YJ();
		for (int i = 0; i < persons.length; i++) {
			persons[i].play();
			
			persons[i].display();
		}
		//i=0일때, Dancer_YJ에 있는 play() 메소드가 실행되고 str 변수에 "춤춘다"를 담는다
		//자신의 부모 클래스인 Person_YJ에 있는 display메소드를 실행하여 "춤춘다"를 출력한다
		//i=1일때, Actor_YJ에 있는 play메소드가 실행되고 str변수에 "연기한다"를 담는다
		//자신의 부모 클래스인 Person_YJ에 있는 display메소드를 실행하여 "연기한다"를 출력한다.
	}
}

abstract class Person_YJ {
	//추상클래스
	String str;

	abstract void play();

	void display() {
		System.out.println(str);
	}
}

class Dancer_YJ extends Person_YJ {	
	@Override
	protected void play() {
		str = "춤춘다";
	}
}

class Actor_YJ extends Person_YJ { 
	@Override
	protected void play() {
		str = "연기한다";
	}
}
