package grammer01;

public class Grammer01_choiym {
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
		for (int i = 1; i < 5; i++) {
			System.out.print("   "); // "공백3칸"
			// 요일 하나당 3칸씩 할당되므로 TH까지 4일이 필요함. for문 4번반복필요함. 때문에 여기->5 대입
		}
		for (int i = 1, n = 5 ; i <= 31; i++, n++) {
			int[] a = {4,11,18,25};
			for(int b = 0; b <= a.length; b++){
				if(i==a[b]){
					System.out.print((i < 10) ? "0" + i: i);
				}else{
				System.out.print((i < 10) ? " 0" + i:" "+i);
				}
				// (i < 10)? "공백두칸"+i : "공백한칸"+i
				/* 삼향연산자 ? 는 ()안의 값이 참이면 : 왼쪽 참이아니면 : 오른쪽이 실행됨
					31일까지이므로 i <= 31까지
					n값을 5로 주고 if문을 통해 n을 나눈 나머지가 0과 같으면 줄바꿈 실행
				*/
			}
			if ((n%7) == 0)	//이렇게하면 매주 토요일에는 줄바꿈이 실행됨
				System.out.println();
		}
		
		/* * [여기] 부분채워서 아래같이 출력하기
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
