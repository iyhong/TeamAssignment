package forTest.no05;

public class Question05_choiym {
	/*
5번 아래그림그리기
A
BC
DEF
GHIJ
KLMNO

	*/
	
	public static void main(String[] args){
		int  c = 65;
		//아스키코드의 A값을 int형 변수 c에 대입
		for(int a = 1; a < 6; a ++){
			//전체 행을 결정해주는 for문 작성 5번 반복됨
			 for(int b = 1; b <= a; b++){
				 //b가 a와 같아질때까지 b를 ++
				 //a가 1일때 1번 , a가 2일때 2번
				 System.out.print((char)c);
				 c++;
					
			 }
			System.out.println();
		}
		
	}
	
}
