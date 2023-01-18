package java08_abstract;

//부모클래스
// -> 객체를 생성할 수 없는 클래스
// -> 인스턴스화 할 수 없다.

public abstract class Person {
	
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	//추상 메소드 - 실행할 수 없는 메소드;
	public abstract void display();

}
