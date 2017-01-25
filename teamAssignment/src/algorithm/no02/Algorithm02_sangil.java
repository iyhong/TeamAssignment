package algorithm.no02;

import java.util.ArrayList;
import java.util.Scanner;

/*
Armstrong number  란? 
	의 각 자릿수의 숫자 값을 ^3을 한뒤 더한값이 원래의 수와 같은 수를 말한다.
ex)
153 은 (1*1*1)+(5*5*5)+(3*3*3) = 153
371 은 (3*3*3)+(7*7*7)+(1*1*1) = 371

	1)	두개의 숫자를 콘솔에서 입력받아
		두 수의 사이에 Armstrong number를 구해 콘솔에 출력하세요
	2)	 하나의 숫자를 입력받아 
		0부터 입력받은 숫자까지 Armstrong number 의 합을 구해 출력하세요
*/

public class Algorithm02_sangil {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오");
		int firstValue = scan.nextInt(); //첫번째 수
		System.out.println("두번째 수를 입력하시오");
		int secondValue = scan.nextInt(); //두번째 수
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> armList = new ArrayList<Integer>();
		while(firstValue>0){
			list.add(firstValue%10);
			firstValue /= 10;
		}
		
		System.out.println(list);
		int firstPow = (int) Math.pow(list.get(0), 3);
		int secondPow = (int) Math.pow(list.get(1), 3);
		int sum = firstPow + secondPow;
		while(firstValue<secondValue){
			if(firstValue==sum){
				System.out.println(firstValue + " <---- 찾았따 요놈");
				armList.add(firstValue);
			}
			firstValue++;
		}
		System.out.println(armList);
	}
}
