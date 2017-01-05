package grammer04;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//주석달기
public class Grammer04_myungchul {
	public static void main(String[] args) {
		//싱글턴 패턴이라고 한다. 인스턴스(객체)를 한번만 생성하게 되는데 getInstance()메서드를 통해 객체를 동기화를 한다.
		//나중에 입력한 값이 동기화가 되어 출력하게 된다.
		Test t1 = Test.getInstance(); 
		Test t2 = Test.getInstance();
		t1.setX(5);						//t1 수행시 객체 데이터영역 1에는 5라는 수가 들어가 있다.
		t2.setX(10);					//t2 수행시 객체 데이터영역 1에 있는 5라는 수가 있어 그위에 동기화 하여 대신 10이 들어간다.
		System.out.println(t1.getX());	//t1.getX() 객체 데이터 영역 1에는 동기화가 된 10수가 있어 10으로 출력하게 되고
		System.out.println(t2.getX());	//t2.getX() 객체 데이터 영역 1에는 10으로 출력하게 된다.
	}
}

class Test {
	private static Test t; 	//Test 클래스 t라는 변수에 static이 붙어인스턴스화에 상관없이 사용이 가능하다 그러나 private접근제어자로 인해 
							//new 키워드를 사용할수가 없게 된다
	private int x;			

	private Test() {
	}

	public static Test getInstance() {	//getInstance는 싱크로나이즈(동기화) 처리하는 메서드라고 한다.
		if (t == null) {				//t1의 변수가 null이 ture일때 객체를 생성을한다. t2의 변수가 null이면 ture가 되어 객체를 생성한다.
			t = new Test();	
		}
		return t;						//두개의 객체를 갖고 return을 한다.그러나 getInstance() 통해서 두개의 객체가 한개의 객체로 동기화를 하기 때문이다.
	}

	public int getX() {			//System출력식으로 화면에 출력을 하게 x를 리턴한다.
		return x;
	}

	public void setX(int x) { 	//t1.setX(5), t2.setX(10) 대입하게 된다.
		this.x = x;				//대입된 x는 this로 통해 위에 있는 getX() 메서드로 이동하게된다.
	}

}
