package forTest.no10;

public class Question10_sangil {
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
	
	public static void main(String[] args){
		String[] zeroday = {"z","e","r","o","d","a","y"};
		//i*(-1) 
		//i=-6; j=0
		//i=-5; j=0,1
		//i=-4; j=0,1,2
		//i=-3; j=0,1,2,3
		//i=-2; j=0,1,2,3,4
		//i=-1; j=0,1,2,3,4,5
		//i=0; j=0,1,2,3,4,5,6
		//i=1; j=0,1,2,3,4,5
		//i=2; j=0,1,2,3,4
		//i=3; j=0,1,2,3
		//i=4; j=0,1,2
		//i=5; j=0,1
		//i=6; j=0
		int init = -6;
		//System.out.println(absNum);
		
		for(int i=init;i<7;i++){
			int absNum = Math.abs(init);
			for(int j=0;j<7-absNum;j++){ //zeroday배열을 0부터 i번째까지 하나씩 꺼내옴
				//System.out.println(absNum);
				System.out.print(zeroday[j]);
			}
			System.out.println();
			init++;
		}
		
	}
	
}
