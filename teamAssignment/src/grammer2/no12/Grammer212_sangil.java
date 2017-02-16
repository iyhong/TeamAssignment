package grammer2.no12;
/*
	다음 자바 코드 실행시 출력되는 결과는?

*/
public class Grammer212_sangil {
	static String result = "1"; //static변수이므로 이 클래스 안에서 이 변수는 공유된다.

	public static void main(String[] args) {
		method(0); //method 메서드를 호출하고 매개변수에 0을 입력한다.
		System.out.println(result); //"1245" 문자열을 출력
	}

	public static void method(int x) { //x=0
		try {
			x /= x; // x = x / x ->0끼리 나눗셈을 하게 되면 ArithmeticException이 발생한다.
		} catch (ArithmeticException e) {
			result += "2"; //result는 1이라는 초기값을 가지고 있다. result 변수는 String 타입이므로 숫자가 아닌 문자열이다. 여기에 2를 더하면 3이 되는 것이 아니라
						   //문자열 2가 추가되어 "12"가 된다.
		} catch (Exception e) { //앞의 캐치절이 수행됐으므로 이 catch절은 수행하지 않음
			result += "3";
		} finally { //finally는 무슨 일이 있어도 실행되는 절이므로 result가 12인 상태에서 여기에 도달한다.
			result += "4"; //12에 4라는 문자열을 더해서 result값은 이제 124가 되었다.
		}
		result += "5"; //try,catch,finally절이 끝나고 마지막으로 result값에 5라는 문자열을 더해준다. 이로써 result값은 1245가 되었다.
	} //method메서드 종료
}
