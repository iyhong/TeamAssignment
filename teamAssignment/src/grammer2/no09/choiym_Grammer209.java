package grammer2.no09;
/*
 * 클래스가 다음과 같을 때 innerMethod()메서드 안에서 참조할 수 있는 변수는 무엇무엇인가?
 * */

public class choiym_Grammer209 {
	 
	 public int a=1;
	 public int b=2;
	 
	 public void outerMethod(final int c){
	  int d=3;
	  
	  class Inner{
	   void innerMethod(int e){
	    /* 이 블럭에서 참조할 수 있는 변수는?*/
		  /*내부클래스 Inner는 외부의 멤버변수에 접근이 가능하다 그러나 메소드 안에 선언된
		   d는 outerMethod의 지역변수이기때문에 참조 할 수 없고 c는 final로 선언된 변수이기때문에
		   참조 할 수 있다. 따라서 choiym_Grammer209의 멤버변수인 a,b와 final로 선언된 상수 c, 그리고
		   inner클래스 내부의 매개변수인 e 를 참조 할 수 있다.
		   a,b,c,e
		   *
		   */
		 
	   }
	  }
	 }
	}
	

