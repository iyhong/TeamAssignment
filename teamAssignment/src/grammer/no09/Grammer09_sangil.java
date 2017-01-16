package grammer.no09;

public class Grammer09_sangil {
	
	
	/* 
	 각번호별 출력되는 결과와 그이유를 써오세용~
	 */

	//①
	/*public class First {
	 public static void main(String[] args){
	  System.out.println("test"); //main 메서드를 실행하면 test 문자열을 출력한다.
	 }
	}*/
	 
	//②
	/*
	public class First {
	 public static void main(String[] args){
	  new Second().test();
	 }
	 class Second extends First{ //First클래스의 내부클래스이자 First를 상속받은 Second 클래스이다.
	 							 //정확히는 모르겠으나 익명클래스이므로 클래스의 선언과 객체생성을 동시에 하는 일회성 클래스여서
	 							  *  main 메서드에서 Second 객체를 생성후 test메서드를 호출할 수 없다. 
	  void test(){
	   System.out.println("test"); 
	  }
	 }
	}
	*/
	//③
	/*public class First {
	 public static void main(String[] args){
	  new First(){					//First 클래스의 객체를 생성한 후 
	   void test(){					//객체가 test 메서드를 만들고 
	    System.out.println("test");
	   }
	  }.test();						//test메서드를 호출한다. 그러면 "test" 문자열이 출력된다.
	 }
	}*/
	//④
	/*public class First {
	 public static void main(String[] args){
	  new First().test(); //main 메서드를 실행하면 First클래스 객체를 생성해 test 메서드를 호출한다.
	 }
	 void test(){
	  new Second().test(); //First 클래스의 test 메서드는 Second 클래스 객체를 생성해 test메서드를 호출한다.
	 }
	}
	class Second extends First{
	 void test(){
	  System.out.println("test"); //Second 클래스의 test 메서드는 "test"문자열을 출력시킨다.
	  							  //즉, main 메서드가 실행되면 "test"문자열을 출력한다. 
	 }
	}*/
	//⑤
	/*public class First {
	 public static void main(String[] args){
	  new Second().test(); //main 메서드가 실행되면 Second 클래스의 객체를 생성해 test 메서드를 호출한다.
	 }
	}
	class Second extends First{
	 void test(){ //
	  System.out.println("test");
	 }
	}*/
	
}
