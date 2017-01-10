package forTest.no06;

public class Question06_YJ {
/*
아래그림 그리기
    *
   ***
  *****
 *******
*********

*/	
	public static void main(String[] args){
		for(int i=0; i<5; i++){		// 줄 갯수
			for(int j=5-i; j>0; j--){	//띄어쓰기 개수
				System.out.print(" ");
			}
			for(int k=0; k< (i*2)+1; k++){	//별 개수
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//i=0 , j=5 , k = 1
//i=1 , j=4 , k = 3
//i=2 , j=3 , k = 5
//i=3 , j=2 , k = 7
//i=4 , j=1 , k = 9