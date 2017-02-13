package grammer2.no07;

import java.util.ArrayList;
import java.util.Iterator;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	guest
	guest
	
*/
public class Grammer207_YJ {
	 public static void main(String[] args) {
		  ArrayList<Singer_yj> list=new ArrayList();
		  Singer_yj singer;
		  
		  singer=new Singer_yj();
		  
		  singer.setName("admin");
		  singer.setAge(30);
		  list.add(singer);
		  //singer 에 admin , 30 을 셋팅한다
		  singer.setName("guest"); 
		  singer.setAge(32);
		  list.add(singer);
		  //singer에 guest와 32를 셋팅하는데 
		  //이 때 또 다른 객체를 생성하여 guest 와 32를 담는게아닌
		  //admin과 30에 값을 덮어쓰게된다.
		  Iterator i=list.iterator();
		  //Iterator는 ArrayList에 담긴 값들을 하나씩 추출할수 있게해준다.
		  while(i.hasNext()){
			  //i.hasNext()를 통해 담긴 값들을 하나씩 추출  
		   System.out.println((((Singer_yj)i.next()).getName()));
		  }
	}
}

class Singer_yj{
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
