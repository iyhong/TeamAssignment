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
public class Algorithm02_inyong {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		question1();
		question2();
		
	}
	public static void question2(){
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0;i<num;i++){
			int temp = i;
			int result = 0;
			while(temp>0){
				int value = temp%10;
				result += Math.pow(value, 3);
				temp /= 10;
			}
			if(i == result){
				sum += i;
			}
		}
		System.out.printf("%d부터 %d까지의 Armstrong Number들의 합은 %d입니다.", 0,num,sum);
	}
	public static void question1(){
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = num1;i<num2;i++){
			int temp = i;
			int result = 0;
			while(temp>0){
				int value = temp%10;
				result += Math.pow(value, 3);
				temp /= 10;
			}
			if(i == result){
				list.add(i);
			}
		}
		System.out.printf("%d부터 %d사이의 Armstrong Number는 ",num1,num2);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i));
			if(i!=list.size()-1){
				System.out.print(",");
			}
		}
		System.out.println("입니다.");
	}
}
