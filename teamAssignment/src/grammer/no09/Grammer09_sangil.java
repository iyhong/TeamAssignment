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
	 class Second extends First{ //현재 상태는 컴파일 오류가 난다. Second를 객체화할 수 없다고 ...
	 							   우선 외부클래스인 First 클래스를 객체화하고, 내부클래스를 객체화 해야 한다.
	  							  First first = new First();
	  							  * First.Second second = first.new Second();
	  							  * second.test();
	  							  * 이렇게 하면 실행된다.
	  void test(){
	   System.out.println("test"); 
	  }
	 }
	}
	*/
	//③
	/*public class First {
	 public static void main(String[] args){
	  new First(){					//익명 클래스로  클래스의 선언과 동시에 객체를 생성하는 일회성 클래스이다.
	   void test(){					// 객체를 생성하며 바로 메서드를 선언하고 호출하는 형태이다.
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
