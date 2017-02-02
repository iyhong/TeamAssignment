package grammer2.no04;

/*
	Grammer204클래스를 다음과 같이 정의하면 얻을 수 있는 이점은???
	메인메서드에 이점을 이용한 코드를 만들어보세요~
	
	grammer204 클래스에 id 변수가 nextId =1 통해서 증가하여 id에 대입된다고 생각한다.
	검색을 통해서 알아본 결과는 setId() private로 제한되어 있고 id값을 변경을 할수가 없다.
	getId()는 protected로 제한이 되어 상속이외에는 id값을 확인할 방법이 없다.
	
*/
public class Grammer204_myungchul {
	private static int nextId = 1;
	private int id;

	public Grammer204_myungchul() {
		id = nextId++;
	}

	protected int getId() {
		return id;
	}

	private void setId(int id) {
		
		this.id = id;
	}
	
	
	public static void main(String[] args){
		Grammer204_myungchul gm=new Grammer204_myungchul();
		//각각에 set값에서 get으로 출력하고 nextId를 출력한 결과가
		// 1 , 2 , 10 으로 나왔다.
		//외부에서 데이터를 대입하는게 아닌 main메소드에 있는 생성된 객체을 통해서
		//대입을 간섭을 할수 있다는것을 알수 있다고 생각한다.
		System.out.println(gm.getId());
		System.out.println(nextId);
		gm.setId(10);
		System.out.println(gm.getId());
		
	}
}
