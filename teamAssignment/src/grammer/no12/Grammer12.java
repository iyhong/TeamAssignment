package grammer.no12;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//그 이유는?

public class Grammer12{
	int x;
	int y;

	Grammer12(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public Grammer12 copy() {
		Object obj = null;
		try {
			obj = clone();
		} catch (CloneNotSupportedException e) {
		}
		return (Grammer12) obj;
	}

	public static void main(String[] args) {
		Grammer12 original = new Grammer12(3, 5);
		Grammer12 copy = original.copy();
		System.out.println(original);
		System.out.println(copy);
	}
}
