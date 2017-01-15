package forTest.no02;

public class Question02_choiym {

	public static void main(String[] args) {
		for(int a =5 ; a > 0; a--){
			// a가 5,4,3,2,1일때 반복되는 for문 (5번 실행되고 반복실행될때마다 a는 1씩 감소한다) 전체 행을 결정
			String c = "";
			for(int b = 0; b < a;b++){
				// b기 a보다 작으면 안의 내용을 반복해주고 b를 1씩 증가시킨다.
				// 5일때 5번, 4일때 4번, 3일때 3번, 2일때 2번, 1일때 1번 반복
				c += "*";
				//String 타입의 변수 c에 *을 추가시켜준다.
			}
			System.out.println(c);
			//콘솔에 c를 출력하고 줄바꿈
		}
	}
	
}
