package forTest.no06;

public class Question06_myungchul {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {//i의 출력 열의 개수

			for (int j = 0; j < 4 - i; j++) {//" "의 개수
				System.out.print(" ");
			}
			for (int x = 0; x < 2*i + 1; x++) {//*의 개수
				System.out.print("*");	
			}
			System.out.println();
		}

	}

}
/*
아래그림 그리기
    *
   ***
  *****
 *******
*********

*/