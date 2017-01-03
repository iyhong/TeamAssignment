package grammer01;

public class Grammer01_myungchul {
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
		int startWeek = TUE;
		System.out.println("SU MO TU WE TH FR SA");
		for (int i = 1; i < startWeek; i++) {//i은 1이면 ; i은 startWeek 보다 작다 ; 점점 i는 증가한다.
			//일요일 앞에 공백을 없애기 위해 if문으로 추가를 하면 된다.
			if((i%7) ==1){//나머지가 4일때 true일때 공백 두칸으로 표시를 한다.
				System.out.print("  ");// "공백2칸"
			}else{//false일때 공백 3칸으로 표시를 한다.
				System.out.print("   ");// "공백3칸"
			}
			
		}//시작 요일까지 공백을 채우도록 반복을 한다.
		for (int i = start, n = startWeek; i <= end; i++, n++) {
			//i은 start=1이며, n은 startWeek=THU=5이고 ; i는 end보다 작거나 같다 ; i과 n은 점점 증가한다.
			//i는 1부터 시작하여 31까지 반복을 하게 된고,
			//n은 startWeek=THU=5로서 점점 1씩 더해진다.
			//01=5 02=6 03=7 04=8......이렇게 증가를 하게 된다.
			if((n%7) == 1){
				System.out.print((i < 10) ? "0" + i : i);
			}else{
				System.out.print((i < 10) ? " 0" + i : " " + i); // (i < 10)? "공백두칸"+i : "공백한칸"+i
			}
			if ((n%7) == 0) System.out.println();	//이렇게하면 매주 토요일에는 줄바꿈이 실행됨
			//if ((n%7) == 0){ System.out.println();} //구분하기 위해  {}을 표시를 하기도 한다.
				//n을 7로 나눈 나머지를 구하기 위해 조건문에 달성하기 위해서 나머지 0인 true를 찾는다면 줄바꿈인 시스템 출력식이 작동하게 된다.
				
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
