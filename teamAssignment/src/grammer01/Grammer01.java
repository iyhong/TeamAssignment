package grammer01;

public class Grammer01 {
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
		for (int i = 1; i < 여기; i++) {
			System.out.print("   "); // "공백3칸"
		}
		for (int i = 여기, n = 여기; i <= 여기; i++, n++) {
			System.out.print((i < 10) ? " 0" + i : " " + i); // (i < 10)? "공백두칸"+i : "공백한칸"+i
			if (여기 == 0)	//이렇게하면 매주 토요일에는 줄바꿈이 실행됨
				System.out.println();
		}
		/*
		 * [여기] 부분채워서 아래같이 출력하기
		 * 설명주석도 달아오기
		 
		SU MO TU WE TH FR SA
           			01 02 03
 		04 05 06 07 08 09 10
		11 12 13 14 15 16 17
		18 19 20 21 22 23 24
		25 26 27 28 29 30 31

		*/
	}
}
