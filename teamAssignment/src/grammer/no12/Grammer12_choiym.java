package grammer.no12;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//그 이유는?

public class Grammer12_choiym{
	int x;
	int y;

	Grammer12_choiym(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 클래스 생성자로서 클래스 생성시 매개변수로 x와 y를 받고 매개변수로 받은 x와 y를 필드변수 x,y에 대입해준다.
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	// toString 메소드로 x= x, y= y를 콘솔에 출력한다.

	public Grammer12_choiym copy() {
		Object obj = null;
		//Object클래스타입의 obj객체참조변수를 선언하고 null로 초기화해준다.
		try {
			obj = clone();
			// 그러나 clone메소드는 원형인 Object클래스에서 protected로 선언되어있어 clone()를 사용할수 없다.
			// 또한 clone()를 사용하기 위해서는 cloneable 인터페이스를 구현해야 사용할 수 있다.
			//때문에 예외가 발생한다.
		} catch (CloneNotSupportedException e) {
		}
		
		return (Grammer12_choiym) obj;
		// obj를 Grammer12_choiym클래스타입으로 형변환 해줌 그러나 얘는 null
		
	}
	

	public static void main(String[] args) {
		Grammer12_choiym original = new Grammer12_choiym(3, 5);
		//필드변수에 x=3, y=5가 대입되있는 Grammer12_choiym클래스타입의 객체참조변수 original을 선언
		Grammer12_choiym copy = original.copy();
		//original 객체참조변수를 copy하고싶지만 clone()가 사용안되므로 null
		System.out.println(original);
	
		System.out.println(original.toString());
		System.out.println(copy);
		//null이 찍힌다.
	}
}
