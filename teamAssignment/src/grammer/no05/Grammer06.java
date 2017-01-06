package grammer.no05;

public class Grammer06 {
	public static void main(String[] args) {
		Template t = new Test();
		t.play();
	}
}

abstract class Template {
	void play() {
		first();
		second();
		third();
	}

	abstract void first();

	abstract void second();

	final void third() {
		System.out.println("third");
	}
}

class Test extends Template {
	@Override
	void first() {
		System.out.println("first");
	}

	@Override
	void second() {
		System.out.println("second");
	}

}
