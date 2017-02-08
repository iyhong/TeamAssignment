package grammer2.no07;

import java.util.ArrayList;
import java.util.Iterator;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	
	출력결과는 
	guest
	guest
	이다..
*/
public class Grammer207_inyong {
	 public static void main(String[] args) {
		  ArrayList<Singer_i> list=new ArrayList();
		  Singer_i singer;
		  
		  //singer_i객체는 1개만 생성됨
		  singer=new Singer_i();
		  
		  //객체에 name=admin, age=30을 셋팅 하고 객체를 ArrayList에 담는다.
		  singer.setName("admin");
		  singer.setAge(30);
		  list.add(singer);
		  
		  //여기서 또 같은객체에 name=guest, age=32로 셋팅.. 하고 ArrayList에 담음
		  singer.setName("guest");
		  singer.setAge(32);
		  list.add(singer);
		  
		  //결론은 ArryaList에 두개가 담겨있는데 두개다 같은 객체를 참조한다..
		  //그러므로 반복을 돌려서 name을 출력하면 guest만 두번나옴
		  Iterator i=list.iterator();
		  while(i.hasNext()){
		   System.out.println((((Singer_i)i.next()).getName()));
		  }
	}
}

class Singer_i{
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
