package grammer.no09;

public class Grammer09_choiym {

}
/*
 각번호별 출력되는 결과와 그이유를 써오세용~

①
public class First {
 public static void main(String[] args){
  System.out.println("test");
  "test"라는 문자열이 콘솔에 출력된다.
 }
}
②
public class First {
 public static void main(String[] args){
  new Second().test();
  //내부클래스는 외부클래스 객체를 통해서 생성할 수 있기때문에 Second 객체를 생성할 수 없다.
 }
 class Second extends First{
 	//First 클래스를 상속받았다
  void test(){
   System.out.println("test");
  }
 }
}
③
public class First {
 public static void main(String[] args){
  new First(){
   void test(){
    System.out.println("test");
   }
  }.test();
 }
}
// 내부클래스로 자기 자신의 객체를 생성하고 그 안에 test메소드를 선언하고 test를 콘솔에 출력하는 기능을 선언한 뒤
// new First().test(); 를 한것과 같음 따라서 test가 콘솔에 출력됨 
 

④
public class First {
 public static void main(String[] args){
  new First().test();
 }
 void test(){
  new Second().test();
 }
}
class Second extends First{
 void test(){
  System.out.println("test");
 }
}
// 자기자신 클래스의 객체를 생성하고 test 메소드를 호출 -> test메소드는 Second클래스의 test메소드를 호출하는 기능을 함
// Second클래스의 test 메소드는 콘솔에 test를 출력하는 기능을 가지고 이는 문제없이 실해오디어 test문자열이 콘솔에 출력된다.


⑤
public class First {
 public static void main(String[] args){
  new Second().test();
 }
}
class Second extends First{
 void test(){
  System.out.println("test");
 }
}
// Second 클래스는 First클래스의 내부클래스가 아니기때문에 바로 객체생성이 가능하다. 따라서 test가 콘솔창에 출력된다.
*/