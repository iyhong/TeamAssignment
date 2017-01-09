package forTest.no06;

public class Question06_choiym {
	/*
	아래그림 그리기
	    *
	   ***
	  *****
	 *******
	*********

	*/	
		public static void main(String[] args){
			int num = 6;
			for(int i = 1; i<num; i++){
				//5번 반복되는 for문 작성 (콘솔에 5줄 찍으려고)
				for(int j = 0; j < num-i-1 ;j++ ){
					//4칸,3칸,2칸,1칸 짜리 공백역삼각형이 만들어짐
					System.out.print(" ");
				}
				for(int k = 0; k < i*2-1; k++){
					//공백옆에 *을 붙여 출력
					//1번째 실행시 1개 출력, 2번째 실행시 3개출력, 3번째 실행시 5개 출력 ...
					//규칙 : 실행횟수+2개만큼 별이 붙는다.
					//때문에 실행횟수*2-1 해주면 1번째일때 1, 2번째일때 3, 3번째일때 5 ...
					System.out.print("*");
				}
				System.out.println();
				//줄바꿈
			}
		}
}
