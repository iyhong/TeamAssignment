package grammer2.no03;
/*
	출력되는 결과는 ?
	그 이유는?
*/
public class choiym_Grammer203 {
	
	public static void main(String[] args) {
		choiym_Grammer203 t = new choiym_Grammer203();
		int a = 20;
		int b[] = { 100, 200, 300 };
		String str = new String("team4");
		
		t.change(a, b, str);
		t.display(a, b, str);
	}

	void change(int a, int b[], String str) {
		System.out.println("a확인 :"+a);
		a += 10;
		System.out.println("a확인 :"+a);
		//매개변수로 받은 int a에 +10 해줌 a= 30
		//이때 int a는 main의 int a가 아니라 change메소드의 매개변수 int a이기때문에 생명주기가
		//이 메소드 안에서 종료된다.
		for(int i = 0; i < b.length ; i++){
			System.out.println(b[i]);
		}
		
		b[1] += 10;
		//매개변수로 받은 b의 0,1,2 중 1의 index에 +10 해줌
		
		
		for(int i = 0; i < b.length ; i++){
			System.out.println(b[i]);
		}
		str += "bigtower";
		//str은 String타입의 객체를 새로 생성한 것이기 때문에 +해줄 수 없다.
		//str은 team4라는 문자열을 가리키는 객체참조변수이기때문
	}

	void display(int a, int b[], String str) {
		// 매개변수로 받은 int a의 값은 20, int b[] 은 {100,210,300}, str은 team4이다.
		System.out.print(a + "/" + b[1]+"/" +str);
		//따라서 20/210/team4가 출력된다.
		
	}
}
