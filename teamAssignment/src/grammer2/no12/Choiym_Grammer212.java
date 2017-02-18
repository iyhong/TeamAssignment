package grammer2.no12;
/*
	다음 자바 코드 실행시 출력되는 결과는?

*/
public class Choiym_Grammer212 {
	static String result = "1";
	//스태틱영역에 String타입의 참조변수 result를 선언하고 변수에 1 문자열을 할당한다.

	public static void main(String[] args) {
		method(0);
		//mothod()에 매개변수로 0을 입력
		System.out.println(result);
		//static 영역의 변수 result를 콘솔에 출력
		//method(0)을 매개변수로 받으면 x/=x 에서 예외발생 0으로 나눴기때문
		//때문에 ArithmeticException이 발생하고 result에 2라는 문자열을 추가한다. 문자열 "12"가 담긴 새로운 String 객체를 받음
		//catch절에서의 행동이 끝났으므로 finally절에서 "124"라는 문자열을 result에 새로운 주소를 가지는 객체에 추가한다.
		//마지막으로 "124"+"5" "1245" 문자열을 가지는 String객체를 만들어준다. 따라서 result는 1245라는 문자열을 가지는 객체를 가리키게되고
		//콘솔에는 1245가 출력된다.
	}

	public static void method(int x) {
		try {
			x /= x;
		} catch (ArithmeticException e) {
			result += "2";
		} catch (Exception e) {
			result += "3";
		} finally {
			result += "4";
		}
		result += "5";
	}
}
