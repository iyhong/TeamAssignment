package grammer.no12;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//그 이유는?

public class Grammer12_YJ{
	int x;
	int y;

	Grammer12_YJ(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public Grammer12_YJ copy() {
		Object obj = null;
		//obj null값으로 초기화
		try {
			obj = clone(); 
			//obj에 clone()메소드를 담고
		} catch (CloneNotSupportedException e) {
		}										
		return (Grammer12_YJ) obj;
			//clone를 가진 obj가 Grammer12_YJ를 복사해서
			//original에 담는다
			
	}
	//clone는 복사를 해준다 clone()를 사용하려면 Object클래스에 정의 되어있는
	//clone()메서드는 protected이기때문에 clone() 메서드를 public으로 재정의 해서 사용해야 한다.
	public static void main(String[] args) {
		Grammer12_YJ original = new Grammer12_YJ(3, 5);
		Grammer12_YJ copy = original.copy();
					//copy메소드 실행
		System.out.println(original);
		//이 출력문을 실행하게되면 x=3, y=5가 담겨있게된다.
		System.out.println(copy);
		//clone메소드가 실행 되었다면 x=3, y=5 가 출력되지만
		//clone메소드가 실행되지않고 catch문에서 CloneNotSupportedException예외가 발생하기때문에
		//null이 출력된다....
		//.......
	}
}
