package forTest.no03;

public class Question03_inyong {
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			for(int j=0; j<i+1;j++){
				System.out.print(i+1);
				if(j<i){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
