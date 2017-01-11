package grammer.no07;

import java.util.*;
/*
	출력결과
	1번부터 5번까지 true or false가 나오는 이유를 찾아 오세요~
	ex) 1번이 왜 true인지, 3번이 왜 false인지..
*/
public class Grammer07_inyong {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		String s1 = new String("one");
		String s2 = new String("one");
		
		StringBuffer sf1 = new StringBuffer("one");
		StringBuffer sf2 = new StringBuffer("one");

		Date d1 = new Date();
		Date d2 = new GregorianCalendar(2011,01,01).getTime();
		Date d3 = new GregorianCalendar(2011,01,01).getTime();
		Date d4 = new Date();
		
		System.out.println("d1:"+d1.getTime());
		System.out.println("d4:"+d4.getTime());
		System.out.println("d2:"+d2.getTime());
		System.out.println("d3:"+d3.getTime());
		
		//Integer와 String클래스는 equals 메서드를 오버라이딩 해서 각각의 객체가 가지고있는 값을 비교해준다.
		System.out.println("1번 :"+i1.equals(i2));
		System.out.println("2번 :"+s1.equals(s2));
		//StringBuffer 클래스는 equals메서드를 오버라이딩하지않고 Object의 equals를 그대로 상속받아사용하는데,
		//Object 의 equals는 메모리 주소 자체만 비교하기때문에 서로다른 객체가 같은값을 가지고 있더라도 
		//객체의 메모리 주소는 다르기때문에 false가 리턴된다.
		System.out.println("3번 :"+sf1.equals(sf2));
		//d2,d3은 날짜를 지정했기때문에 시간은 0000으로 되어 같은날짜를 가지고 객체를 만들었으므로
		//같은 값을 가지게된다.
		System.out.println("4번 :"+d2.equals(d3));
		//Date 클래스로 객체를 생성할때 system의 시간을  1/1000초 단위로 저장하는데...
		//d1객체 생성하고 d2,d3객체를 생성하는데 시간이 흐르므로 d4객체를 생성할때는 시간이 다르다
		//그래서 false
		System.out.println("5번 :"+d1.equals(d4));
	}
}
