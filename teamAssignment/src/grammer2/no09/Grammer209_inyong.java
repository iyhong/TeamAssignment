package grammer2.no09;
/*
 * 클래스가 다음과 같을 때 innerMethod()메서드 안에서 참조할 수 있는 변수는 무엇무엇인가?
 * */

public class Grammer209_inyong {

	public int a = 1;
	public int b = 2;
	
	public static void main(String[] args){
		
		new Grammer209_inyong().outerMethod(3);
	}
	
	public void outerMethod(final int c) {
		int d = 4;
		
		class Inner {
			
			//모든변수를 참조가능하다.
			void innerMethod(int e) {
				
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				
				/* 이 블럭에서 참조할 수 있는 변수는? */
			}
		}
		//객체생성은 선언아래에 해야함
		Inner in = new Inner();
		in.innerMethod(5);
	}
}
