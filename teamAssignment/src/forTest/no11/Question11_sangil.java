package forTest.no11;

public class Question11_sangil {
	/*
	 * 01 02 03 04 05 
	 * 16 17 18 19 06
	 * 15 24 25 20 07
	 * 14 23 22 21 08
	 * 13 12 11 10 09
	 * 
	 * 만들어 주세요
	 * */

	public static void main(String[] args){
		
		int[][] arr = new int[5][5];
		final int ROW_MAX = arr.length-1;
		final int COL_MAX = arr[0].length-1;
		final int TOTAL_SIZE = (ROW_MAX+1)*(COL_MAX+1);

		int rowSw = -1;
		int colSw = 1;
		char crossSw = 'c';	//행증가 시작

		int rowStop=ROW_MAX;
		int colStop=COL_MAX;

		int row=0;	//현재 행
		int col=0;	//현재 열

		for(int i=1; i<=TOTAL_SIZE; i++){

			arr[row][col] = i;

			if(col == colStop && crossSw == 'c') {

				crossSw = 'r';
				rowSw *= -1;
				rowStop = (colSw == -1)? ROW_MAX-row+1: ROW_MAX-row;

			}else if(row == rowStop && crossSw == 'r') {

				crossSw = 'c';
				colSw *= -1;
				colStop = (rowSw == -1)? ROW_MAX-row : ROW_MAX-row;

			}

			if(crossSw == 'r') {

				row = row + rowSw;

			}else if(crossSw == 'c'){

				col = col + colSw;

			}

		}

		//출력하기
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				
				System.out.printf("%2s ",arr[i][j]);
			}
			System.out.println();
		}
	}
}
