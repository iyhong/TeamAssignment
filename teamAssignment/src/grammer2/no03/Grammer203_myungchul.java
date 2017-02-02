package grammer2.no03;
/*
	출력되는 결과는 ?
	그 이유는?
*/
public class Grammer203_myungchul {
	public static void main(String[] args) {
		Grammer203_myungchul t = new Grammer203_myungchul();
		int a = 20;
		int b[] = { 100, 200, 300 };
		String str = new String("team4");
		//t.change(a,b,str)에 대입하여 a = 20을 b[]={100,200,300}을 str=new String("team4")
		//생성한 객체를 선언하여 str에 대입하게 된다.
		//t클래스에 있는 .change메소드에 변수들을 대입을 한다.
		t.change(a, b, str);
		//change 내에서 출력한 값은 30/210/team4bigtower 출력이 된다.
		//그러나 a는 기본타입의 변수이고 main메소드에 안에 있는 변수값에는 변화가 없다.
		// b는 참조타입의 변수이며 배열에 직접적으로 값을 더해준거이고
		//str  String클래스형 객체에 값을 더해 지려면 객체를 생성을 해야한다고 생각한다.
		t.display(a, b, str);
	}

	void change(int a, int b[], String str) {
		a += 10;
		b[1] += 10;		
		str += "bigtower";
		
		System.out.println("change내에서 출력한 값 : "+a + "/" + b[1]+"/" +str);
	}

	void display(int a, int b[], String str) {
		System.out.print("change밖으로 가져가서 출력한 값 : "+a + "/" + b[1]+"/" +str);
	}
}
