package forTest.no03;

public class Question03_choiym {
	/*
	 
3번 아래그림 그리기(공백유의)
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
	
	*/
	public static void main(String[] args){
		for(int a = 1; a < 6; a ++){
			//5번 반복되는 for문 작성 전체 행의 길이를 결정 
			 for(int b = 1; b <= a; b++){
				 //b가 a보다 작거나 같으면 b를 ++ 해주고 b>a이면 반복하지 않는 for문
				 System.out.print(a+" ");
				 //a뒤에 공백을 붙여 콘솔에 입력
				 
			 }
			System.out.println(); 
			//줄바꿈
			// a" "
			// a" "a" "
			// a" "a" "a" " ... 이런식으로 출력됨
		}
	}
}
