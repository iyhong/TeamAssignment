package grammer.no07;

import java.util.*;
/*
	출력결과
	1번부터 5번까지 true or false가 나오는 이유를 찾아 오세요~
	ex) 1번이 왜 true인지, 3번이 왜 false인지..
*/
public class Grammer07_choiym {
	public static void main(String[] args) {
		Integer i1 = new Integer(1); //Wrapper타입인 Integer클래스에 1을 넣어 객체 생성후 주소값을 i1에 할당
		Integer i2 = new Integer(1); //Wrapper타입인 Integer클래스에 1을 넣어 객체 생성후 주소값을 i2에 할당
		//Wrapper타입인 Integer클래스는 객체로 생성될 때 하나의 int값을 저장할 수 있는데 이때 i1은 정수 1을 객체로 가지게 되며
		//기본형타입이 아닌 객체가 필요한 곳에서 사용할 수 있다.
		System.out.println("i1과 i2의 주소값 비교 :"+(i1==i2));
		System.out.println("i1의 값 : "+i1);
		System.out.println("i2의 값 : "+i2);
		System.out.println("i1과 i2의 값 비교 : "+i1.equals(i2));
		//서로 1이라는 객체를 가지지만 다른 주소값을 가짐
		
		String s1 = new String("one"); // 참조타입 String클래스에 one문자열을 입력하여 객체생성후 주소값을 s1에 할당
		String s2 = new String("one"); // 참조타입 String클래스에 one문자열을 입력하여 객체생성후 주소값을 s2에 할당
		System.out.println("s1과 s2의 주소값 비교 :"+(s1==s2));
		System.out.println("s1의 값 : "+s1);
		System.out.println("s2의 값 : "+s2);
		System.out.println("i1과 i2의 값 비교 : "+s1.equals(s2));
		//서로 다른 객체에 같은 값을 지니고 있음
		
		StringBuffer sf1 = new StringBuffer("one"); //StringBuffer클래스에 one문자열을 입력하여 객체생성후 주소값을 st1에 할당
		StringBuffer sf2 = new StringBuffer("one"); //StringBuffer클래스에 one문자열을 입력하여 객체생성후 주소값을 st1에 할당
		//서로 다른 객체에 같은 값을 지니고 있음
		//StringBuffer클래스는 equals를 오버라이딩해서 사용하지 않고 Object타입의 equals를 사용한다.
		//Object타입의 equals는 주소값을 비교하는 기능을 담당한다. 값을 비교하는 오버라이딩은 String클래스와 Warrper클래스뿐이다. (총 9개)
		
		System.out.println("sf1과 sf2의 주소값 비교 :"+(sf1==sf2));
		System.out.println("sf1의 값 : "+sf1);
		System.out.println("sf2의 값 : "+sf2);
		System.out.println("sf1과 sf2의 값 비교 : "+sf1.equals(sf2));

		Date d1 = new Date(); //Date클래스타입의 객체를 생성하고 그 주소값을 d1에 할당 객체의 메모리에는 현재시각이 기록됨
		Date d2 = new GregorianCalendar(2011, 7, 15).getTime(); //GregorianCalendar클래스타입에 연월일을 입력해주고 그때의 시간을 가져오는 객체를 생성
																//생성된 객체를 d2에 할당한다.
		Date d3 = new GregorianCalendar(2011, 7, 15).getTime();
		Date d4 = new Date();
		
		System.out.println("d1의 값 : "+d1);
		System.out.println("d2의 값 : "+d2);
		System.out.println("d3의 값 : "+d3);
		System.out.println("d4의 값 : "+d4);

		System.out.println("1번 :"+i1.equals(i2));
		//true Wrapper타입이기때문에 equals가 값을 비교해줌. 같은값
		System.out.println("2번 :"+s1.equals(s2));
		//true String타입이기때문에 equals가 값을 비교해줌. 같은값
		System.out.println("3번 :"+sf1.equals(sf2));
		//false equals가 주소를 비교해주기때문에 같은값이어도 false
		System.out.println("4번 :"+d2.equals(d3));
		//년,월,일을 입력해줬으므로 초기 시간값은 00:00이 된다. 따라서 00:00을 getTime메소드를 통해 가져왔기때문에 두 객체는 같은 msec를 가지게
		//되므로 true이다.
		System.out.println("5번 :"+d1.equals(d4));
		//date클래스의 생성자는 Date(long msec)를 가짐 <-- 1970년 1월 1일 0시 0분 0초부터 msec를 1/1000단위로 하여 경과한 날짜와 시간을 저장
		//date클래스의 equals는 검사시 두 날자의 밀리초(msec)차이에 기조하여 동일여부를 검사한다. 따라서 객체가 동일하면 true, 다른 객체라면
		//false가 발생한다.
	}
}
