package grammer2.no06;
/*
다음 자바 코드를 컴파일시 오류가 발생되는 이유를 적으시옹~
*/
public class Grammer206_sangil {
	public static void main(String[] args) {
		Parent_si Parent_si = new Parent_si(); //Child클래스는 Parent클래스를 상속받고 있다. Child클래스가 자식클래스이고, Parent클래스는 부모클래스이다.
		Child_si Child_si = new Child_si();
		Parent_si = Child_si; //따라서 Child 클래스가 Parent클래스와 같아질 수 있지만
		Child_si = (Child_si) Parent_si; //Parent클래스가 상위클래스이므로 Child클래스가 되려면 캐스팅이 필요하다.
		Parent_si.subMethod(); //부모클래스라 할지라도 자식클래스의 메서드를 호출할 수 없다.
		Child_si.superMethod(); //자식클래스는 부모클래스를 상속받았으므로 부모클래스의 메서드를 호출할 수 있다.
		System.out.println(Parent_si.a); //private으로 되어있는 변수는 다른 클래스에서 사용할 수 없다. 세터/게터를 이용해 a값을 얻을 수는 있다.
		System.out.println(Parent_si.b); //protected로 되어 있으면 같은 패키지 내에서는 사용할 수 있다.
		System.out.println(Parent_si.c); //public은 어디서든 접근할 수 있다.
		System.out.println(Parent_si.x); //Parent클래스로 생성된 객체로는 Child클래스의 변수값을 사용할 수 없다. Child클래스가 Parent클래스를 상속받은 것이지
										 //Parent클래스는 Child클래스를 상속받지 않았다.
		System.out.println(Parent_si.y);
		System.out.println(Parent_si.z);
	}
}

class Parent_si {
	private int a = 1;
	protected int b = 2;
	public int c = 3;

	public void superMethod() {
		System.out.println("superMethod");
	}
}

class Child_si extends Parent_si {
	private int x = 4;
	protected int y = 5;
	public int z = 6;

	public void subMethod() {
		System.out.println("subMethod");
	}
}