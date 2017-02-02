package grammer2.no04;
/*
	Player클래스를 다음과 같이 정의하면 얻을 수 있는 이점은???
	메인메서드에 이점을 이용한 코드를 만들어보세요~
*/
public class Grammer204_inyong {
	//클래스변수
	private static int nextId = 1;
	//인스턴스(객체)변수
	private int id;

	public Grammer204_inyong() {
		//id변수에 nextId값을 대입하고 nextId값을 +1시킴
		//따라서 객체가 생성될때마다 1씩증가한 값을 인스턴스변수에 받게된다.
		id = nextId++;
	}

	protected int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args){
		//이점은 객체가 생성될때마다 생성자 메서드가 실행되어
		//static 변수를 이용해 각각의 객체의 id값을 auto increment 시켜주는듯한 효과를 낸다.
		Grammer204_inyong g1 = new Grammer204_inyong();
		Grammer204_inyong g2 = new Grammer204_inyong();
		Grammer204_inyong g3 = new Grammer204_inyong();

		System.out.println(g1.id);
		System.out.println(g2.id);
		System.out.println(g3.id);
		
		g1.setId(100);
		System.out.println(g1.id);
	}
}
