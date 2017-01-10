package forTest.no10;

public class Question10_myungchul {
	public static void main(String[] args) {
		String[] arr = { "z", "e", "r", "o", "D", "a", "y" };
		for (int i = 0; i < arr.length; i++) {
			
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