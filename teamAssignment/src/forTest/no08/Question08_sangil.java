package forTest.no08;

public class Question08_sangil {
	/*
	아래그리기	
	     *
	    * *
	   * * *
	  * * * *
	 * * * * *
		
	*/
	//i=0; j=0,1,2,3("") k=0(*)
	//i=1; j=0,1,2("") k=0,1,2(*)
	//i=2; j=0,1("") k=0,1,2,3,4(*)
	//i=3; j=0("") k=0,1,2,3,4,5,6(*)
	//i=4; j값 없음 ; k=0,1,2,3,4,5,6,7,8(*)
	public static void main(String[] args){
		
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++){
				if(k%2==0){ //k값이 짝수일때 *을 출력
					System.out.print("*");
				}else{ //k값이 홀수일때 공백1칸을 출력
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
