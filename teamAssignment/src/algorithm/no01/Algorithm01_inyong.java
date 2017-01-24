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
public class Algorithm01_inyong {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String inputStr = s.next();
		int inputNum = Integer.parseInt(inputStr);
		int result = 0;
		
		for(int i=0; i<inputStr.length();i++){
			int tempNum = (int) inputStr.charAt(i) -48;
			System.out.println("tempNum : "+tempNum);
			System.out.println(i+"의 세제곱 값은 : "+Math.pow(tempNum, 3));
			result += Math.pow(tempNum, 3);
		}
		System.out.println("세제곱의 합은 : "+result);
		if(inputNum == result){
			System.out.println(inputNum+"=="+result+" : true");
		}else{
			System.out.println(inputNum+"!="+result+" : false");
		}
		
	}
}
