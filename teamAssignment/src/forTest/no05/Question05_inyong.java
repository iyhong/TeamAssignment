package forTest.no05;

public class Question05_inyong {
	public static void main(String[] args){
		// 대문자 A의 아스키코드는 65, 소문자 a의 아스키코드는 97
		char c = 65;
		//System.out.println(c);
		
		for(int i=0; i<5; i++){
			for(int j=0;j<i+1; j++){
				System.out.print(c);
				c++;
			}
			System.out.print("\n");
		}
	}
}
