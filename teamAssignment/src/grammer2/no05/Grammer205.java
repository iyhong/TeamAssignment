package grammer2.no05;
/*
	출력결과는??
	이유는??
	오류가 난다면 고쳐보세요
*/
public class Grammer205 {
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
				for (int in = 0; in < ar.length; in++) {
					System.out.println(ar[out][in]);
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}
	}
}
