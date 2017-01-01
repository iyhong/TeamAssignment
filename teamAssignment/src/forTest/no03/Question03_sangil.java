package forTest.no03;

public class Question03_sangil {
	/*
	 
	3번 아래그림 그리기(공백유의)
	1
	2 2
	3 3 3
	4 4 4 4
	5 5 5 5 5
		
		*/
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			for(int j =0;j<i+1;j++){
				System.out.print(i+1+"");
			}
			System.out.print("\n");
		}
	}
}
