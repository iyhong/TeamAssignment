package forTest.no02;

public class Question02_choiym {

	public static void main(String[] args) {
		for(int a =5 ; a > 0; a--){
			String c = "";
			for(int b = 0; b < a;b++){
				c += "*";
			}
			System.out.println(c);
		}
	}
	
}
/* 변수 c에 담긴 값을 5번 출력하는 for문 안에 b가 a보다 작으면 c에 *문자를 추가하는 for문을 
 * 
 *
 * 
 * 
 */