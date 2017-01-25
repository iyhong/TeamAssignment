package forTest.no11;

public class Question11_myungchul {
/*
 * 01 02 03 04 05 
 * 16 17 18 19 06
 * 15 24 25 20 07
 * 14 23 22 21 08
 * 13 12 11 10 09
 * 
 * 만들어 주세요
 * */

	public static void main(String[] args){
		ex01();
		//ex02(); 다른 방법이 생각나면
	}

	public static void ex01() {
		int[] num = { 1, 2, 3, 4, 5, 16, 17, 18, 19, 6, 15, 24, 25, 20, 7, 14, 23, 22, 21, 8, 13, 12, 11, 10, 9 };

		for (int i = 0, n = 1; i < num.length; i++, n++) {

			if ((n % 5) == 1) {
				System.out.print((num[i] < 10) ? " 0" + num[i] : " " + num[i]);
			} else {
				System.out.print((num[i] < 10) ? " 0" + num[i] : " " + num[i]);
			}
			if ((n % 5) == 0) {
				System.out.println();
			}
		}
	}
}
