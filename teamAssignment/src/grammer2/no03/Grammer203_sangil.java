package grammer2.no03;
/*
	출력되는 결과는 ? 20 / 210 / team4
	그 이유는?
*/
public class Grammer203_sangil {
	void test(int test){
		test += 10;
		System.out.println();
		System.out.println(test);
	}
	
	public static void main(String[] args) {
		Grammer203_sangil t = new Grammer203_sangil();
		int a = 20; 
		int b[] = { 100, 200, 300 };
		String str = new String("team4"); 
		t.change(a, b, str);
		t.display(a, b, str);
		int test = 10;
		t.test(test);
		
	}

	void change(int a, int b[], String str) {
		a += 10;		   //a는 int형으로 기본타입의 변수이다. 따라서 change메서드 안에서는 a의 값이 바뀔지 몰라도 main의 a변수값에는 영향을 주지 않는다.
						   //위의 test메서드를 살펴보면 test값에 10이 더해져서 20이 출력되는 것을 볼 수 있듯이 그 메서드 내에서만 값이 변한다.
		b[1] += 10;		   //b는 int형의 배열값으로 참조형 변수이다.그러므로 change메서드에서 값을 더해 주면 main메서드에 있는 b[1]값을 직접 더해주는 것이다.
						   //따라서 2번째 인덱스값을 출력하면 10이 더해진 210이 출력된다.
		str += "bigtower"; //String클래스로 생성된 객체는 값이 절대 변하지 않는다. 문자열을 추가하게 되면 새로운 객체가 생기고 그 안에 bigtower라는 문자열을 담는다.
						   //기존에 team4를 담고있던 객체는 그대로 있고 bigtower라는 새로운 객체가 생기지만 main 안에서는 여전히 team4 객체 주소값을 가리키고 있다.
						   //따라서 team4 문자열을 출력할 것이다.
	}

	void display(int a, int b[], String str) {
		System.out.print(a + "/" + b[1]+"/" +str);
	}
	
}
