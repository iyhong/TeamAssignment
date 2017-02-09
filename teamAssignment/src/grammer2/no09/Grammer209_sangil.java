package grammer2.no09;
/*
 * 클래스가 다음과 같을 때 innerMethod()메서드 안에서 참조할 수 있는 변수는 무엇무엇인가?
 * */

public class Grammer209_sangil {
	 
	 public int a=1;
	 public int b=2;
	 
	 public void outerMethod(final int c){
	  int d=3;
	  
	  class Inner{
	   void innerMethod(int e){ //내부클래스에서는 외부클래스의 어떤 변수든지 참조할 수 있다. 
		   						//따라서 a,b,c,d,e 모두 참조가 가능하다.
	    /* 이 블럭에서 참조할 수 있는 변수는?*/
	   }
	  }
	 }
	}
	

