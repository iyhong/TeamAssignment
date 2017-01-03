package grammer02;

public class Grammer02_choiym {
	/*
	다음은 행렬 곱셈을 구현한 코드
	다음 프로그램 컴파일과 실행시 출력되는 결과는?
	주석달아오기... 내일 설명해야함
	*/
	public static void main(String[] args) {
		int x[][] = { { 3, 2, 3 }, { 5, 9, 8 } };
		//2x3행렬 
		int y[][] = { { 4, 7 }, { 9, 3 }, { 8, 1 } };
		//3x2행렬
		int z[][] = MatrixChoi.multiply(x, y);
		
		//z는 return받은 result행렬을 가짐
		MatrixChoi.print(z);
	}
}

class MatrixChoi {
	public static int[][] multiply(int[][] m1, int[][] m2) {
		//m1은 2행 3열 짜리 배열
		//m2는 3행 2열 짜리 배열
		int m1Rows = m1.length;//2
		int m1Cols = m1[0].length;//3
		int m2Rows = m2.length;//3
		int m2Cols = m2[0].length;//2

		if (m1Cols != m2Rows) {
			throw new IllegalArgumentException();
			//열x행이 같지않으면 예외처리
		}

		int[][] result = new int[m1Rows][m2Cols];
		// { {} , {} } 형태의 배열 생성
		for (int i = 0; i < m1Rows; i++) {
			//i가 0,1일때 for문 반복
			for (int j = 0; j < m2Cols; j++) {
				//j가 0,1 일때 for문 반복
				for (int k = 0; k < m1Cols; k++) {
					//k가 0,1,2 일때 for문 반복
					result[i][j] += m1[i][k] * m2[k][j];
					//result[0][0] = m1[0][0]*m2[0][0] = 3*4 = 12
					//result[0][0] = result[0][0]+m1[0][1]*m2[1][0] = 2*9 = 18
					//result[0][0] = result[0][0]+m1[0][2]*m2[2][0} = 3*8 = 24									
					//result[0][0]은 12+18+24 = 54
					//result[0][1] = 21+6+3 = 30
					//result[1][0] = 20+81+64 = 165
					//result[1][1] = 35+27+8 = 70
					// result = [ 54, 30 ]
					//			[ 165, 70] 형태의 행열을 가지게 된다.
				}
			}
		}
		return result;
	}

	public static void print(int[][] a) {
		//a는 2x2형태의 행렬
		int rows = a.length;//2
		int cols = a[0].length;//2
		for (int i = 0; i < rows; i++) {
			//i가 0,1 일때 반복
			System.out.print("{");
			for (int j = 0; j < cols; j++) {
				//j가 0,1 일때 반복
				System.out.print(a[i][j] + ",");
			}
			System.out.println("}");
		}
		// 때문에 {a[0][0],a[0][1],}
		//		  {a[1][0],a[1][1],} 형태로 출력될 것이다.
	}
}
