package forTest.no02;

public class Question02_sangil {

	/*

2번 아래그림그리기	
*****
****
***
**
*
	
 	*/


	public static void main(String[] args){
		String star = "*";
		for(int i = 0; i<5; i++){
			for(int j = 0;j<5-i;j++){
				System.out.print(star);

			}
			System.out.print("\n");
		}
	}
}
