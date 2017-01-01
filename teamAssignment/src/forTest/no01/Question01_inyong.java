package forTest.no01;

public class Question01_inyong {
	public static void main(String[] args){
		//이렇게 클래서 새로 만들어서 각자 만들기~
		/*
		 * i = 0 -> j = 0
		 * i = 1 -> j = 0, j = 1
		 * i = 2 -> j = 0, j = 1, j = 2
		 * 이런식으로 반복..해서 j번만큼 '*' 출력하고 i번만큼 줄바꿈 실행
		*/		
		for(int i=0;i<5;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
