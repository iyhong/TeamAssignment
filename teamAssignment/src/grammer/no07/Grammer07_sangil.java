package grammer.no07;

import java.util.Date;
import java.util.GregorianCalendar;
/*
	출력결과
	1번부터 5번까지 true or false가 나오는 이유를 찾아 오세요~
	ex) 1번이 왜 true인지, 3번이 왜 false인지..
*/
public class Grammer07_sangil {
	public static void main(String[] args) {
		//Integer클래스는 Wrapper 클래스로서 객체를 생성하면 하나의 int값만을 저장할 수 있다. 
		//값을 변경할 수 없고 참조하거나 새로운 객체를 생성해야 한다.
		Integer i1 = new Integer(1); //i1객체에 int값 1이 셋팅된다.
		Integer i2 = new Integer(1); //i2객체에 int값 1이 셋팅된다.
		
		//String 클래스는 하나의 객체를 생성하면 그 값을 수정할 수 없다.
		String s1 = new String("one"); //s1에 String값 "one"이 셋팅된다.
		String s2 = new String("one"); //s2에 String값 "one"이 셋팅된다.
		
		//StringBuffer 클래스는 자바 프로그램 내에서 변하는 문자열을 다룰 때 사용한다. 
		//한 객체에 16개의 문자열을 저장할 수 있다.
		StringBuffer sf1 = new StringBuffer("one");
		StringBuffer sf2 = new StringBuffer("one");

		Date d1 = new Date();
		Date d2 = new GregorianCalendar(2011, 7, 15).getTime(); //GregorianCalendar는 Calendar 클래스를 상속받음.
		Date d3 = new GregorianCalendar(2011, 7, 15).getTime(); //getTime메서드를 통해 d2와 d3객체에 2011년 7월15일 00시00분00초의 시간이  얻어진다. 
		Date d4 = new Date();
		//equals 메서드는 값을 비교하는 메서드이다. '==' 연산자는 주소값을 비교하는 연산자이다.
		System.out.println("1번 :"+i1.equals(i2)); //i1=i2 둘다 int값 1을 가지므로 true
		System.out.println("2번 :"+s1.equals(s2)); //s1객체와 s2객체 둘 다 같은 문자열값을 가지고 있으므로 true
		System.out.println("3번 :"+sf1.equals(sf2)); //sf1과 sf2가 같은 문자열을 가지고 있기 때문에 true인 것 같지만 StringBuffer클래스는
													//애초에 equals 메서드를 사용할 수 없다. 사용하려면 String으로 변환 후에 사용해야 한다. 따라서 false
		System.out.println("4번 :"+d2.equals(d3));  //d2와 d3는 같은 시간값을 가지고 있기 때문에 true
		System.out.println("5번 :"+d1.equals(d4)); //Date클래스를 이용하여 d1과 d4객체를 생성한 후 현재 시간값을 넣어주었다. 먼저 생성된 d1과 그 후에 생성된 d4는 
												  //아주 미세한 시간 차이가 있다. 따라서 값이 다르므로 false
		Member m1 = new Member();
		Member m2 = new Member();
		System.out.println(m1.equals(m2));
	}
}
class Member{
	
}