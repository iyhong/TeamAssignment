package grammer2.no04;
/*
	Player클래스를 다음과 같이 정의하면 얻을 수 있는 이점은???
	메인메서드에 이점을 이용한 코드를 만들어보세요~
*/
public class Grammer204 {
	private static int nextId = 1;
	private int id;

	public Grammer204() {
		id = nextId++;
	}

	protected int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args){
		
	}
}
