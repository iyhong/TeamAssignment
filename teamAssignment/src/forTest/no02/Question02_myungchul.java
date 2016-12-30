package forTest.no02;

public class Question02_myungchul {
	public static void main(String[] args) {
		int x, y;
		for (x = 0; x < 5; x++) {//x은 0이고; x은 5보다 작다; 점점x는 증가한다.
			for (y = 5; y >= x + 1; y--) {
				//y은 5이고; y은 x+1보다 크면서 같다. ; y는 감소한다.
				//y>=x+1 x에 0~4까지 대입을 하게 되고 점점 출력할 문자열수가 감소한다.
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}
}

