package grammer2.no09;
/*
 * 클래스가 다음과 같을 때 innerMethod()메서드 안에서 참조할 수 있는 변수는 무엇무엇인가?
 * */

public class Grammer209 {
	 
	 public int a=1;
	 public int b=2;
	 
	 public void outerMethod(final int c){
	  int d=3;
	  
	  class Inner{
	   void innerMethod(int e){
	    /* 이 블럭에서 참조할 수 있는 변수는?*/
	   }
	  }
	 }
	}
	

