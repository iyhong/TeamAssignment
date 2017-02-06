package grammer2.no06;
/*
	다음 자바 코드를 컴파일시 오류가 발생되는 이유를 적으시옹~
*/

public class Grammer206_inyong {
	public static void main(String[] args) {
		Parent11 parent = new Parent11();
		Child11 child = new Child11();
		//부모참조타입변수가 자식객체를 참조하한다.
		//그럼 부모타입이 가지고있는 멤버만 사용할수 있다.
		parent = child;
		
		//자식객체를 부모타입변수에 넣은것을
		//다시 자식참조변수가 참조한다.
		//그럼 자식이 가지고있는 멤버와 부모가 가진 멤버 모두사용 가능
		child = (Child11) parent;
		//부모가 가진 멤버만 사용가능하므로 자식이 가진 subMethod를 호출하면 에러발생
		parent.subMethod();
		child.superMethod();
		//부모가가진 멤버는 호출가능한데 a변수는 private으로 접근제한되어있다
		System.out.println(parent.a);
		System.out.println(parent.b);
		System.out.println(parent.c);
		//x,y,z변수는 모두 자식이 가지고있는 변수이기 때문에 사용불가
		System.out.println(parent.x);
		System.out.println(parent.y);
		System.out.println(parent.z);
		
		//child는 자식객체를 참조하므로 모든멤버에 접근가능하지만 
		//private으로 접근제한되어있는 멤버는 접근 불가하다.
		System.out.println(child.a);
		System.out.println(child.b);
		System.out.println(child.c);
		System.out.println(child.x);
		System.out.println(child.y);
		System.out.println(child.z);
	}
}

class Parent11 {
	private int a = 1;
	protected int b = 2;
	public int c = 3;

	public void superMethod() {
		System.out.println("superMethod");
	}
}

class Child11 extends Parent11 {
	private int x = 4;
	protected int y = 5;
	public int z = 6;

	public void subMethod() {
		System.out.println("subMethod");
	}
}
