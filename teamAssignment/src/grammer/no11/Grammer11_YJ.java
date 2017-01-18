package grammer.no11;
/*
	다음 프로그램 컴파일과 실행시 출력되는 결과와 이유?
	동적바인딩이 무엇인지?
*/
public class Grammer11_YJ  extends B1 implements Testable1 {
	public static void main(String[] args) {
		Grammer11_YJ oop = new Grammer11_YJ();
		if (oop instanceof Object) {
			//oop 는 Object 보다 하위 클래스의 객체이기 때문에 
			//true를 반환해서 if문이 실행된다.
			//Object는 모든클래스의 상위클래스!
			System.out.println("Object");
		}
		if (oop instanceof Testable1) {
			System.out.println("Testable");
		}
			//oop는 Testable1을 구현하고 있으므로 
			//true값이 나와 if문이 실행된다
		if (oop instanceof A1) {
			System.out.println("A1");
			//oop는 A1을 상속 받지 않아서 
			//A1이 캐스팅이 되지않는다. 
			//false 나와 if문이 실행되지 않는다.
		}
		if (oop instanceof B1) {
			System.out.println("B1");
		}
			//oop 는 B1 클래스를 상속받았기 때문에  
			//oop 는 B1클래스보다 하위 클래스의 객체이다.
			//따라서 true값이 나와 if문이 실행된다.
		
		if (oop instanceof C1) {
			System.out.println("C1");
		}
			//oop 는 C클래스를 상속받지 않았기 때문에 컴파일 에러가 난다.
			//관계를 알수없다!
		
	}
}

interface Testable1 {}
interface A1{}
class B1{}
class C1{}