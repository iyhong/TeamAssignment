package grammer.no11;

/*
 * 	다음 프로그램 컴파일과 실행시 출력되는 결과와 이유?
 * 	instanceof C 조건문만 주석처리(또는 삭제) 하면 ..결과는
 * 	Object
	Testable
	B
	라고 나온다.
	
	동적바인딩이 무엇인지?
 * 	바인딩이란?
	컴퓨터 프로그래밍에서 각종 값들이 확정되어 더 이상 변경할 수 없는 구속(bind) 상태가 되는 것.
	프로그램 내에서 변수, 배열, 라벨, 절차 등의 명칭,
	즉 식별자(identifier)가 그 대상인 메모리 주소, 데이터형 또는 실제값으로 배정되는 것이 이에 해당되며,
	원시 프로그램의 컴파일링 또는 링크 시에 확정되는 바인딩을 정적 바인딩(static binding)이라 하고,
	프로그램의 실행되는 과정에서 바인딩되는 것을 동적 바인딩(dynamic binding)이라고 한다.
	프로그래밍에서는 바인딩을 가급적 뒤로 미루도록 권고하고 있다.
	동적바인딩은 런타임시점에 바인딩이 되는것이고
	정적바인딩은 컴파일시점에 바인딩이 되는것이다.
 */	
public class Grammer11_inyong  extends C11 implements Testable11 {
	public static void main(String[] args) {
		Grammer11_inyong oop = new Grammer11_inyong();
		//instanceof Object 결과 true 모든객체는 Object를 상속
		if (oop instanceof Object) {
			System.out.println("Object");
		}
		//instanceof Testable1 결과 true Testable1을 구현하였기때문
		if (oop instanceof Testable11) {
			System.out.println("Testable");
		}
		//instanceof A1 결과 false A1을 구현하지 않았기때문에
		if (oop instanceof A11) {
			System.out.println("A");
		}
		//instanceof B1 결과 true B1을 상속했기문에
		if (oop instanceof B11) {
			System.out.println("B");
		}
		//instanceof C1 가 컴파일 에러나는 이유는...extends 는 하나밖에 할수없으니..
		//B를 이미 상속받았으니까...? 라고 추측해본다ㅠㅠ
		if (oop instanceof C11) {
			System.out.println("C");
		}
		if (oop instanceof D11) {
			System.out.println("D");
		}
	}
}

interface Testable11 {}
interface A11{}
class B11{}
class C11 extends B11{}
class D11{}


