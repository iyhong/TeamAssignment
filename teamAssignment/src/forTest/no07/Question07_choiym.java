package forTest.no07;

public class Question07_choiym {
/*
아래그리기
  *
 ***
*****
 ***
  *

*/
	public static void main(String[] args){
		
		for(int i = 1; i<4; i++){
			//5번 반복되는 for문 작성 (콘솔에 5줄 찍으려고)
			for(int j = 0; j < 3-i ;j++ ){
				//i=1일때 두번, i=2일때 1번 반복되는 포문
				System.out.print(" ");
			}
			for(int k = 0; k < i*2-1; k++){
				//공백옆에 *을 붙여 출력
				//1번째 실행시 1개 출력, 2번째 실행시 3개출력, 3번째 실행시 5개 출력
				//규칙 : 실행횟수+2개만큼 별이 붙는다.
				//때문에 실행횟수*2-1 해주면 1번째일때 1, 2번째일때 3, 3번째일때 5개 출력
				System.out.print("*");
			}
			System.out.println();
			//줄바꿈
		}
		
		for(int i = 2; i>0; i--){
			//2번 반복되는 for문을 작성
			//i가 2일때 아래 두개의 포문이 한번 돌고 i가 1일때 두개의 포문이 한번 돈다.
			for(int j = 3; j > i ; j--){
				//1번,2번 돌아야함
				//i가 2일때 j가 3이므로 공백을 1칸 생성하고 포문이 완료된다.
				//i가 1일때 j가 3이므로 공백을 2칸 생성하고 포문이 종료된다.
				System.out.print(" ");
			}
			for(int k = 0; k < i*2-1; k++){
				//3번, 1번돌아야함	
				//i가 2일때 2*2-1 = 3번 반복
				//i가 1일때 1*2-1 = 1번 반복
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
