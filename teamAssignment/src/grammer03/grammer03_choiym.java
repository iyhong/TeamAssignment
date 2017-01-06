package grammer03;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class grammer03_choiym {
	
	/*
		실행시 결과는?
		다른방법으로 정렬하는 메서드 하나 만들어오기
	*/
	public static void main(String[] args) {
		String[] arr = { "1", "2", "9", "7", "4", "6", "1", "7", "0" };
		Set set = new HashSet();
		//HashSet 객체를 생성하고 set 변수에 객체주소를 할당
		for (String s : arr) {
			set.add(s);
		}
		//for문을통해 String 형태의 변수 s를 선언하고 arr배열의 값을 하나씩 s에 담는다
		//set에 s를 추가한다. set타입이기 때문에 중복값을 허용하지않음 따라서 1, 2, 9, 7, 4, 6, 0이 입력됨
		List list = new LinkedList(set);
		//매개변수set을 가지는 LinkedList 객체를 생성하고 그 주소값을 list에 할당
		Collections.sort(list);
		//list를 정렬한다.
		/*
		 * Collections.reverse(list); <--- 내림차순정렬해주는 메소드
		*/
		Iterator it = list.iterator();
		//it변수에 list에 담겨있는 정보를 하나씩 가져옴
		while (it.hasNext()) {
			
			System.out.print(it.next());
			//it이 있으면 true, 없으면 false값을 받아옴
			//따라서 0124679가 출력됨
		}
		System.out.println();
		
		Sort s = new Sort();
		s.sort();
		// Arrays.sort()를 사용하여 넘기는 배열을 정렬한 다음 set에 세팅
		
	}
	
}
class Sort{
	void sort(){
		String[] arr1 = { "1", "2", "9", "7", "4", "6", "1", "7", "0" };
		
		Arrays.sort(arr1);
		Set set1 = new HashSet();
		for (String str : arr1) {
			set1.add(str);
		}
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("1.1");
		set3.add("4.3");
		set3.add("2.2");
		set3.add("8.7");
		Iterator it2 = set3.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println();
		List list1 = new LinkedList(set1);
		Iterator it1 = list1.iterator();
		
		while (it1.hasNext()) {
			System.out.print(it1.next());
		}
	}
}
