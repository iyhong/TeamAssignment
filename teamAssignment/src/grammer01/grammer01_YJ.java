package grammer01;

public class grammer01_YJ {
	public static void main(String[] args) {
		final int SUN = 1;
		final int MON = 2;
		final int TUE = 3;
		final int WED = 4;
		final int THU = 5;
		final int FRI = 6;
		final int SAT = 7;

		int start = 1;
		int end = 31;
		int startWeek = THU;
		System.out.println(" SU MO TU WE TH FR SA");
		for (int i = 1; i < startWeek; i++) {
			System.out.print("   "); // "공백3칸"
		}
		for (int i = SUN, n = THU; i <= 31; i++, n++) {
			System.out.print((i < 10) ? " 0" + i : " " + i); // (i < 10)? "공백두칸"+i : "공백한칸"+i
			if ((n%7) == 0)	//이렇게하면 매주 토요일에는 줄바꿈이 실행됨
				System.out.println();
		}
		/*	첫번째 for문에서 startWeek = THU 즉 5이므로 공백 3칸을 4번 반복함 
		 * 	이후 두번째 for 문 실행 i= sun 일때 n = THU 이다. 
		 * 	(i < 10) ? " 0" + i : " " + i) <- 요것은 i<10 이 참이면 : 기준 왼쪽을 거짓이면 오른쪽을 출력
		 * 	i=1일때 n=5 , i=2일때 n=6, i=3 일때 n=7 일때 if문을 실행한다
		 * 
		 */
	}
}
