package grammer.no11;
/*
	다음 프로그램 컴파일과 실행시 출력되는 결과와 이유?
	동적바인딩이 무엇인지?
	
	동적바인딩이란?
	객체의 타입이 런타임중에 결정되는것을 말함.
	프로그래밍시 함수를 만들어 컴파일 시키면 각 코드는 메모리의 어딘가에 저장되고 함수를 호출하는 과정에서
	그 함수가 저장되는 주소가 저장되는데 이 과정에서 함수가 저장되있는 주소값으로 연결해주는 과정을 바인딩이라고 한다.
	이때 컴파일 되는 시점에 바인딩 해주는 경우를 정적 바인딩이라고 하며 정적바인딩은 Static이나 인스턴스변수등이 이에 해당된다.
	반면 런타임 되는 시점에 바인딩 해주는 경우를 동적 바인딩이라고 하는데 이는 객체의 타입이 런타임중에 결정되기 때문에
	유연성 부분에서 뛰어나지만 중간에 다른 타입이 개입하여 타입에러를 발생시킬수 있는 위험성이 내포되어 있다.
	
*/
public class Grammer11_choiym  extends B implements Testable {
	public static void main(String[] args) {
		Grammer11_choiym oop = new Grammer11_choiym();
		if (oop instanceof Object) {
			System.out.println("Object");
			//instanceof는 참조형 데이터타입을 검사해서 형변환 가능한지 판단을 해준다. 이때 형변환 가능한 타입은 상위타입과
			//상속받은 부모타입, 구현된 클래스타입으로 형변환 가능하다. 때문에 출력된다.
		}
		if (oop instanceof Testable) {
			System.out.println("Testable");
			//oop는 Testable로 형변환이 가능하다. Testable 인터페이스를 구현했기때문이다. 때문에 출력된다.
		}
		if (oop instanceof A) {
			System.out.println("A");
			//oop는 A타입으로 형변환이 불가능하다. 구현되지 않았기때문이다. 출력x
		}
		if (oop instanceof B) {
			System.out.println("B");
			//oop는 B클래스타입으로 형변환이 가능하다. B클래스타입을 상속받았기 때문이다. 출력된다.
		}
		if (oop instanceof C) {
			System.out.println("C");
			// 찾아봐도 안나오는데 interface가 아니라 class 이기때문에 호환되지않는 연산자 유형이라 컴파일 에러가 발생하는것 같다.
			//C 클래스를 상속받지 않았기때문에 형변환이 불가능하다. 출력x
		}
	}
}

interface Testable {}
interface A{}
class B{}
class C{}