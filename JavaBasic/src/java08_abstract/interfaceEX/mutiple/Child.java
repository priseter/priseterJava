package java08_abstract.interfaceEX.mutiple;

//extends 는 하나만 가능한 이유가 다중상속이 불가능하기 때문이다.
public class Child extends Parent implements Inter_01, Inter_02{

	// 헤드가 3개여도 결국 오버라이딩으로 구현되는 것은 하나이기 때문에 인터페이스와 상위 클래스에 같은 메소드가 있어도 괜찮다.
	
	@Override
	public void out(){
		System.out.println("자식 클래스");
	}
}
