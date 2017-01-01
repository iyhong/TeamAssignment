package forTest.no03;

public class Question03_myungchul {

	public static void main(String[] args) {
		int x, y;

		for (x = 0; x < 5; x++) {//x은 0이고; x은 5보다 작다; 점점x는 증가한다.
			for (y = 0; y < x + 1; y++) {
				//y은 0이고; y은 x+1보다 작다. ; y는 증가한다.
				//y<x+1 x에 0~4까지 대입을 하게 되고 점점 출력할 문자열이 증가한다.
				System.out.print(x+1);
				
				if(y<x){
					System.out.print(" ");
				}
				//화면에 보이는 모양은 1번예제랑 똑같이 된다.
				//y+1을 넣을 경우 넘어 갈때마다 1+가 되서 출력이 될기 때문이다. 
				//1
				//1 2
				//1 2 3
				//x+1을 넣을 경우
				//첫번째 for에서 x를 1번 반복하게 되고 두번째 for문에서는 y를2번 반복하게 되므로
				//1
				//2 2
				//3 3 3
				//이런한 모양이 나온다.
			}
			System.out.print("\n");//x가 0~4 한번씩 출력한다. 문장을 겹치기 않게 하기 위헤 줄넘김해서 한다.
		
		}
		/*
		 * 
		 * 3번 아래그림 그리기(공백유의) 
		 * 1
		 * 2 2
		 * 3 3 3
		 * 4 4 4 4
		 * 5 5 5 5 5
		 * 
		 */
	}
}
