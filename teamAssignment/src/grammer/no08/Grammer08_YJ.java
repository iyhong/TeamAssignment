package grammer.no08;

public class Grammer08_YJ {

/*
 * 다음 프로그램중 컴파일시 에러가 발생하는 것은?
	답 찾고 
	이유 적기..
	1번 부모클래스가 protected 인데 자식클래스 접근지정자가 default이다.
	public > protected > private > default 순으로 범위가 정해지는데 
	default는 다른 패키지와의 클래스 선언과 생성자/메소드/필드의 호출이 불가능하기 때문에
	컴파일 에러가 난다.

 
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
public은 모든 것이 접근 가능하기때문에 오류가 나지않는다.
예외처리를 할때 상위클래스에서 던지는 예외나 그 보다 더 하위 클래스의 예외만을 던질수있다.

③
import java.io.*;
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 protected void test(int x){}
}
외부에서 접근이 불가능 하지만 Child클래스가 parent클래스를 상속받았기 때문에 접근이가능하다
부모클래스에서 예외를 던지지만 하위클래스에서는 예외를 던지지 않아도된다.


④
import java.io.*;
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 protected void test(int x) throws IOException{}
}
부모클래스보다 더 큰 범위의 예외처리를 자식클래스는 할수없지만 Exception의 범위가 IOException의 
범위보다 넓으므로 에러가 나지않는다.
 
*/	
}
