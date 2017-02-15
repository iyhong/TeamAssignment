package grammer2.no11;
/*
	다음 자바 코드 실행시 출력되는 결과는?
*/
public class Choiym_Grammer211 {
	public static void main(String[] args) {
		Person[] persons = new Person[2];
		persons[0] = new Dancer();
		persons[1] = new Actor();
		for (int i = 0; i < persons.length; i++) {
			persons[i].play();
			persons[i].display();
		}
	}
}

abstract class Person {
	String str;

	abstract void play();

	void display() {
		System.out.println(str);
	}
}

class Dancer extends Person {
	@Override
	protected void play() {
		str = "춤춘다";
	}
}

class Actor extends Person {
	@Override
	protected void play() {
		str = "연기한다";
	}
}
