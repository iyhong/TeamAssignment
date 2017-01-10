package grammer.no02;

public class Grammer02_myungchul {
	/*
	다음은 행렬 곱셈을 구현한 코드
	다음 프로그램 컴파일과 실행시 출력되는 결과는?
	주석달아오기... 내일 설명해야함
	*/
	public static void main(String[] args) {
		int x[][] = { { 3, 2, 3 }, { 5, 9, 8 } };
		int y[][] = { { 4, 7 }, { 9, 3 }, { 8, 1 } };
		//x =	{	{3,2,3}		y = {	{4,7}
		//			{5,9,8}}			{9,3}
		//								{8,1}}
		int z[][] = Matrix01.multiply(x, y);
		Matrix01.print(z);
	}
}

class Matrix01 {
	public static int[][] multiply(int[][] m1, int[][] m2) {
		int m1Rows = m1.length; 	//2
		int m1Cols = m1[0].length;	//3
		int m2Rows = m2.length;		//3
		int m2Cols = m2[0].length;	//2

		if (m1Cols != m2Rows) {//m1Cols=3와 m2Rows=3은 같으면 예외처리가 발생 하지 않는다. 둘중 하나라도 다른 경우 예외처리가 발생한다.
			throw new IllegalArgumentException();
			//상세한 메시지가 없는 IllegalArgumentException을 구성
		}

		int[][] result = new int[m1Rows][m2Cols];
		//						[2]		[2]
		//이중 배열을 생성하고 int[][] result에 대입을 한다.
		for (int i = 0; i < m1Rows; i++) {//i은 0이고 ; i은 m1Rows보다 작다. ; i는 점점증가한다
			//i=0;0<2;0++  / i=1 ; 1<2; 1++ 두번을 반복을 한다.
			for (int j = 0; j < m2Cols; j++) {
				//j=0;0<2;0++ / j=1;1<2;1++
				for (int k = 0; k < m1Cols; k++) {
					//k=0;0<3;0++ / k=1;1<3;1++ / k=2;2<3;2++ 3번을 반복을 한다.
					result[i][j] += m1[i][k] * m2[k][j];
/*3*4 = 12			result[0][0]+= m1[0][0] * m2[0][0]
 *12+(2*9)	=30		result[0][0]+= m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0]
 *12+(2*9)+(3*8)=54	result[0][0]+= m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0] + m1[0][2] * m2[2][0]
 *3*7=21			result[0][1]+= m1[0][0] * m2[0][1]
 *21+(2*3)=27		result[0][1]+= m1[0][0] * m2[0][1] + m1[0][1] * m2[1][1]
 *27+(1*3)=30		result[0][1]+= m1[0][0] * m2[0][1] + m1[0][1] * m2[1][1] + m1[0][2] * m2[2][1]
 *
 *					result[1][0]+= m1[1][0] * m2[0][0]
 *					result[1][0]+= m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0]
 *					result[1][0]+= m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0] + m1[1][2] * m2[2][0]
 *					result[1][1]+= m1[1][0] * m2[1][1]
 *					result[1][1]+= m1[1][0] * m2[1][1] + m1[1][1] * m2[1][1]
 *					result[1][1]+= m1[1][0] * m2[0][1] + m1[1][1] * m2[1][1] + m1[1][2] * m2[2][1]
 *
*/					
					//[0][0], [0][1]
					//[1][0], [1][1] 생성이 된다.
				}
			}
		}//총 12번 배열이 반복하여 생성이 된다.
		//System.out.println(m1[0][2]);
		return result;
	}
	//int[][] result에 있는 배열을 화면에 출력하기 위한 문구
	public static void print(int[][] a) {
		int rows = a.length;	//2
		int cols = a[0].length;	//2
		for (int i = 0; i < rows; i++) {
			//i = 0 ; 0<2 ; 0++  /  i=1 ; 1<2 ; 1++
			System.out.print("{");
			for (int j = 0; j < cols; j++) {
				//j=0 ; 0<2 ; 0++  /  j=1 ; 1<2 ; 1++
				System.out.print(a[i][j] + ",");
			}			
			System.out.println("}");
		}
	}

}
