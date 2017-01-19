package grammer.no12;
//다음 프로그램 컴파일과 실행시 출력되는 결과는?
//그 이유는?

public class Grammer12_sangil implements Cloneable{
	int x;
	int y;

	Grammer12_sangil(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException { 
		//Object의 clone 메서드를 오버라이딩 하여서
		//protected로 되어있던 접근지정자를 public으로 재정의 해주었다.
		//그러면 clone 메서드를 호출할 수 있게 되고 clone 메서드를 통해 메모리를 복사할 수 있다.
		return super.clone();
	}


	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public Grammer12_sangil copy() {
		Object obj = null;
		
			try {
				obj = clone();//object의 clone 메서드는 기본적으로 메모리를 복사하는 메서드로서 protected로 되어 있기 때문에 cloneable 인터페이스를 구현하거나
							  //public으로 재정의 해주지 않으면 다른 클래스에서 사용할 수 없다.
			} catch (CloneNotSupportedException e) {  //위의 이유들 때문에 원래는 clone을 호출할 수 없는 상태이지만 
													  //예외를 던졌기 때문에 컴파일 오류는 나지않고 있다.
				
				e.printStackTrace();
			} 
						   
		
		
		return (Grammer12_sangil) obj;
	}

	public static void main(String[] args) {
		Grammer12_sangil original = new Grammer12_sangil(3, 5); //original 객체에는 3과 5라는 값이 x,y값으로 들어가 있다.
		Grammer12_sangil copy = original.copy(); //하지만 copy객체가 original을 clone할 수 없다. 
												 //이유는 위의 설명들처럼 copy 메서드가 clone을 지원할 수 없는 상태이기 때문이다.
												 //따라서 copy객체는 비어있는 상태로 null값이 나온다.
		
		System.out.println(original);
		System.out.println(copy);
	}
}