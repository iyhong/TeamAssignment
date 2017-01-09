package forTest.no05;

public class Question05_choiym {
	/*
5번 아래그림그리기
A
BC
DEF
GHIJ
KLMNO

	*/
	
	public static void main(String[] args){
		int  c = 65;
		for(int a = 1; a < 6; a ++){
			 for(int b = 1; b <= a; b++){
				 System.out.print((char)c);
				 c++;
					
			 }
			System.out.println();
		}
		
	}
	
}
