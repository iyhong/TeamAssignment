package forTest.no06;

public class Question06_inyong {
	/*
	아래그림 그리기
	    *
	   ***
	  *****
	 *******
	*********

	*/	
	public static void main(String[] args){
		for(int i=0; i<5;i++){
			for(int j=0; j<4-i;j++){
				System.out.print(" ");
			}
			for(int k=0; k<(i*2)+1 ; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
