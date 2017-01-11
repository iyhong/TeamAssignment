package forTest.no10;

public class Question10_myungchul {
	public static void main(String[] args) {
		String[] arr = { "z", "e", "r", "o", "D", "a", "y"};
		int[] intArr=new int[arr.length];
		/*for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		for (int i = arr.length-1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print(arr[j]);
			}
			System.out.println();
		}*/
		int i, j;
		int k = intArr.length;
		int n = (k*2)-1;											//세로길이를 정하는 계산식이다.
		int m = k-1;												//Math.abs()의 절대값을 구하기 위해서는 실수인 0이하인 -1 숫자들을 정수 형태인 1로 전환하기 위한 절대값을 사용을 했다. ㅅㅂ
		for (i = 0; i < n; i++,m--) {							//세로길이 
																	//i를 증가하고, m을 점점 감소한다. 마이너스 영역까지 가서 점점 배열을 감소하는 형태를 만들기 위해 사용 
			for (j = 0; j <intArr.length-Math.abs(m) ; j++) {	//가로길이
				System.out.print(arr[j]);
				
			}
			System.out.println(" : 높이 =" + i + " 너비=" + j + " 기준="+ m);
		}
	}
}
/*
아래그리기
z
ze
zer
zero
zeroD
zeroDa
zeroDay
zeroDa
zeroD
zero
zer
ze
z
	
*/