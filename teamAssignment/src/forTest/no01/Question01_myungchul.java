package forTest.no01;

public class Question01_myungchul {
	public static void main(String[] args) {
		int x, y;
		for (x = 0; x < 5; x++) {// x은 0이고; x은 5보다 작다; 점점x는 증가한다.
			for (y = 0; y < x + 1; y++) {
				// y은 0이고; y은 x+1보다 작다. ; y는 증가한다.
				// y<x+1 x에 0~4까지 대입을 하게 되고 점점 출력할 문자열이 증가한다.
				System.out.print("*");
			}
			System.out.print("\n");// x가 0~4 한번씩 출력한다. 문장을 겹치기 않게 하기 위헤 줄넘김해서
										// 한다.

		}
	}
}
/*
 * 
 * 1번 아래그림그리기
 *
 **
 ***
 ****
 *****
 * 
 * 
 */
