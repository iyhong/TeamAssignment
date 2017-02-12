package grammer2.no10;

/*다음 자바 코드 실행시 출력되는 결과는?
package com.zeroday.one;*/

/*① 이름:/나이:0
② 이름:guest/나이:0
③ 이름:admin/나이:30
④ Compilation error.
⑤ Runtime exception.

정답 : NullPointException
	Sub_iy생성자 메서드에서 
	if (name.equals(""))
	이명령문실행시 name이 null이기 때문에 (즉 Super_iy에게 상속받은 name이 초기화 되지 않았기 때문에 null임)
	NullPointException발생
*/
public class Grammer210_inyong {
	public static void main(String[] args) {
		Sub_iy sub = new Sub_iy("admin", 30);
	}
}

class Super_iy {
	String name;
	int age;

	Super_iy() {
	}

	Super_iy(String str, int val) {
		name = str;
		age = val;
	}
}

class Sub_iy extends Super_iy {
	Sub_iy(String str, int val) {
		System.out.println("Sub_iy 생성자 실행");
		//아래 namei = str;문장을 넣어 초기화를 시켜주면 정상실행됨.
		name = str;
		if (name.equals("")) {
			name = "guest";
		}
		if (age < 1 || age > 200) {
			age = 0;
		}
		System.out.println("이름:" + name + "/나이:" + age);
	}
}
