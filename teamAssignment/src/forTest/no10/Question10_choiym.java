package forTest.no10;

import java.util.ArrayList;

public class Question10_choiym {
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
		ArrayList<String> character = new ArrayList<String>();
		character.add("z");
		character.add("e");
		character.add("r");
		character.add("o");
		character.add("D");
		character.add("a");
		character.add("y");
		
		for(int i = 0; i < 7; i++){
			//7번 반복되는 for문 z,ze,zer,zero,zerod,zeroda,zeroday 출력할 것
			for(int j = 0; j <= i; j++ ){
				//1~7번 반복되는 for문
				System.out.print(character.get(j));
			}
		System.out.println();	
		}
		for(int i = 6; i > 0 ; i--){
			//6번 반복되는 for문 zeroDa,zeroD,zero,zer,ze,z 출력할 것
			for(int j = 0; j < i ; j++){
				//i가 6일때 j가 0~5까지 6번 반복
				//i가 5일때 j가 0~4까지 5번 반복
				System.out.print(character.get(j));
			}
			System.out.println();
		}
	}
}
