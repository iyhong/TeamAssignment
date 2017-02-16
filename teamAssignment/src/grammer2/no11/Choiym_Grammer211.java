package grammer2.no11;
/*
	다음 자바 코드 실행시 출력되는 결과는?
*/
public class Choiym_Grammer211 {
	public static void main(String[] args) {
		Person1[] persons = new Person1[2];
		//두개의 index를 가지는 배열을 만들고 그 배열객체를 persons 객체참조변수에 담는다.
		//persons   ----- > [ , ] 
		persons[0] = new Dancer1();
		//persons -----> [Dancer1의 주소값 , ]
		persons[1] = new Actor1();
		//persons ------> [Dancer1의 주소값, Actor1의 주소값 ]
		for (int i = 0; i < persons.length; i++) {
			//persons의 길이는 2 이므로 0,1 두번 반복하는 for문
			persons[i].play();
			persons[i].display();
			//i = 0 일때 Dancer1 클래스의 주소값을 참조하고 있으므로 dancer1의 play와 display메소드 실행
			//i = 1 일때 actor1 클래스의 주소값을 참조하고 있으므로 actor1의 play와 display메소드 실행
			//춤춘다
			//연기한다 출력됨
			//git에 올라갑니까??
		}
	}
}

abstract class Person1 {
	//추상클래스 person1
	String str;

	abstract void play();
	//추상메소드 play선언
	void display() {
		System.out.println("추상메소드 안의 str  :"+str);
		System.out.println(str);
		
	}
}

class Dancer1 extends Person1 {
	@Override
	protected void play() {
		//추상메소드 paly를 상속받아 오버라이딩 해줌
		System.out.println("str확인 : 1"+str);
		str = "춤춘다";
		//추상클래스의 String str = null상태에 "춤춘다" 문자열을 가지는 새로운 객체를
		//만들어줌
		System.out.println("str확인 : "+str);
	}
	
}

class Actor1 extends Person1 {
	@Override
	protected void play() {
		str = "연기한다";
		//위와 동일
	}
}
