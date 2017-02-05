package grammer2.no05;
/*
	출력결과는??
		결과는 1,2 Exception발생
	이유는??
		출력하는 for문에서 내부for에서 [in < ar.length] 조건식이 잘못되었다.
		저 조건식으로 돌리게 되면 ar[0]의 배열이 돌때 3번돌게되는데 ar[0]의 배열크기는 2이기때문에 in 이 2까지올라가고 
		출력명령에서 ar[0][2]을 실행하는데 여기서  ar[0]의크기는 2여서 IndexOutOfBoundsException이 발생된다.
	오류가 난다면 고쳐보세요
		고치려면 조건식을 [in < ar[out].length] 로 고쳐야한다.
*/
public class Grammer205_inyong {
	public static void main(String[] args) {
		int ar[][] = new int[3][];
		int value = 0;

		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[4];

		for (int out = 0; out < ar.length; out++) {
			for (int in = 0; in < ar[out].length; in++) {
				ar[out][in] = ++value;
			}
		}
		try {
			for (int out = 0; out < ar.length; out++) {
				//이곳의 조건식이 잘못됨
				//저렇게돌면 ar[0]의 배열크기는 2인데 ar.length는 3이기때문에 in이2일때 참이되어 for문이 실행되고 
				/*for (int in = 0; in < ar.length; in++) {
					//이곳에서 출력할때 Exception발생
					System.out.println(ar[out][in]);
				}*/
				
				//정상실행되는 코드
				for (int in = 0; in < ar[out].length; in++) {
					System.out.println(ar[out][in]);
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}
	}
}
