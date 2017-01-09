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
		
		for(int i = (character.size()-1)*(-1); i < character.size(); i++){
			//7번 반복되는 for문 z,ze,zer,zero,zerod,zeroda,zeroday 출력할 것
			for(int j = 0; j < character.size()-Math.abs(i); j++ ){
				
				//1~7번 반복되는 for문
				System.out.print(character.get(j));
			}
		System.out.println();	
		}
		
	}
}
