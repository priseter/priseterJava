package java07_inherit;

class Parent{
	String name;
	int num;
	
	public void display() {
		System.out.println("부모 클래스 메소드");
		System.out.println(name + " " + num );
	}
}

class Child extends Parent{ // class [자식 클래스 이름] extends [부모 클래스 이름]
	int score;
	
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}
//	@Override // @ annotation 오버라이딩 어노테이션 -> 오버라이딩 조건에 맞는 지 검사한다.
//	public void display() {
//		// 부모 클래스의 display() 메소드를 상속 받아 재정의한 메소드
//		//	-> 오버라이딩, Overriding / 덮어씌우기 오버로드와는 다르다!
//		System.out.println("오버라이딩 메소드");
//	}
//	@Override
//	public void display() {
//		super.display();
//		//super는 부모 메소드의 display를 가져온다라는 뜻이다.
//	}
	
	public void display(int a) {
		System.out.println("오버라이딩한 메소드를 오버로딩한 메소드");
	}
}

public class InheritEx_01 {
	public static void main(String[] args) {
		
	
	Parent p = new Parent();
	p.name = "Ken";
	p.num = 123;
	p.display();
	
	Child c = new Child();
	c.name = "Viktor";// 상속 필드
	c.num = 456; // 상속 필드
	c.display(); // 재정의
	c.print(); // 자식의 메소드
	c.score = 99; // 자식의 필드
	c.display(); // 재정의
	}

}
