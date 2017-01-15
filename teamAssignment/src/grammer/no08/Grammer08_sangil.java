package grammer.no08;

public class Grammer08_sangil {


/* 
 * 다음 프로그램중 컴파일시 에러가 발생하는 것은? 1번
	답 찾고 
	이유 적기..
*/
	
/*①
	class Parent {
		protected void test(int x) throws Exception{}
	}
	class Child extends Parent{
		@Override
 		void test(int x) throws Exception{} //부모 클래스는 접근지정자가 protected인데 자식클래스는 접근지정자가 default(package-private)이다.
 											//이 경우에는 자식클래스가 부모클래스보다 더 좁은 범위의 접근지정자를 갖는 것인데 이럴 경우에는 컴파일 오류가 난다.
 											//접근지정자는 넓은 순부터 public - protected - default - private 이렇게 4가지가 있다.
	}

②
	class Parent1 {
		protected void test(int x) throws Exception{}
	}
	class Child1 extends Parent{ //부모클래스의 접근지정자가 protected이고 자식클래스의 접근지정자가 public으로 서로 다르지만 
								//protected보다 더 넓은 범위를 가진 public을 사용할 수 있다. 
		@Override
		public void test(int x) throws Exception{} 
	}
	
③
	import java.io.*;
	class Parent {
		protected void test(int x) throws Exception{}
	}
	class Child extends Parent{
		@Override
		protected void test(int x){} //부모클래스에서 예외를 던졌으나 자식클래스에서는 예외를 던지지 않아도 된다.
	}
	
④
	import java.io.*;
	class Parent2 {
		protected void test(int x) throws Exception{}
	}
	class Child2 extends Parent{
		@Override
		protected void test(int x) throws IOException{} //부모클래스에서는 Exception을 던졌으나 자식클래스에서는 IOException을 던졌다.
														//모든 예외의 상위에 있는 것이 Exception으로 이보다 좁은 범위의 예외로는 IOException
														 * ,InterreptedException, RuntimeException 등이 있다.
														 *  결론적으로, 상속받은 자식클래스는 더 좁은 범위의 예외를 던져도 컴파일 오류가 나지 않는다.
	}
 
	
}*/
