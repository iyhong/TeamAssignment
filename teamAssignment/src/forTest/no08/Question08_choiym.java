package forTest.no08;

public class Question08_choiym {
/*
아래그리기	
     *
    * *
   * * *
  * * * *
 * * * * *
	
*/
	public static void main(String[] args){
		int num = 6;
		for(int i = 1; i<num; i++){
			//5번 반복되는 for문 작성 (콘솔에 5줄 찍으려고)
			for(int j = 0; j < num-i-1 ;j++ ){
				//4칸,3칸,2칸,1칸 짜리 공백역삼각형이 만들어짐
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++){
				//1번,2번,3번,4번,5번 찍어야함
				//따라서 i가 1일때 k는 1번만 실행, i가 2이면 2번실행
				//i가 5까지 증가하므로 5번 실행됨.
				System.out.print(" *");
			}
			System.out.println();
			//줄바꿈
		}
	}
	
}
