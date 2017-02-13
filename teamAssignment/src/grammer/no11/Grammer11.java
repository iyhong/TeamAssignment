package grammer.no11;
/*
	다음 프로그램 컴파일과 실행시 출력되는 결과와 이유?
	동적바인딩이 무엇인지?
*/
public class Grammer11  extends B implements Testable {
	public static void main(String[] args) {
		Grammer11 oop = new Grammer11();
		if (oop instanceof Object) {
			System.out.println("Object");
		}
		if (oop instanceof Testable) {
			System.out.println("Testable");
		}
		if (oop instanceof A) {
			System.out.println("A");
		}
		if (oop instanceof B) {
			System.out.println("B");
		}
		
	}
}

interface Testable {}
interface A{}
class B{}
class C{}