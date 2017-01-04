package grammer03;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class grammer03_sangil {
	
	/*
		실행시 결과는?
		다른방법으로 정렬하는 메서드 하나 만들어오기
	*/
	public static void main(String[] args) {
		String[] arr = { "1", "2", "9", "7", "4", "6", "1", "7", "0" }; //데이터 중복 1 , 7
		Set set = new HashSet();//set은 데이터 중복을 허락하지 않음
		for (String s : arr) {
			set.add(s); //따라서 담기는 값은 1,2,9,7,4,6,0
		}

		List list = new LinkedList(set); //담겨있는 값을 list로 담은 이유는 Hashset은 sort메서드를 지원하지 않기 때문
		Collections.sort(list); //담은 값을 sort로 정렬하면 0,1,2,4,6,7,9

		Iterator it = list.iterator(); //Iterator를 이용하여 담겨 있는 값을 하나씩 추출할 수 있음
		
		Set treeSet = other(); //밑에 메서드를 실행해 리턴값을 treeSet에 담음
		Iterator iterator = treeSet.iterator(); //iterator를 이용해 하나씩 추출할 수 있음
		
		
		while (it.hasNext()) { //hasNext메서드를 이용하여 데이터의 끝에 도달할 때까지 하나씩 출력
			System.out.print(it.next()); //출력되는 값은  0,1,2,4,6,7,9
		}
		System.out.print("\n");
		while(iterator.hasNext()){
			System.out.print(iterator.next()); //treeSet에 담겨 있는 값을 출력함(오름차순, 중복x)
		}
	}
	
	static Set other(){
		String[] array = {"3", "5", "1","2","9","4","5","1","0","3"};
		Set treeSet =  new TreeSet(); //treeSet도 중복을 허락하지 않으며 자동으로 오름차순 정렬기능이 있다.
		for(String s : array) { //for문을 통해 array에 담겨 있는 배열값들을 treeSet 객체에 하나씩 담는다.
			treeSet.add(s); //담기는 값은 0,1,2,3,4,5,9
		}
		
		return treeSet;
	}
}