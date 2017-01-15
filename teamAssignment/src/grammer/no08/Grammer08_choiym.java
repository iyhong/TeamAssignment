package grammer.no08;

public class Grammer08_choiym {

/*
 
	
①
class Parent {
 protected void test(int x) throws Exception{}
}

class Child extends Parent{
 @Override
 void test(int x) throws Exception{}
}

 protected는 default보다 오픈되어있다. public 아무데서나 접근가능 protected 는 같은패키지내,혹은 다른패키지에서 상속받아 접근가능 default는
 같은 패키지내에서만 접근가능, private는 같은클래스 내부에서만 접근가능
 부모클래스에 선언된 protected보다 더 좁은범위의 접근지정자인 default를 사용했기때문에 틀린다.

②
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 public void test(int x) throws Exception{} 
}

 부모클래스에 선언된 protected보다 더 넓은범위의 접근지정자인 public을 사용했기때문에 맞다

③
import java.io.*;
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 protected void test(int x){}
}
	예외가 발생하는 상황에 대해서 자녀클래스는 throws Exception을 선언하지 않았기때문에 직접 처리해주면 된다.
④
import java.io.*;
class Parent {
 protected void test(int x) throws Exception{}
}
class Child extends Parent{
 @Override
 protected void test(int x) throws IOException{}
}
 예외가 발생하는 상황에 대해 자녀클래스는 IOException이 발생하는경우에만 예외를 던지고 나머지는 직접 처리해줘야한다.
 
 풀었는데 잘 모르겠습니다
*/	
}
