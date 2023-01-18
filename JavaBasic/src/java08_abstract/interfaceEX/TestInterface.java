package java08_abstract.interfaceEX;

public interface TestInterface {
	
	//인터페이스
	// 상수 멤버 필드
	// 추상 멤버 메소드
	
	//----------------------------------------------------------------------------------------------
	
	// 상수 멤버 필드
	// 인터페이스 안에서는 무조건 이것만 인정
	// -> public static final 키워드가 붙은 필드만 선언 가능
	
	public static final int NUM1 = 123;
	
	// public static final 키워드를 생략해도 모든 키워드를 자동으로 붙여 선언한다.
	int NUM2 = 345;
	public int NUM3 = 456;
	static int NUM4 = 456;
	final int NUM5 = 456;
	
	// 인터페이스에서 필드를 선언할 때 public static final 키워드를
	// 모두 붙여서 작성하는 편이 좋다.
	
	
	//------------------------------------------------------------------------------------------------
	// 추상 멤버 메소드
	
	//에러
	//인터페이스는 일반 메소드를 멤버로 가질 수 없다.
//	public void method() {
//		
//	}
	
	// 추상 메소드들
	// abstract 없어도 추상 메소드로 취급한다.
	public void out();
	
	public abstract void display();
	
	//** 인터페이스에 추상메소드를 작성할 때 abstract를 같이 적어주는 것이 좋다.
}
