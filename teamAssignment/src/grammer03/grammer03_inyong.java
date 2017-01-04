package grammer03;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class grammer03_inyong {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		String[] arr = { "1", "2", "9", "7", "4", "6", "1", "7", "0" };
		//HashSet을 이용해 중복제거
		Set set = new HashSet();
		for (String s : arr) {
			set.add(s);
		}
		//LinkedList와 Collections를 이용해 정렬
		List list = new LinkedList(set);
		Collections.sort(list);
		//Iterator 클래스 이용해서 반복
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.print(it.next());
		}
		
		//여기서부터 내가 만든 메서드
		System.out.println();
		int[] arrInt = sorting(set);
		print(arrInt);
	}
	//정렬하는 메서드 (중복을 제거해야 하기때문에 이미 제거된 Set으로 받음)
	public static int[] sorting(Set set){
		int[] arrInt = new int[set.size()];
		Iterator it = set.iterator();
		int i =0;
		//중복제거된 Set을 int배열로 변환
		while(it.hasNext()){	//hasNext()는 다음에 값이있으면 true 없으면 false
			arrInt[i] = Integer.parseInt((String) it.next());	//next메서드는 한칸이동후 그위치의 값리턴
			i++;
		}
		//Arrays 클래스의 sort메서드 이용하여 정렬
		Arrays.sort(arrInt);
		return arrInt;
	}
	//출력하는메서드
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
