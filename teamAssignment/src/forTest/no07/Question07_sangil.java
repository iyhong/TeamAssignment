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
		//i=2; j=0,1; k=0			(1)
		//i=1; j=0; k=0,1,2			(3)
		//i=0; j없음; k=0,1,2,3,4		(5)
		//i=1; j=0,; k=0,1,2		(3)
		//i=2; j=0,1; k=0			(1)
		int init =-2;
		for(int i=init;i<3;i++){ 
			int absNum = Math.abs(init);
			for(int j=0;j<init;j++){ //공백 한칸의 갯수
				System.out.print(" ");
			}
			for(int k=0;k<5-(init*2);k++){ //별표의 갯수
				System.out.print("*");
			}
			System.out.println();
			init++;
		}
		
		
	}
}
