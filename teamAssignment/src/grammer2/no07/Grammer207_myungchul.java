package grammer2.no07;

import java.util.ArrayList;
import java.util.Iterator;

/*
	다음 자바 코드 실행시 출력되는 결과는?
	guest
	guest 결과값이 출력이 된다.
	
	첫번째 add(singer)와 두번쨰 add(singer)의 같은 변수로 참조가 되어있다.
	마지막에 add(singer)된 데이터가 같은 값이 나오게 된다.
	while문에 getAge()를 추가할 경우
	출력값이
	guest
	32로 출력이 된다
	
*/
public class Grammer207_myungchul {
	public static void main(String[] args) {
		ArrayList<Singer_lmc> list = new ArrayList();
		//ArrayList<String> list = new ArrayList();
		Singer_lmc singer;
		

		singer = new Singer_lmc();
		
		singer.setName("admin");
		singer.setAge(30);
		list.add(singer);

		singer.setName("guest");
		singer.setAge(32);
		list.add(singer);
		/*list.add("admin");
		list.add("guest");*/
		

		Iterator<Singer_lmc> i = list.iterator();
		//Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			/*String s = i.next();
			System.out.println(s);*/
			//hascode()를 사용할경우 주소값이 나오는데 같은 주소값을 갖는다.
			System.out.println((((Singer_lmc) i.next()).getName()));
			System.out.println(((i.next()).getAge()));
		}
	}
}

class Singer_lmc {
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

