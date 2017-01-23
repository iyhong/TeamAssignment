package algorithm.no01;

import java.util.Scanner;

/*
	Armstrong number  란? 
		의 각 자릿수의 숫자 값을 ^3을 한뒤 더한값이 원래의 수와 같은 수를 말한다.
	ex)
	153 은 (1*1*1)+(5*5*5)+(3*3*3) = 153
	371 은 (3*3*3)+(7*7*7)+(1*1*1) = 371
	
	하나의 숫자를 콘솔에서 입력받아
	Armstrong number이면 true를 아니면 false를 콘솔에 출력하세요
*/
public class Algorithm01_myungchul {
	public static void main(String[] args) {
		Scanner s01 = new Scanner(System.in);
		String str = s01.next();
		int n = Integer.parseInt(str);
		int c = 0, a, temp;//
		temp = n;
		
		System.out.println(n);
		while (n > 0) {
			a = n % 10;
			System.out.println("num 나머지:" + a);
			n = n / 10;
			System.out.println("num 몫:" + n);
			c = c + (a * a * a);
			System.out.println("num 세제금:" + c);
		}
		if (temp == c) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}