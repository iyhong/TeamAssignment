package grammer2.no05;
/*
	출력결과는??
	이유는??
	오류가 난다면 고쳐보세요
	
	ar[][] 변수의 특정 번째에 데이터가 없는 경우, 즉 Array변수의 데이터가 0부터 7까지 있는데 8번재의 데이터를 찾으려고 시도 할때 발생되는 에러라고 한다.
*/
public class Grammer205_myungchul {
	public static void main(String[] args) {
		int ar[][] = new int[3][];
		int value = 0;

		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[4];
		//각 배열에 위치와 값을 넣어 준다.
		/*[1,2]
		[3,4,5]
		[6,7,8,9]*/	
		for (int out = 0; out < ar.length; out++) {
			//System.out.println("out : "+out);
			for (int in = 0; in < ar[out].length; in++) {
				ar[out][in] = ++value;
				/*System.out.println("out02 : "+out);
				System.out.println("in : "+in);
				System.out.println("check : "+ar[out][in]);
				System.out.println();*/
			}
		}
		//트라이 문에서 [1][0]부터 시작을 못한다.
		try {
			for (int out = 0; out < ar.length; out++) {
				for (int in = 0; in < ar[out].length; in++) {//[out][in] 다음 배열을 위치를 설정 해야 한다.
					/*System.out.println("out02 : "+out);
					System.out.println("in : "+in);
					//System.out.println("check : "+ar[out][in]);
					System.out.println();*/
					System.out.println(ar[out][in]);
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}
	}
}
