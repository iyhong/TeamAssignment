package forTest.no09;

public class Question09_myungchul {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {//i의 값을 0으로 할경우 꼭대기가 0부터 출력이 된다.

			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2*i + 1; j++) {
				if(j%2==0){
					System.out.print(i);
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
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
	
*/