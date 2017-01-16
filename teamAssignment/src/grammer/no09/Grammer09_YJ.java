package grammer.no09;

public class Grammer09_YJ {

}
/*
 각번호별 출력되는 결과와 그이유를 써오세용~

①
public class First {
 public static void main(String[] args){
  System.out.println("test");
 } 
 //System.out.println()을 통해 test라는 문자열을 출력해준다
 //test  
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
	실행 시켜보기전에 그냥 test출력되는줄 알았는데 확인해보니까 컴파일 에러가 뜨더라구요 그래서 왜그런지 계속 생각해보고 
	자세히 봤는데 익명클래스는 선언과 생성을 동시에 하고 단 하나의 객체만 생성할 수 있는 
	일회용 클래스인데
	First클래스 안에서 Second클래스가 선언이 두번 되어서? 컴파일 에러가 나는거 같아요
	 
	
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
 First()객체를 생성 후 .test()메서드를 선언 
 .test메서드를 호출 후 실행 하게되면
 test 문자열이 출력된다. 
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

main이 실행되면
First 객체 생성 후 First 안에 있는 test 메서드 호출한다
test 메소드가 실행되면 Second객체를 생성 후 test메서드를 호출한다
Second클래스 안에 있는 test메소드를 실행하면
test 문자열이 출력된다.
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
First클래스 안에있는 메인을 실행하면 First를 상속받은
Second 클래스 내에 객체를 생성 하고 test 메소드를 호출 한다. 
Second클래스 안에 있는 test메소드를 실행하면
test 문자열이 출력된다

 */

