package grammer2.no07;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSeparatorUI;
/*
	다음 자바 코드 실행시 출력되는 결과는?
*/
public class Choiym_Grammer207 {
	 public static void main(String[] args) {
		  ArrayList<Singer1> list=new ArrayList();
		  Singer1 singer;
		  
		  singer = new Singer1();
		  
		  singer.setName("admin");
		  singer.setAge(30);
		  list.add(singer);
		  System.out.println("list확인 : "+list.get(0));
		  singer.setName("guest");
		  singer.setAge(32);
		  list.add(singer);
		  System.out.println("list[0]확인 : "+list.get(0)+" list[1]확인 : "+list.get(1)); 
		  Iterator i=list.iterator();
		  System.out.println("i 확인 : "+i.next());
		  while(i.hasNext()){
		   System.out.println(((Singer1)i.next()).getName());
		  }
	}
}
//arraylist의 배열에 담긴 singer의 주소값이 동일하여 singer의 property가 변하면 기존의 배열에 담긴
//값 역시 변하게 되어 guest guest 가 출력된다.



class Singer1{
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
