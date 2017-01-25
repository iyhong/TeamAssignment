package algorithm.no02;

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
public class Algorithm02_choiym {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		test01();
		test02();
	}
	
	//두개의 숫자를 콘솔에서 입력받아 두 수의 사이에 Armstrong number를 구해 콘솔에 출력하세요
	public static void test01(){
		int scan1 = scanner.nextInt();
		int scan2 = scanner.nextInt();
		//콘솔에서 두개의 숫자를 입력받는다.
		System.out.println("콘솔에 입력된 i : "+scan1);
		System.out.println("콘솔에 입력된 j : "+scan2);
		if(scan1 > scan2){
			int save = scan1;
			scan1 = scan2;
			scan2 = save;
			// 아무렇게나 입력받은 숫자를 첫 숫자가 작도록 만들어줌.
			//ex) 10000 , 8 입력시 8, 10000 입력한것으로 바꾸어준다.
		}
		
		for(int i = scan1; i <= scan2 ;i++){
			// 입력받은 두개의 숫자로 for문의 범위를 정해준다.
			int a = i;
			int b = 0;
			int c = 0;
			while(a > 0){
				b = a % 10;
				//i를 10으로 나눈 나머지를 b에 담는다.
				c = c +(b*b*b);
				//나머지를 3번곱한값을 c에 계속 더해준다.
				a = a /10;
				// a를 10으로 나눠 자리수별로 나눈다.
				//만약 i가 123이라면 첫번째 while문에서 b에 3이 저장되고 c= 3*3*3+0 = 27, a는 123/10= 12.3 인데 a가 int이므로
				//12가 저장되서 다시 while문으로 들어간다. 같은방법이 반복되어 12%10 = 2 , b=2 가되고 c = 27+(2*2*2) = 35 a= 1.2 이므로 1
				//1%10 = 1 , c= 35+(1*1*1) = 36이 되고 1을 10으로 나누면 0.1, a는 int이기때문에 a=0이므로 while문을 벗어나게 된다.
			}
			if(i==c){
				//입력받은 i와 c가 같은값일때 armstrong number이므로 이를 출력하면 된다.
				System.out.println("armstrong number : "+i);
			}
		}
	}
	
	// 하나의 숫자를 입력받아 0부터 입력받은 숫자까지 Armstrong number 의 합을 구해 출력하세요
	public static void test02(){
		int scan3 = scanner.nextInt();
		int sum = 0;
		// 콘솔에서 int값을 하나 입력받는다.
		for(int i=0; i < scan3; i++){
			int a = i;
			int b = 0;
			int c = 0;
			while(a > 0){
				b = a % 10;
				c = c +(b*b*b);
				a = a /10;
			}
			//한자리씩 분류해서 c에 담음
			if(i==c){
				System.out.println("armstrong Number : "+i);
				sum += i;
				// i와 c가 같아지면 i를 메소드의 지역변수인 sum에 +해준다.
			}
		}
		System.out.println("armstrong number의 총 합계 : "+sum);
	}
}
