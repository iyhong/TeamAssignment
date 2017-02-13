package grammer01;

public class Grammer01_sangil {
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
		for (int i = 1; i < startWeek; i++) { //01일이 시작될 때까지 공백이 채워져야 하므로 i<startWeek까지 for문이 돌아야함
			System.out.print("   "); // "공백3칸"
		}
		
		for (int i = start, n = startWeek; i <= end; i++, n++) { //i=1부터 시작해 i<=31까지 반복문이 돌게 한다. 31일까지 출력되도록
			System.out.print((i < 10) ? " 0" + i : i + " "); // (i < 10)? "공백두칸"+i : "공백한칸"+i
			//i=1 n=2
			//i=2 n=3
			//i=3 n=4 i+n=7 (i+n)%7 == 0의 조건이 true가 됨. 반복해서 토요일마다 (i+n)값이 7의 배수값이 나와 7로 나눴을 때 나머지가 0이 된다.
			if (n%7 == 0)	//이렇게하면 매주 토요일에는 줄바꿈이 실행됨
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