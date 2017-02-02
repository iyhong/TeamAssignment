package grammer2.no03;
/*
	출력되는 결과는 ?
	그 이유는?
*/
public class Grammer203 {
	public static void main(String[] args) {
		Grammer203 t = new Grammer203();
		int a = 20;
		int b[] = { 100, 200, 300 };
		String str = new String("team4");
		t.change(a, b, str);
		t.display(a, b, str);
	}

	void change(int a, int b[], String str) {
		a += 10;
		b[1] += 10;
		str += "bigtower";
	}

	void display(int a, int b[], String str) {
		System.out.print(a + "/" + b[1]+"/" +str);
	}
}
