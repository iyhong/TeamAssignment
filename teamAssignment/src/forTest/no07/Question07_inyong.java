package forTest.no07;

public class Question07_inyong {
/*
아래그리기
  *
 ***
*****
 ***
  *

*/
	public static void main(String[] args){
		int absNum = -2;
		for(int i=0;i< 5; i++){
			for(int j=0; j<Math.abs(absNum) ; j++){
				System.out.print(" ");
			}
			for(int k=0;k< 5-(2*Math.abs(absNum)); k++){
				System.out.print("*");
			}
			absNum++;
			System.out.println();
			
		}
	}
}
