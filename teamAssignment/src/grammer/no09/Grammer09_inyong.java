package grammer.no09;

public class Grammer09_inyong{

}
/*
 각번호별 출력되는 결과와 그이유를 써오세용~

①

public class First {
 public static void main(String[] args){
  System.out.println("test");
 }
}
// 출력결과 : test
/*
②

public class First {
 public static void main(String[] args){
  new Second().test();
  // Second 클래스는 First클래스의 내부클래스이다.
  // 내부클래스를 객체화 하려면 바깥클래스를 객체화하고
  // 
  // First f = new First();
  // First.Second s = f.new Second();
  // s.test();
 }
 class Second extends First{
  void test(){
   System.out.println("test");
  }
 }
}
//컴파일 오류로 출력안됨
/*
③
public class First {
 public static void main(String[] args){
 // 익명클래스로 클래스 선언을 따로 해주지 않고 
 // 그자리에서 바로 만들어 사용하는 것 
  new First(){
   void test(){
    System.out.println("test");
   }
  }.test();
 }
}
//출력결과 : test
/*
④
public class First {
 public static void main(String[] args){
 // 자기자신의 test메서드 호출
  new First().test();
 }
 void test(){
 // test메서드는 Second클래스의 test메서드를 호출한다.
  new Second().test();
 }
}
class Second extends First{
 void test(){
  System.out.println("test");
 }
}
// 출력결과 : test
/*
⑤
public class First {
 public static void main(String[] args){
 // Second클래스의 test메서드 호출
  new Second().test();
 }
}
class Second extends First{
 void test(){
  System.out.println("test");
 }
}
// 출력결과 : test
*/