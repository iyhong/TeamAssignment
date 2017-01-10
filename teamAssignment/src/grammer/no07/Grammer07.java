package grammer.no07;

import java.util.*;
/*
	출력결과
	1번부터 5번까지 true or false가 나오는 이유를 찾아 오세요~
	ex) 1번이 왜 true인지, 3번이 왜 false인지..
*/
public class Grammer07 {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		String s1 = new String("one");
		String s2 = new String("one");
		
		StringBuffer sf1 = new StringBuffer("one");
		StringBuffer sf2 = new StringBuffer("one");

		Date d1 = new Date();
		Date d2 = new GregorianCalendar(2011,07,15).getTime();
		Date d3 = new GregorianCalendar(2011,07,15).getTime();
		Date d4 = new Date();
		
		System.out.println(d1.getTime());
		System.out.println(d4.getTime());
		System.out.println(d2.getTime());
		System.out.println(d3.getTime());
		
		System.out.println("1번 :"+i1.equals(i2));
		System.out.println("2번 :"+s1.equals(s2));
		System.out.println("3번 :"+sf1.equals(sf2));
		System.out.println("4번 :"+d2.equals(d3));
		System.out.println("5번 :"+d1.equals(d4));
	}
}
