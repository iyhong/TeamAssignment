package forTest.no08;

public class Question08_myungchul {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i + 1; j++) {
				if(j%2==0){//나머지 값이 0일 경우 *를 출력한다.
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
/*
아래그리기	
     *
    * *
   * * *
  * * * *
 * * * * *
	
*/