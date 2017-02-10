package grammer2.no02;
/*
	출력 : 14579
	이 되도록 for문을 완성하세요.
	
	97541 이 출력되게 만들어 보세요.
	
	그리고 각줄마다 주석을 달아 설명해보세요.
*/
public class Choiym_Grammer202 {
	static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out, in;
		Choiym_Grammer202 t = new Choiym_Grammer202();

		
		for (out = arNum.length - 1; out > 0; out--) {
			//for문이 처음돌면(out이 4일때) 7,1,4,5,9
			//for문이 두번돌면(out이 3일때) 1,4,5,7,9
			//for문이 세번돌면(out이 2일때) 1,4,5,7,9
			//for문이 네번돌면(out이 1일때) 1,4,5,7,9 
			//위와 같이 정렬된다.
			//만약 아래의 for문의 if문의 등호가 <로 바뀌면 역순으로 정렬하여 9,7,5,4,1이 정렬된다.
			for (in = 0 ; in < arNum.length-1 ; in++) { // 다음 for문을 완성하시오
				//index 0 ~ 4까지 꺼내서 서로 값을 비교하여 큰수를 뒤로 보내도록 for문을 작성
				
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
		//one 과 two 를 입력받아(배열의 index번호) 서로 값을 바꿔 세팅해줌
	}

	void display() {
		for (int index = 0; index < arNum.length; index++) {
			System.out.print(arNum[index]);
			//arNum의 배열만큼 포문을 반복하여 화면에 출력(줄바꿈하지않음)
		}
	}
}
