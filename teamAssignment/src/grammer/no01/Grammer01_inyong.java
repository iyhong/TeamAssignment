package grammer.no01;

public class Grammer01_inyong {
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
		System.out.println("SU MO TU WE TH FR SA");
		//앞에 공백은 시작일 전까지 즉 THU=5이므로 4번 공백찍으면 됨.
		for (int i = 1; i < startWeek; i++) {
			if(i%7==1){
				System.out.print("  ");
			}else{
				System.out.print("   "); // "공백3칸"
			}
		}
		//i가 1부터 31까지 반복하고
		for (int i = start, n = startWeek; i <= end; i++, n++) {
			if(n%7==1){
				System.out.print((i < 10) ? "0" + i : i);
			}else{
				//삼항연산자 ? 를 사용해서 자리수가 한자리면 앞에 공백과0을 붙여주고 두자리만 공백만 붙여줌 
				System.out.print((i < 10) ? " 0" + i : " " + i); // (i < 10)? "공백두칸"+i : "공백한칸"+i
			}
			//만약 n즉 startWeek이 7로나누어 떨어지면 줄바꿈실행
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
