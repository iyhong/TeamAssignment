package algorithm.no01;

import java.util.ArrayList;
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
public class Algorithm01_choiym {


	    public static void main(String[] args) {
	    	ArrayList<String> array = new ArrayList<String>();
	    	Scanner scanner = new Scanner("371");
	    	String scan = scanner.next();
	    	String num;
	    	System.out.println(scan);
	    	int i;
	    	int j = 1;
	    	for(i=0; i <3 ;i++){
	    		num = scan.substring(i, j);
	    		array.add(num);
	    		j++;
	    	}
	    	System.out.println("array 확인 :"+array.get(0));
	    	System.out.println("array 확인 :"+array.get(1));
	    	System.out.println("array 확인 :"+array.get(2));
	    	int x = Integer.parseInt(array.get(0));
	    	int y = Integer.parseInt(array.get(1));
	    	int z = Integer.parseInt(array.get(2));
	    	
	    	int multi = (x*x*x)+(y*y*y)+(z*z*z);
	    	System.out.println("result :"+multi);
	    	String result = Integer.toString(multi);
	    	if(scan.equals(result)){
	    		System.out.println(true);
	    		
	    	}else{
	    		System.out.println(false);
	    	}
	    	
	    	
	    	
	    }
	
}