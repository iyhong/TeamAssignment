package grammer2.no03;
/*
	출력되는 결과는 ?
	그 이유는?
*/
public class Grammer203_inyong {
	public static void main(String[] args) {
		Grammer203_inyong t = new Grammer203_inyong();
		int a = 20;
		int b[] = { 100, 200, 300 };
		String str = "team4";
		System.out.println("main의 str.hashCode:"+str.hashCode());
		t.change(a, b, str);
		//int a
		//실행결과는 20/210/team4 이다.
		//이유는 a는 primitive variable(기본데이터형) 이기 때문에 매개변수로 a가 전달될때
		//a가 가지고있던 값인 20만 복사되어 전달되기때문에 전달받은 값을 더하더라도 main에 있는 a의 값은 변하지 않는다.
		//change 메서드의 지역변수 a의 값만 바뀜.
		
		//int[] b
		//이와 반대로 b[]는 참조데이터형이기 때문에 b변수에는 참조값(주소값)이 들어있다.
		//그래서 매개변수로 전달될때 배열자체가 복사되어 넘어가는것이 아니고, 참조값이 전달되고
		//change 메서드안에서의 지역변수에 배열의 참조값을가지고 b[1]의 값 즉 200에 +10을 하기때문에
		//배열의 1번째 인덱스의값이 210으로 바뀌고 같은 참조값을 가진 main의 b[1]값을 출력하면 210이 출력되게 된다.
		
		//String str
		//이와 반대로 예외적으로 String 변수도 참조데이터형인데 String객체는 프로티를 가지는데
		//프로퍼티의 값을 변경하면 값이 바뀌는게 아니라 새로운 문자열을 만들어 그곳을 다시 참조하는 식이다.
		//따라서 매개변수로 해당 참조값을 전달 받았다해도, 값을 변경하거나 하면 새로운 참조값이 생기기 때문에 영향이없다.
		//즉 main의 str변수는 똑같은 값을 참조하고있고, chage의 str변수는 처음에 main의 str과 같은곳을 참조햇지만,
		//값이바뀌면서 새로운 참조값을 가지게 된다.
		//그래서 참조변수임에도 불구하고 값이 바뀌지 않은것처럼 보인다.
		t.display(a, b, str);
		System.out.println();
		String string1 = new String("abc");
		String string2 = new String("abc");
		string1 = string1.toLowerCase();
		System.out.println(string1.equals(string2));
		System.out.println(string1==string2);
	}

	void change(int a, int b[], String str) {
		a += 10;
		b[1] += 10;
		System.out.println("chage의 str.hashCode(변경전):"+str.hashCode());
		str += "bigtower";
		System.out.println("chage의 str.hashCode(변경후):"+str.hashCode());
		System.out.println(str);
	}

	void display(int a, int b[], String str) {
		System.out.print(a + "/" + b[1]+"/" +str);
	}
}
