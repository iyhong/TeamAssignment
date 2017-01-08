package forTest.no07;

public class Question07_sangil {
	/*
	아래그리기
	  *
	 ***
	*****
	 ***
	  *

	*/
	public static void main(String[] args){
		//i=0; j=0,1; k=0
		//i=1; j=0; k=0,1,2
		//i=2; j없음; k=0,1,2,3,4
		for(int i=0;i<3;i++){ 
			for(int j=0;j<2-i;j++){ //공백 한칸의 갯수
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++){ //별표의 갯수
				System.out.print("*");
			}
			System.out.println(); 
		}
		
		//i=0; j=0,; k=0,1,2
		//i=1; j=0,1; k=0
				
		for(int i=0;i<2;i++){
			for(int j=0;j<i+1;j++){ //공백 한칸의 갯수
				System.out.print(" "); 
			}
			for(int k=0;k<3-(i*2);k++){ //별표의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
