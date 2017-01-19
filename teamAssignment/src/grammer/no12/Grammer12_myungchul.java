package grammer.no12;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//그 이유는?

public class Grammer12_myungchul{
	int x;
	int y;
	//Grammer12_myungchul메서드 안에 this.x / this.y가 있고 toString()이동하여
	//문자열로 간다.
	Grammer12_myungchul(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {//this.x,this.y를 가져와 메서드 개체 인스턴스를 문자열을 반환한다.
		return "x=" + x + ", y=" + y;
	}

	public Grammer12_myungchul copy() {//copy()
		Object obj=null;//obj변수에 null로 선언한다.
		try {
			obj = clone();	//clone() 메소드를 호출하여 완전한 객체 구조를 복사하다.

		} catch (CloneNotSupportedException e) {
			
		}
		return (Grammer12_myungchul) obj;
	}

	public static void main(String[] args) {
		Grammer12_myungchul original = new Grammer12_myungchul(3, 5);
		//Grammer12_myungchul메소드를 거쳐 toString()로 와서 객체의 값을 문자열로 저장하여
		//return하여 시스템 출력문에 결과값이 나온다.
		Grammer12_myungchul copy = original.copy();
		//original객체에 담겨 있는 값과 주소값이 copy()메소드로 이동하게 되고
		//clone()메소드를 통해서 obj에 값이 original 객체의 값이 3,5값과 주소값들을 복사를 한다.
		//그러나 copy 통해서 시스템 출력문이 나온 결과값은 null로 나왔다.
		//clone() 방식중에 깊은 복사(deep copy)/ 얕은 복사(shallow copy)있는데
		//여기서는 얕은 복사 방식을 사용한듯 하다.
		//얕은 복사는 표면에 있는 주소값만 복사를 해서 내용물을 복사를 하지 못해서
		//null로 나온것이다.
		//깊은 복사(deep copy)은 주소값과 내용물까지 복사를 한다.
		
		System.out.println(original);
		System.out.println(copy);
		
	}
}
