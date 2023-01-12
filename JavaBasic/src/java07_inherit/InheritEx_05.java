package java07_inherit;
class Parent5 {
	public void display() {
		System.out.println("부모 클래스");
	}
	
}//final 클래스는 자식 클래스를 만들지 못한다.
//final 아래 GC가 오류
class Child5 extends Parent5 {
	@Override
	public void display() {
		System.out.println("자식 클래스에서 오버라이딩");
	}
}

class GrandChild extends Child5{
	@Override
	public final void display() {
		// final 메소드는 더 이상 오버라이딩 되지 않는다.
		System.out.println("2번 재정의된 메소드");
		//사실상 하나 위에껄 오버라이딩 했다고 생각해라.
	}
}

public class InheritEx_05 {
	public static void main(String[] args) {
		new GrandChild().display();
	}


}
