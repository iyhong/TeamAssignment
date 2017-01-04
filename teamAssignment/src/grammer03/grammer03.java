package grammer03;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class grammer03 {
	
	/*
		실행시 결과는?
		다른방법으로 정렬하는 메서드 하나 만들어오기
	*/
	public static void main(String[] args) {
		String[] arr = { "1", "2", "9", "7", "4", "6", "1", "7", "0" };
		Set set = new HashSet();
		for (String s : arr) {
			set.add(s);
		}

		List list = new LinkedList(set);
		Collections.sort(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}

}
