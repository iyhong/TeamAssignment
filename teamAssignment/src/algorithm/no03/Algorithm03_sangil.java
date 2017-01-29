package algorithm.no03;
/*
재귀를 이용해서 
피보나치 수열을 만들어 출력해보세용.
*/
public class Algorithm03_sangil {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.print(test(i)+",");
		}
	}
	
	public static int test(int n){
		if(n==0||n==1){
			return n;
		}else {
			return test(n-1)+test(n-2);
		}		

	}
}
