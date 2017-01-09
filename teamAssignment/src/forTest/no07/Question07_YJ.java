package forTest.no07;

public class Question07_YJ {
	/*
	아래그리기
	  *
	 ***
	*****
	 ***
	  *

	*/
	public static void main(String[] args){
		for(int i=1; i<=3; i++){		// 줄 갯수
			for(int j=1; j<=3-i; j++){	//띄어쓰기 개수
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2)-1; k++){	//별 개수
				System.out.print("*");
			}
			System.out.println();
			//i=1, j=1, 2, k=1
			//i=2, j=1, k = 1, 2, 3
			//i=3, j=없음, k=1,2,3,4,5
		}
		for(int i=2; i>=1; i--){
			for(int j=0; j<=2-i; j++){
				System.out.print(" ");
			}
			for(int k=1; k <= (i*2)-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		// i=2, j= 0, k= 1, 2, 3
		// i=1, j= 0, 1 k = 1
		
	}
}
