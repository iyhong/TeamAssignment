package grammer.no11;
/*
	다음 프로그램 컴파일과 실행시 출력되는 결과와 이유?
	동적바인딩이 무엇인지?
*/
public class Grammer11_myungchul  extends B_lmc implements Testable_lmc {
	public static void main(String[] args) {
		Grammer11_myungchul oop = new Grammer11_myungchul();
		if (oop instanceof Object) {
			System.out.println("Object");
		}
		//Object클래스가 모든클래스들의 최상위 클래스이므로
		//모든 자바 클래스들은 Object클래스로부터 상속을 받고 있다. 그래서 instanceof 연산자가 true를 반환하여
		//출력이 되어 값이 Object
		if (oop instanceof Testable_lmc) {
			System.out.println("Testable");
		}
		//Testable 인터페이스를 구현을 하고 있고 instanceof 연산자로 통해서 true를 반환하여
		//Testable로 출력이 된다.
		if (oop instanceof A_lmc) {
			System.out.println("A");
		}
		//A_lmc 인터페이스는 클래스가 구현을 받지 않고 있기 때문에 instanceof 연산자가 oop 객체와 비교해서 
		//false로 반환이 된다.
		if (oop instanceof B_lmc) {
			System.out.println("B");
		}
		//B_lmc 클래스가 Grammer11_LMC클래스에 상속을 하고 있기 때문에
		//instanceof 연산가 true로 반환이 되어 B라는 결과값이 나온다.
		//
		/*if(oop instanceof C_lmc){
			System.out.println("c");
		}
		C_lmc 클래스가 상속을 하지 않고 있기 때문에 instanceof 연산자가 oop 객체와 비교해서 
		false로 반환이 된다.
		 * */
		
		
	}
}
/*결과값
Object
Testable
B*/

interface Testable_lmc {}
interface A_lmc{}
class B_lmc{}
class C_lmc{}