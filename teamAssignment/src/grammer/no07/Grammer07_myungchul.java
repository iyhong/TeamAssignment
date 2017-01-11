package grammer.no07;

import java.util.*;
/*
	출력결과
	1번부터 5번까지 true or false가 나오는 이유를 찾아 오세요~
	ex) 1번이 왜 true인지, 3번이 왜 false인지..
*/
public class Grammer07_myungchul {
	public static void main(String[] args) {
		/*equals() 메소드는  객체끼리의 내용을 비교할수 있다.
		즉 대상의 내용 자체를 비교를한다.
		equals(Object obj) 객체의 래퍼런스가 아닌 객체의 내용이 같은지를 판단하는 메서드
		
		참조형 타입 (Reference Type):클래스를 사용하여 값이 저장되어 있는 주소를 저장 
		ex) String s1 = new String("one");
		*/
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		//1번은 true로 출력이 되었다.
		//Integer는 Wrapper class이다, 래퍼 클래스는 기본형을 클래스를 감싼 형태이다.
		//Integer i1/i2 객체에 있는 데이터 영역에는 '1'라는 숫자가 들어가 있다.
		//equals() 메서드는 객체끼리의 내용을 비교하기 때문에 i1와 i2가 1이라는 숫자가 같아서 true로 리턴한다.
		String s1 = new String("one");
		String s2 = new String("one");
		//String클래스인 s1 변수를 선언하고  String 생성자 객체를 만드고, 객체의 데이터영역에 문자열 "one"를 s1변수에 대입한다.
		//마찬가지로 s2변수에 "one"를 대입한다.
		//equals()메서드는 내용을 비교하기 떄문에 s1와s2가 문자열의 내용이 같이 떄문에 true로 리턴한다.

		StringBuffer sf1 = new StringBuffer("one");
		StringBuffer sf2 = new StringBuffer("one");
		//StringBuffer는 문자열을 추가하거나 변경할때 주로 사용하는 자료형이다.
		//메모리를 이용한 문자열 관리이며 값을 비교하는거 보다는 메모리의 주소를 비교하게 되어 달라서 false로 리턴한다.
		//단, 내용을 비교을 하게 위해서는 (sf1.toString()).equals(sf2.toString())로 하게 되면 String로 전환이 되어 
		//내용을 비교하기 때문에 true로 리턴한다. 3-2

		Date d1 = new Date();
		Date d2 = new GregorianCalendar(2011, 7, 15).getTime();
		Date d3 = new GregorianCalendar(2011, 7, 15).getTime();
		Date d4 = new Date();
		//Date킄래스는 현재 시간을 표현한다.
		//4번이 true가 되는 경우는 GregorianCalendar 클래스를 지정한 날짜에서 getTime메서드를 사용하여 시간을 더한다.
		//d2나 d3는 지정한 날짜와 시간이 고정되어 같기 때문에 true로 리턴하게 된다.
		//5번이 false로 리턴되는 경우는 d1과 d4의  Date() 메서드에 날짜가 같다. 단, 시간은 다르다. d1가 실행되고 나서 d4에 시간이 다른게 입력이 된다.
		//d1에 시간이 11:53:01:21라면 d4에는 11:53:02:10 입력이 되고 equals()메서드에서 내용을 비교 하기 되면 내용이 달라서 false로 리턴이 된다. 
		
		
		System.out.println("1번 :"+i1.equals(i2));
		System.out.println("2번 :"+s1.equals(s2));
		System.out.println("3번 :"+sf1.equals(sf2));
		System.out.println("3-2번 :"+(sf1.toString()).equals(sf2.toString()));
		System.out.println("4번 :"+d2.equals(d3));
		System.out.println("5번 :"+d1.equals(d4));
	}
}
