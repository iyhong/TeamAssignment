package grammer2.no02;
/*
	출력 : 14579
	이 되도록 for문을 완성하세요.
*/
public class Grammer202_sangil {
	static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out, in;
		Grammer202_sangil t = new Grammer202_sangil();

		for (out = arNum.length - 1; out > 0; out--) {
			for (in=0;in<arNum.length-1;in++) { // 다음 for문을 완성하시오
				if (arNum[in] > arNum[in + 1]) {
					/*out=0; in=0; 스왑없음
					 * 		 in=1; 9>1 조건문성립되므로 arNum={7,1,9,4,5}
					 * 		 in=2; 9>4 true 스왑발생 arNum={7,1,4,9,5}
					 * 		 in=3; 9>5 true 스왑발생 arNum={7,1,4,5,9}
					 *out=1; in=0; 7>1 true 스왑발생 arNum={1,7,4,5,9}
					 *		 in=1; 7>4 true 스왑발생 arNum={1,4,7,5,9}
					 *		 in=2; 7>5 true 스왑발생 arNum={1,4,5,7,9}
					 *나머지는 false가 떨어져 더이상 swap이 발생하지 않음*/
					t.swap(in, in + 1);
				}
			}
		}
		t.display(); //`
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
