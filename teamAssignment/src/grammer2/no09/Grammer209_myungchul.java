package grammer2.no09;
/*
 * 클래스가 다음과 같을 때 innerMethod()메서드 안에서 참조할 수 있는 변수는 무엇무엇인가?
 * 참조할수 있는 변수가 a,b,e 3개 밖에 없다.
 * 내부클래스는 외부클래스의 변수를 가질수 있다고 생각한다.
 * 외부메서드의 지역 변수를 가져 올수가 없다.
 * 메소드안에 있는 변수를 선언을 했어도 내부클래스에서 가질수가 없다.
 * */

public class Grammer209_myungchul {

	public int a = 1;
	public int b = 2;
	public int c = 2;
	public void outerMethod(final int c) {
		int d = 3;

		class Inner {
			void innerMethod(int e) {
				/* 이 블럭에서 참조할 수 있는 변수는? */
				a = 1;
				b = 1;
				// c = 1;
				// d = 1;
				e = 1;
			}
		}
	}
}
