package forTest.no07;

public class Question07_myungchul {
	public static void main(String[] args) {
		int m = 1;
		for (int i = 2; i >=0; i--, m += 2) {//i는 " "공백의 개수, m=*의 개수
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < m; k++) {
				System.out.print("*");
			}
			System.out.println(i+"d");
		}
		m -= 4;	//별의 개수를 줄인다.
				//처음 for문에서 2씩 증가를 했기 떄문에 다음 for문에서는 4씩 감소해야 한다.
		for (int i = 1; i <= 2; i++, m -= 2) {
			for (int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < m; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
아래그리기
  *
 ***
*****
 ***
  *

*/