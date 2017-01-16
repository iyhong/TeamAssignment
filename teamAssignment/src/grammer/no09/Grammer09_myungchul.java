package grammer.no09;

public class Grammer09_myungchul {
	
	//public class First {
		 public static void main(String[] args){
		  new Second().test();
		 }
		 static class Second extends Grammer09_myungchul{
		  void test(){
		   System.out.println("test");
		  }
		 }
		//}
	
}
/*
 각번호별 출력되는 결과와 그이유를 써오세용~

①
public class First {
 public static void main(String[] args){
  System.out.println("test");
 }
}
First 클래스 내에 있는 main메소드 안에 있는 System.out.println("test"); 출력하게 된다. test
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
위에 있는 문법은 오류를 발생하게 된다.
검색을 해본 결과 first 클래스내에 있는 main 메서드 앞에 static때문에 발생한다고 한다.
그러나 아래에 있는 문법으로 고치고 실행을 할려면
내부클래스 앞에 static를 붙혀 줘야 test로 결과값이 출력이 된다.
인스턴스를 생성하면, 각 인스턴스들은 서로 독립적기 때문에 서로 다른 값을 유지
각인스턴스들이 공통적으로 같은값이 유지되어야 경우 static을 붙여야한다고 한다.


public class First {
	 public static void main(String[] args){
		  new Second().test();
		 }
		 static class Second extends Grammer09_myungchul{
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
new 생성자 first(){내의 void test()메서드안에 있는{ 출력문이 } }.test(); .test()의 통해서 test라는 결과 값이 출력한다.
④
public class First {
	public static void main(String[] args) {
		new First().test();
	}

	void test() {
		new Second().test();
	}
}

class Second extends First {
	void test() {
		System.out.println("test");
	}
}
클래스 First내의 main메소드내에 있는 new First()생성자에 있는.test()라는 메소드를 호출한다.
void test() 매소드내에 있는 new Second()생성자에 test()메소드를 호출을한다.
자식 클래스인 Second가 부모클래스를 First를 상속을 받아
void test() 메소드내의 있는 출력문이  test로 출력이 된다.

⑤
public class First {
	public static void main(String[] args) {
		new Second().test();
	}
}

class Second extends First {
	void test() {
		System.out.println("test");
	}
}
자식 클래스인 Second가 부모 클래스인 First를 상속을 받아
main 메소드내에 있는 new 생성자 메소드Second()에 있는 .test()를 호출 한다.
자식클래스인 test()메소드내의 있는 출력문이 실행되어 test라는 결과값이 나온다.

*/