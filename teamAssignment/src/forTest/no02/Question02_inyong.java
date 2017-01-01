package forTest.no02;

public class Question02_inyong {
	public static void main(String[] args){
		/*
			i=0 -> j=0, j=1, j=2, j=3, j=4
			i=1 -> j=0, j=1, j=2, j=3
			i=2 -> j=0, j=1, j=2
			이렇게 j는 5,4,3,2,1 번씩 반복실행된다.
		*/
		for(int i=0;i<5; i++){
			for(int j=0;j<5-i ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
