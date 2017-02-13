package grammer2.no07;

import java.util.ArrayList;
import java.util.Iterator;
/*
	다음 자바 코드 실행시 출력되는 결과는?
*/
public class Grammer207_sangil {
	public static void main(String[] args) {
		 ArrayList<Singer_si> list = new ArrayList();
		 String[] arr = {"aaa","bbb","ccc"};
		 
		 for(int i=0; i<3 ; i++){
			 Singer_si singer = new Singer_si();
			 singer.setAge(i);
			 singer.setName(arr[i]);
			 list.add(singer);
		 }
		 Iterator<Singer_si> it = list.iterator();
		 while(it.hasNext()){
			 System.out.println((it.next()).getName());
		 }	 
	}

	
}

class Singer_si{
	private String name;
	private int age;
		 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}


}
