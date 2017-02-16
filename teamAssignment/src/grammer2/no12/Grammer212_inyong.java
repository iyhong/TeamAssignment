package grammer2.no12;
/*
	다음 자바 코드 실행시 출력되는 결과는?
		
	결과: 1245
	
	이유:
		어떤수를 0으로 나눌수는 없다. 따라서 나눌수가 0이면
		ArithmeticException이 발생되고,result 에는 2가 추가된다 
		그러고 catch절은 나오게되고(Exception e) catch절은 안들어감
		finally문이 실행되서 4가 추가되고
		try,catch,finally문을 마치고 result에 5를 추가한다.
		따라서 결과는 1245가 result 변수에 담기고 출력된다.
*/
public class Grammer212_inyong {
	static String result = "1";

	public static void main(String[] args) {
		method(0);
		System.out.println(result);
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
