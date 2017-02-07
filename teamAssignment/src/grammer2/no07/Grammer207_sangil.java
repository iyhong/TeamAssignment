package grammer2.no07;

import java.util.ArrayList;
import java.util.Iterator;
/*
	다음 자바 코드 실행시 출력되는 결과는?
*/
public class Grammer207_sangil {
	 public static void main(String[] args) {
		  ArrayList<Singer_si> list = new ArrayList();
		  Singer_si singer;
		  
		  singer =new Singer_si(); //singer라는 객체가 하나만 생성되었다.
		  
		  singer.setName("admin"); 
		  singer.setAge(30);
		  list.add(singer); //singer 객체에 먼저 admin과 30을 셋팅했다.
		  
		  singer.setName("guest"); // 그 후에 guest와 32를 셋팅하면 앞에 셋팅한 값과 또 다른값이 셋팅되는 것이 아니라 하나의 객체에서
		  singer.setAge(32);	   // 덮어씌이게 된다. 따라서 name에는 guest가 age에는 32가 셋팅된다.
		  list.add(singer);
		  
		  Iterator i=list.iterator(); //iterator를 이용해 인덱스를 하나씩 추출할 수 있다
		  while(i.hasNext()){ //인덱스가 없으면 false를 리턴해 반복문이 끝나게 된다.
		   System.out.println((((Singer_si)i.next()).getName())); //두번 셋팅했으므로 인덱스는 2개이지만 값은 guest로 동일하다. 따라서 guest가 두번 출력된다.
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
