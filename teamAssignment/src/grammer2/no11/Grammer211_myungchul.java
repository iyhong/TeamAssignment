package grammer2.no11;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	춤춘다
	연기한다
	라고 결과가 출력
*/
public class Grammer211_myungchul {
	public static void main(String[] args) {
		Person_lmc[] persons = new Person_lmc[2];
		persons[0] = new Dancer_lmc();	//1. 0배열 자리에 Dancer_lmc()메서드 객체가 들어간다.
		persons[1] = new Actor_lmc();	//1. 1배열 자리에 Actor_lmc()메서드 객체가 들어간다.
		for (int i = 0; i < persons.length; i++) {	//2. 배열의 수가 2이므로 i는 배열의 수보다 작으며 0,1까지 나온다.
			persons[i].play();		//3. i의 수가 0, 1이 대입하게 되고 0으로 부터 시작하여
									//0배열에 있는 Dancer_lmc()메서드를 실행
									//1배열에 있는 Actor_lmc() 메서드를 실행
			persons[i].display();	//4.str의 값이 추상클래스에 있는 필드변수 str의 값에 대입하게 되고
									//i의 값을 통해서 persons[i].display()출력하는 값이  (춤춘다 연기한다)라고 출력이 된다
									
		}
	}
}

abstract class Person_lmc {//추상클래스
	String str;//3-4. str값이 세팅이 되어 display()호출하여 해당 되는 값에 따라 결과가 출력이 된다.

	abstract void play();//3-1. 추상메서드

	void display() {//4-1
		System.out.println(str);
	}
}

class Dancer_lmc extends Person_lmc {	//3-2. 추상클래스를 상속 받는 서브클래스
	@Override
	protected void play() {		//3-3. 추상메서드를 재정의 한것
		str = "춤춘다";			//str의 값이 추상클래스에 있는 필드변수 str의 값에 대입
	}
}

class Actor_lmc extends Person_lmc {
	@Override
	protected void play() {//추상메서드를 재정의 한 것
		str = "연기한다";		
	}
}
