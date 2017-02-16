package grammer2.no12;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	1245
*/
public class Grammer212_myungchul {
	static String result = "1";	//필드변수로 result가 선언이 되어 있고 문자열 값을 1로 잡여 있다.

	public static void main(String[] args) {
		method(0);					//1. method(0)메서드를 통해서 값을 0이 들어가게 된다.
		System.out.println(result);//8. result 값이 출력식에 담겨저 실행하면 1245가 출력이 된다.
	}

	public static void method(int x) {//2.main메소드에서 받은 값을 int x에 0의 값을 대입한다.
		
		try {
			x /= x;		//3. x의 값을 대입하여 0을 나누게 된다.그러나 0으로 나눌경우 예외처리가 발생을 한다.
		} catch (ArithmeticException e) {//4.예외 처리가 ArithmeticException 예외를 발생 시킨다.
			result += "2";				//5.필드변수인 result에 2문자열값을 더한다. 12
		} catch (Exception e) {			//이미 예외가 발생되어 해당이 안됨
			result += "3";
		} finally {						//예외발생 여부 없이 무조건 실행이 된다.
			result += "4";				//6. result에 값이 4가 들어가 124
		}
		result += "5";					//7. try~catch~finally이가 끝나고
										//해당 연산자가 실행이 되어 1245가 result변수에 담겨져 있다.
	}
}
