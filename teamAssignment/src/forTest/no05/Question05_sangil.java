package forTest.no05;

public class Question05_sangil {
	/*
	5번 아래그림그리기
	A
	BC
	DEF
	GHIJ
	KLMNO

		*/
	public static void main(String[] args){
		int x = 65; //"A"의 아스키 코드값 
		for(int i = 0;i<5;i++){
			for(int j=0;j<i+1;j++){
				x++;
				System.out.print(Character.toString((char)x));
			}
			System.out.print("\n");
		}
	}
}
