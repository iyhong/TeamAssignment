package grammer2.no08;
/*
	다음 자바 코드 실행시 출력되는 결과는?
	주석을 쓰시오!
	10 true
	로 출력이 된다.
	or 연산자는 앞에 있는 값이 먼저 나와 있으면 뒤에 있는 값이 없든 있든 앞에 있는 값을 갖이고 반환을 한다.
	그래서 10 true로 출력이 된다.
*/
 
public class Grammer208_myungchul {
	private static int result = 0;
	private static boolean flag = false;
 
	public static void main(String[] args) {		
		setResult(10);//setResult()의 메서드로 10값을 대입을 받는다.
		//System.out.println(result);
		display();
	}
 
	public static void setResult(int x) {//main메서드에서 입력받은 10의 값을 int x에 대입한다.
		flag = method1(x) || method2();
		/*method1() 메서드에서는 true 값과 result 값을 가지고 나온다.
		method2() 메서드에서 result값과 리턴된 값이 있어야 한다.
		그러나 or 연산자는 || 두개를 비교 하는 값에 따라 무조건 true로 나온다.
		단, 두개의 값이 false이면 false로 반환이 된다.
		고정되어 있는 값이 있다면 나오겠지만
		연산(계산)해서 오는 앞에 있는 메서드에서 가지고 온 값을 갖이고 반환을 해서 
		result 값이 10이며 true로 출력이 된다.
		
*/	}
 
	public static boolean method1(int x) {
		boolean temp = false;
		if (x > 0) {
			result = x;
			temp = true;
		}
		return temp;
	}
 
	public static boolean method2() {
		
			result = result * 10;
			return true;
		
	}
 
	public static void display() {
		System.out.print(result + " ");
		System.out.println(flag);
	}
}