package grammer.no12;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//그 이유는?
//clone 메서드를 사용하려면 Cloneable 을 구현해야한다..
import grammer.no09.Grammer09;

public class Grammer12_inyong extends Grammer09{
	int x;
	int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	Grammer12_inyong(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public Grammer12_inyong copy() {
		Object obj = null;
		try {
			obj = clone();
		} catch (CloneNotSupportedException e) {
		}
		return (Grammer12_inyong) obj;
	}

	public static void main(String[] args) {
		Grammer12_inyong original = new Grammer12_inyong(3, 5);
		Grammer12_inyong copy = original.copy();
		original.setX(10);
		System.out.println(original);
		System.out.println(copy);
		Grammer09 g09 = new Grammer09();
		g09.abc();
		try {
			Grammer12_inyong clone = (Grammer12_inyong) original.clone();
			clone.setY(10);
			System.out.println(clone);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
