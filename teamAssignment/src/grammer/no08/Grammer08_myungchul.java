package grammer.no08;

public class Grammer08_myungchul {
	
	//답은 1
	/*
	 * 문제의 중점은 상속관계인 부모와 자식 클래스 내에 있는 메소드에 접근제어자인 protected / private / pulbic 
	 * 접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 메소드는 동일 패키지내의 클래스 또는 해당
	 * 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능하다. 
	 * 		1 		2			 3			 4 숫자가 ->방향으로 접근 범위가 크다고 보면 된다.
	 * private -> default -> protected -> public 순으로 보다 많은 접근을 허용한다고 한다.
	 * 부모클래스의 메소드가 protected을
	 * protected void test(int x) throws Exception{}
	 * 자식클래스에 부모클래스 메소드를 상속을 받고 오버라이딩을 한다.
	 * 그러나 자식클래스에서는 메소드가 접근제어자가 없고 선언되어 있지 않아 default이므로 protected 접근제어자 보다 접근 권한이 적어 문제가 발생이 된거다
	 * void test(int x) throws Exception{}
	 * 
	 * 접근 권한
	 * 				클래스	동일클래스		하위 클래스	모든클래스
	 * public		O			O			O			O
	 * protected	O			O			O			X
	 * default		O			O			X			X
	 * private		O			X			X			X
	 */
/*
 * 다음 프로그램중 컴파일시 에러가 발생하는 것은?
	답 찾고 
	이유 적기..
①
class Parent {
	protected void test(int x) throws Exception{}
}
class Child extends Parent{
	@Override
	void test(int x) throws Exception{} 
}

②
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
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
 protected void test(int x){}
}

④
import java.io.*;
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 protected void test(int x) throws IOException{}
}
 
*/	
}
