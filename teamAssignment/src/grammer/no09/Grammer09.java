package grammer.no09;

public class Grammer09 {
	protected void abc(){}
}
/*
 각번호별 출력되는 결과와 그이유를 써오세용~

①
public class First {
 public static void main(String[] args){
  System.out.println("test");
 }
}
②
public class First {
 public static void main(String[] args){
  new Second().test();
 }
 class Second extends First{
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
*/