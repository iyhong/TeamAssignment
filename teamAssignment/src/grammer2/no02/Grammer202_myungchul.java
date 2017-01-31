package grammer2.no02;
/*
	출력 : 14579
	이 되도록 for문을 완성하세요.
*/
public class Grammer202_myungchul {
	static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out, in;
		Grammer202_myungchul t = new Grammer202_myungchul();

		for (out = arNum.length - 1; out > 0; out--) {
			for (in = 0; in < arNum.length - 1; in++) { // 다음 for문을 완성하시오
				if (arNum[in] > arNum[in + 1]) {
					t.swap(in, in + 1);
				}
			}
		}
		t.display();
	}

	void swap(int one, int two) {
		int temp = arNum[one];
		arNum[one] = arNum[two];
		arNum[two] = temp;
	}

	void display() {
		for (int index = 0; index < arNum.length; index++) {
			System.out.print(arNum[index]);
		}
	}
}
