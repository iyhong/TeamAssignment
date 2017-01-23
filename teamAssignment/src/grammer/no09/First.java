package grammer.no09;

public class First {
	public static void main(String[] args) {
		new First().test();
	}

	void test() {
		new Second().test();
	}
}

class Second extends First {
	
	void test() {
		//super.test();
		System.out.println("test");
	}
}