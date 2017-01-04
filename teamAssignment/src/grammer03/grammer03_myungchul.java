package grammer03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class grammer03_myungchul {	
	/*
		실행시 결과는?
		다른방법으로 정렬하는 메서드 하나 만들어오기
	*/
	public static void main(String[] args) {
		String[] arr = { "1", "2", "9", "7", "4", "6", "1", "7", "0" };
		Set set = new HashSet();//HashSet 함수는 중복된 값을 제거 하고 저장을 해준다.
		for (String s : arr) {//for문으로 s변수에 arr 배열 값이 들어가게 되고
			set.add(s);//set.add(s) set에 통해서 s변수에 있는 중복된 값을 제거하고 저장한다.
		}//

		List list01=no(set);//no메서드으로 이동하여 메서드에서 처리할 값이 return되어 list01에 대입하게 된다.
		
		Iterator it = list01.iterator();//iterator 객체 it에 리턴한 해서 온 값이 list01안에 있는 값들을 가져온다.

		while (it.hasNext()) {// 값이 나올떄까지 while문을 돈다.
			System.out.print(it.next());
		}
		
	}
	static List no(Set set){
		List list02 = new ArrayList(set);
		Collections.sort(list02);		
		//Collections.reverse(list);//뒤집기 함수 reverse 
		
		return list02;
	    
		
	}

}

