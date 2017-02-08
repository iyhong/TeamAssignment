package grammer2.no06;
/*
	다음 자바 코드를 컴파일시 오류가 발생되는 이유를 적으시옹~
*/

public class Grammer206 {
	public static void main(String[] args) {
		Parent_choi parent = new Parent_choi();
		Child_choi child = new Child_choi();
		parent = child;
		System.out.println("parent ? : "+ parent);
		child = (Child_choi) parent;
		parent.subMethod();
		System.out.println("parent ? : "+ parent);
		//child가 parent클래스 타입으로 형변환함 그러나 부모클래스에서는 subMethod가 없기때문에
		//부모타입의 변수로는 subMethod를 사용할 수 없다. 사용하려면 child.subMethod()로 사용해야함 
		child.superMethod();
		System.out.println(parent.a);
		//private 이기때문에 다른클래스에서는 a를 호출할 수 없다.
		System.out.println(parent.b);
		System.out.println(parent.c);
		
		System.out.println(parent.x);
		System.out.println(parent.y);
		System.out.println(parent.z);
		//parent에서는 자식의 필드변수를 호출 할 수 없다.
		System.out.println(child.a);
		//private이기때문에 a가 상속이 안된상태. a가 존재하지않음
		System.out.println(child.b);
		System.out.println(child.c);
		System.out.println(child.x);
		//private이기때문에 다른클래스에서 사용할 수 없다.
		System.out.println(child.y);
		System.out.println(child.z);
	}
}

class Parent_choi {
	private int a = 1;
	protected int b = 2;
	public int c = 3;

	public void superMethod() {
		System.out.println("superMethod");
	}
}

class Child_choi extends Parent_choi {
	private int x = 4;
	protected int y = 5;
	public int z = 6;

	public void subMethod() {
		System.out.println("subMethod");
	}
}
