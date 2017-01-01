package forTest.no05;

public class Question05_myungchul {

	public static void main(String[] args) {
		int x, y;
		int k=65; //아스키코드값
		//참고 할것은 검색을 통해서 알아보자 아스키코드 표에 자세히 표시되어 있다.
		//A를 표시 하기위해 10진수인 65를 k 변수에 선언을 해준다. a를 표시할 경우 10진수인 97로 표시하면 된다.
		for(x=0; x<5; x++){
			for(y=0; y<x+1; y++){
				System.out.print((char)(k++));//int인 k 매개변수를 char로 전환하여
				//화면에 출력을 한다.
			}
			System.out.print("\n");
		}
	}
	
	 /*5번 아래그림그리기
	 A 
	 BC 
	 DEF 
	 GHIJ 
	 KLMNO*/
	 
	 
}
