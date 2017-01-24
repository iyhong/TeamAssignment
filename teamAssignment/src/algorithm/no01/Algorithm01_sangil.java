package algorithm.no01;

import java.text.DecimalFormat;
import java.util.ArrayList;

/*
Armstrong number  란? 
	의 각 자릿수의 숫자 값을 ^3을 한뒤 더한값이 원래의 수와 같은 수를 말한다.
ex)
153 은 (1*1*1)+(5*5*5)+(3*3*3) = 153
371 은 (3*3*3)+(7*7*7)+(1*1*1) = 371

하나의 숫자를 콘솔에서 입력받아
Armstrong number이면 true를 아니면 false를 콘솔에 출력하세요

*/
public class Algorithm01_sangil {
	public static void main(String[] args){
		DecimalFormat form = new DecimalFormat("#.##");
		double randomValue = Math.random()*10; //0~9 사이의 숫자
		System.out.println("0~9사이의 숫자 : " +Math.ceil(randomValue));
		
		String testValue = form.format(randomValue); //소숫점 둘째자리까지 표시
		System.out.println("소숫점 둘째자리까지 표시 : "+testValue);
		
		double doubleValue = (Double.parseDouble(testValue))*100; //100~1000까지의 정수
		System.out.println("100~1000까지의 정수 : "+doubleValue);
		
		int test = (int)(Math.ceil(doubleValue)); //소숫점 없애기
		System.out.println("소숫점 없앤 doubleValue값 : "+test);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(test > 0) { //각 자릿수 구해서 arrayList에 담기
			list.add(test%10);
			test /= 10;
		}
		
		/*
			list.add(1);
			list.add(5);
			list.add(3);
			암스트롱 넘버 테스트
		*/
		System.out.println(list);
		
		int FirstValue = list.get(0); //list에 담긴 첫번째 수
		int FirstPow = (int) Math.pow(FirstValue, 3); //첫번째 수를 3제곱
		int SecondValue = list.get(1); //list에 담긴 두번째 수
		int SecondPow = (int) Math.pow(SecondValue, 3); //두번째 수를 3제곱
		int ThirdValue = list.get(2); //list에 담긴 세번째 수
		int ThirdPow = (int) Math.pow(ThirdValue, 3); //세번째 수를 3제곱
		int sum = FirstPow + SecondPow + ThirdPow; //각 자릿수의 합
		
		
		//Armstrong number인지 확인
		if(test==sum){
			System.out.println("Armstrong number네유");
		}else{
			System.out.println("Armstrong number가 아니네유");
		}
		
	}



	
}
