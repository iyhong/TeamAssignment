package forTest.no10;

public class Question10_YJ {
	public static void main(String[] args){
		String[] arr = {"z","e","r","o","D","a","y"};
		
		//문제 3번응용
		for(int i=0;i<7;i++){
			for(int j=0; j<i+1;j++){
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		for(int i=0; i<6; i++){
			for(int j=0;j<6-i;j++){
				System.out.print(arr[j]);
			}
			System.out.println();
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
}
