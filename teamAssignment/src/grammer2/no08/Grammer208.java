package grammer2.no08;
 /*
 	다음 자바 코드 실행시 출력되는 결과는? 	
 */
 
 public class Grammer208 {
 	private static int result = 0;
 	private static boolean flag = false;
 
 	public static void main(String[] args) {
 		setResult(10);
 		display();
 	}
 
 	public static void setResult(int x) {
 		flag = method1(x) || method2();
 	}
 
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