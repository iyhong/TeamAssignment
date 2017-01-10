package forTest.no09;

public class Question09_sangil {
	/*
	아래그리기	
	     1
	    2 2
	   3 3 3
	  4 4 4 4
	 5 5 5 5 5
		
	*/
	public static void main(String[] args){
		
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++){
				if(k%2==0){ //k값이 짝수일때 *을 출력
					System.out.print(i+1);
				}else{ //k값이 홀수일때 공백1칸을 출력
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
