package forTest.no10;

public class Question10_inyong {

	public static void main(String[] args){
		String str = "ABCDEFGHIJKLML";
		char[] charArray = str.toCharArray();
		int absNum = (charArray.length-1)*(-1);
		for(int i=0; i<charArray.length*2-1; i++){
			for(int j=0;j<charArray.length-Math.abs(absNum) ;j++){
				System.out.print(charArray[j]);
			}
			System.out.println();
			absNum++;
		}
	}
}
/*
아래그리기
z
ze
zer
zero
zeroD
zeroDa
zeroDay
zeroDa
zeroD
zero
zer
ze
z
	
*/