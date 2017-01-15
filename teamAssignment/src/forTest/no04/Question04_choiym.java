package forTest.no04;

public class Question04_choiym {

	public static void main(String[] args) {
			String b = "";
			for(int a = 1; a <6; a++){
			//5번 반복되는 for문 작성
				b += a+ " ";
				
				//문자열 b에 a+" " 문자열을 추가해줌
				System.out.println(b);
				//b를 콘솔에 출력
			}
			//결과
			//a가 1일때 1" "
			//a가 2일때 1" "2" "
			//a가 3일때 1" "2" "3" "
			//a가 4일때 1" "2" "3" "4" "
			//a가 5일때 1" "2" "3" "4" "5" "
	}
		
}
