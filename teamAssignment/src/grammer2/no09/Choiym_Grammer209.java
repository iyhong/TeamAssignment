package grammer2.no09;
/*
 * 클래스가 다음과 같을 때 innerMethod()메서드 안에서 참조할 수 있는 변수는 무엇무엇인가?
 * */

public class Choiym_Grammer209 {
	 
	 public int a=1;
	 public int b=2;
	 
	 public static void main(String[] args){
		 Choiym_Grammer209 c = new Choiym_Grammer209();
		 c.outerMethod(3);
		 //메인메소드에서 Choiym_Grammer209객체를 생성하고 outerMethod에 매개변수값으로 3을 넣어 실행
	 }
	 
	 public void outerMethod(final int c){
	  int d=4;
	  
	  class Inner{
	   void innerMethod(int e){
	    /* 이 블럭에서 참조할 수 있는 변수는?*/
		  /*내부클래스 Inner는 외부의 멤버변수에 접근이 가능하다 c는 final로 선언된 변수이기때문에
		   참조 할 수 있다. 
		   a,b,c,d,e
		   */
		   System.out.println("a : "+a);
		   System.out.println("b : "+b);
		   System.out.println("c : "+c);
		   System.out.println("d : "+d);
		   System.out.println("e : "+e);
		   //변수를 참조할 수 있는지 확인.
		   
		 
	   }
	  }
	  
	  Inner in = new Inner();
	  in.innerMethod(5);
	  //Inner 객체를 생성하여 e에 값을 넣어줌
	 }
	}
	

