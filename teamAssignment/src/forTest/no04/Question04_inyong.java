package forTest.no04;

public class Question04_inyong {
	public static void main(String[] args){
		for(int i=0; i<5; i++){
			for(int j=0; j<i+1 ; j++){
				System.out.print(j+1);
				if(j<i){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
