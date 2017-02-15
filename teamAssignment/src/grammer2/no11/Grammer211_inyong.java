package grammer2.no11;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	
	결과 :
		춤춘다
		연기한다
	이유:
		자식객체들을 부모타입 배열변수에 담으면
		오버라이딩한 메서드는 자식에서 선한한 메서드가 호출되고
		play메서드가 호출되면 부모클래스의 instance변수인 str을 각각 "춤춘다", "연기한다" 문자열을 셋팅한다.
		그리고 부모클래스가 가진 dispaly메서드를 통해 각각str instance변수에 담겨있는 문자열을 출력한다.
*/
public class Grammer211_inyong {
	public static void main(String[] args) {
		Person_iy[] persons = new Person_iy[2];
		persons[0] = new Dancer_iy();
		persons[1] = new Actor_iy();
		for (int i = 0; i < persons.length; i++) {
			persons[i].play();
			persons[i].display();
		}
	}
}

abstract class Person_iy {
	String str;

	abstract void play();

	void display() {
		System.out.println(str);
	}
}

class Dancer_iy extends Person_iy {
	@Override
	protected void play() {
		str = "춤춘다";
	}
}

class Actor_iy extends Person_iy {
	@Override
	protected void play() {
		str = "연기한다";
	}
}
