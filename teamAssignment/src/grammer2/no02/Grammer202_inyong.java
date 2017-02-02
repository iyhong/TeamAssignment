package grammer2.no02;
/*
	출력 : 14579
	이 되도록 for문을 완성하세요.
	
	97541 이 출력되게 만들어 보세요.
	
	그리고 각줄마다 주석을 달아 설명해보세요.
*/
public class Grammer202_inyong {
	static int[] arNum = { 7, 9, 5, 4, 1 };

	public static void main(String[] args) {
		int out, in;
		Grammer202_inyong t = new Grammer202_inyong();
		for (out = arNum.length - 1; out > 0; out--) {
			for (in=0;in<out;in++) { // 다음 for문을 완성하시오
				if (arNum[in] > arNum[in + 1]) {
					t.swap(in, in + 1);
				}
				t.display();
				System.out.println();
			}
		}
		System.out.println("올림차순정렬");
		t.display();
		System.out.println();
		System.out.println("내림차순정렬");
		//반대로 정렬
		for (out = arNum.length - 1; out > 0; out--) {
			for (in=0;in<out;in++) { 
				if (arNum[in] < arNum[in + 1]) {
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
