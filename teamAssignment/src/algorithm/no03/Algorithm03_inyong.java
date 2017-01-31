package algorithm.no03;

import java.util.ArrayList;

/*
재귀를 이용해서 
피보나치 수열을 만들어 출력해보세용.
*/
public class Algorithm03_inyong {
	public static void main(String[] args){
		System.out.println();
		for(int i=0; i<20;i++){
			System.out.print(fibo(i)+", ");
		}
		fibo2();
	}
	public static int fibo(int a){
		if(a==0||a==1){
			return a;
		}else{
			return fibo(a-1)+fibo(a-2);
		}
	}
	public static void fibo2(){
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(1);
		for(int i=0;i<20;i++){
			array.add(array.get(i)+array.get(i+1));
			System.out.print(array.get(i)+", ");
		}
	}
}
