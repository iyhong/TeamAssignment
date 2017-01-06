package grammer04;

//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//컴파일시 에러가 발생한다면 라인번호와 그 원인과 해결책을 설명하시오.
//주석달기
public class Grammer04_choiym {
	public static void main(String[] args) {
		TestChoiym t1 = TestChoiym.getInstance();
		TestChoiym t2 = TestChoiym.getInstance();
		t1.setX(5);
		t2.setX(10);
		System.out.println(t1.getX());
		System.out.println(t2.getX());
		//Test타입의 t는 static 에 선언된 타입이므로 t1객체와 t2객체는 같은 객체를 의미하게 된다.
		//따라서 10 10 두번 출력된다.
	}
}
// 
class TestChoiym {
	private static TestChoiym t;
	private int x;

	private TestChoiym() {
	}

	public static TestChoiym getInstance() {
		if (t == null) {
			t = new TestChoiym();
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
