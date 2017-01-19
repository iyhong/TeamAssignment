package grammer.no11;

/*
다음 프로그램 컴파일과 실행시 출력되는 결과와 이유?
동적바인딩이 무엇인지?
*/
public class Grammer11_sangil  extends BB implements Testable_si {
	public static void main(String[] args) {
		Grammer11_sangil oop = new Grammer11_sangil();
		if (oop instanceof Object) { //우선 instanceof 메서드는 oop객체가 object를 참조할 수 있으면 true를 리턴한다.
			System.out.println("Object"); //object 클래스는 모든 클래스의 상위클래스이므로  true를 리턴하고 "Object" 문자열을 출력시킨다.
		}
		if (oop instanceof Testable_si) { //Grammer11클래스는 Testable_si인터페이스를 구현하고 있으므로 참조할 수 있다.
			System.out.println("Testable_si"); //따라서 "Testable_si" 문자열을 출력시킨다.
		}
		if (oop instanceof AA) { //Grammer11클래스는 AA인터페이스를 구현하지 않았으므로 참조할 수 없다. 따라서 false로 if문이 실행되지 않는다.
			System.out.println("AA");
		}
		if (oop instanceof BB) { //Grammer11 클래스는 BB를 상속받고 있으므로 참조가 가능하다. 
			System.out.println("BB"); //따라서 "BB" 문자열을 출력시킨다.
		}
		
	}
}

interface Testable_si {}
interface AA{}
class BB{}
class CC{}
