package grammer.no02;

public class Grammer02_inyong {
	/*
	다음은 행렬 곱셈을 구현한 코드
	다음 프로그램 컴파일과 실행시 출력되는 결과는?
	주석달아오기... 내일 설명해야함
	*/
	int a[] = {1,2,3,4,5};
	public static void main(String[] args) {
		int x[][] = { { 3, 2, 3 }, { 5, 9, 8 } };
		/*
			x[2x3] =  3, 2, 3
				 	  5, 9, 8
		*/
		int y[][] = { { 4, 7 }, { 9, 3 }, { 8, 1 } };
		/*
			y[3x2] = 4, 7
					 9, 3
					 8, 1
		*/
		int z[][] = MatrixInyong.multiply(x, y);
		MatrixInyong.print(z);
	}
}

class MatrixInyong {
	public static int[][] multiply(int[][] m1, int[][] m2) {
		int m1Rows = m1.length;
		int m1Cols = m1[0].length;
		int m2Rows = m2.length;
		int m2Cols = m2[0].length;
		
		//첫번째 행렬의 컬럼수가 두번째행렬의 로우수와 같지않으면 예외만들어서 던짐
		//왜냐하면 행렬곱셈할때 M*N x N*O 일경우에만 곱셈이 가능하기때문
		if (m1Cols != m2Rows) {
			throw new IllegalArgumentException();
		}
		//이중배열 생성
		int[][] result = new int[m1Rows][m2Cols];
		
		/*
			i=0, j=0, k=0 일때 result[0][0] = m1[0][0]*m2[0][0]
			i=0, j=0, k=1 일때 result[0][0] = m1[0][0]*m2[0][0] + m1[0][1]*m2[1][0]
			i=0, j=0, k=2 일때 result[0][0] = m1[0][0]*m2[0][0] + m1[0][1]*m2[1][0] + m1[0][2]*m2[2][0]
			i=0, j=1, k=0 일때 result[0][1] = m1[0][0]*m2[0][1]
			i=0, j=1, k=1 일때 result[0][1] = m1[0][0]*m2[0][1] + m1[0][1]*m2[1][1]
			i=0, j=1, k=1 일때 result[0][1] = m1[0][0]*m2[0][1] + m1[0][1]*m2[1][1] + m1[0][2]*m2[1][2]
			반복
		*/
		for (int i = 0; i < m1Rows; i++) {
			for (int j = 0; j < m2Cols; j++) {
				for (int k = 0; k < m1Cols; k++) {
					result[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return result;
	}
	//행렬 출력메서드
	public static void print(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		//첫번째줄 즉 행렬의 row가 0인 (0,0)과 (0,1)을 출력하고
		//줄바꿈한다음에 row가 1인 (1,0)과 (1,1)을 출력한다.
		for (int i = 0; i < rows; i++) {
			System.out.print("{");
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j]);
				if(j<cols-1){
					System.out.print(",");
				}
			}
			System.out.println("}");
		}
	}

}
