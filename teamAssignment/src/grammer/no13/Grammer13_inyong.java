package grammer.no13;

public class Grammer13_inyong {
	public static void main(String[] args) {
		test();
	}

	static void test() {
		try {
			System.out.println("try");
			System.exit(0);
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}
}
