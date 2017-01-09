package forTest.no09;
/*
아래그리기	
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
	
*/
public class Question09_YJ {
	public static void main(String[] args){
	for(int i=0; i<5; i++){			//줄 개수
		for(int j=0; j<4-i; j++){	//띄어쓰기 수
			System.out.print(" ");
			}
		for(int k=0;k<i*2+1;k++){	//별의개수
			if(k%2==0){
				System.out.print(i+1);
			}else{
				System.out.print(" ");
				}
			}
		System.out.println();
		}	
			//i=0 j= 0,1,2,3 k= 0 (k%2==0)이 성립하므로 *을 출력
			//i=1 j= 0,1,2   k= 0, 1, 2, 3 
			//i=2 j= 0, 1    k= 0, 1, 2, 3, 4
			//i=3 j= 0		 k= 0, 1, 2, 3, 4, 5, 6
			//i=4 j= 없음 	 k= 0, 1, 2, 3, 4, 5, 6, 7, 8
	}

}
