package grammer2.no10;

/*다음 자바 코드 실행시 출력되는 결과는?
package com.zeroday.one;*/

/*① 이름:/나이:0
② 이름:guest/나이:0
③ 이름:admin/나이:30
④ Compilation error.
⑤ Runtime exception.
2번 이라고 생각을 했다 그러나 실행을 해본 결과 
Runtime exception 즉 NullPointerException이 뜨는 것있다.
여기서 해결 방법은 클래스 Super_lmc 안에 있는 지역변수에 초기값을 설정을 해주는 거다.


*/
public class Grammer210_myungchul {
	public static void main(String[] args) {
		Sub sub = new Sub("admin", 30);
	}
}

class Super_lmc {
	String name;	//String name = "";
	int age;		//int age = 0; 
					//설정을 하고 실행을 하게 되면 출력값은 이름:guest/나이:0게 나오게 된다.

	Super_lmc() {
	}

	Super_lmc(String str, int val) {
		name = str;
		age = val;
	}
}

class Sub_lmc extends Super_lmc {
	Sub_lmc(String str, int val) {
		if (name.equals("")) {	//equals()메소드 안에는 null이다 name변수의 값이 메모리에 할당되지 않아 
								//nullPointerException이 뜬다고 생각한다.
								//내용(주소값)이 있는 null이라면 
			name = "guest";
		}
		if (age < 1 || age > 200) {
			age = 0;
		}
		System.out.println("이름:" + name + "/나이:" + age);
	}
}
