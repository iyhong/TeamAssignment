package forTest.no03;

public class Question03_inyong {
	public static void main(String[] args){
		/*
			i=0 -> j=0
			i=1 -> j=0, j=1
			i=2 -> j=0, j=1, j=2
			이런식으로 반복실행되고
			j for문안에서 i+1을 출력한다음
			j<i 일때 뒤에 공백이 들어가야 하므로(j가 i랑 같아질때는 줄바꿈실행되도록)
			
		*/
		for(int i=0;i<5;i++){
			for(int j=0; j<i+1;j++){
				System.out.print(i+1);
				if(j<i){
					System.out.print(" ");
				}else{
					System.out.println();
				}
			}
		}
	}
}
