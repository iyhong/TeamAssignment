package grammer.no04;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//주석달기
public class Grammer04 {
	public static void main(String[] args) {
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		t1.setX(5);
		t2.setX(10);
		System.out.println(t1.getX());
		System.out.println(t2.getX());
	}
}

class Test {
	private static Test t;
	private int x;

	private Test() {
	}

	public static Test getInstance() {
		if (t == null) {
			t = new Test();
		}
		return t;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
