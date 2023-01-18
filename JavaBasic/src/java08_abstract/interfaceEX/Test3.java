package java08_abstract.interfaceEX;

// extend와 implements가 함께 쓸때는 extend부터 먼저온다.

public class Test3 extends TestClass implements TestInterface {
	
	// ------TestInterface에서 상속-----------------------

	@Override
	public void out() {
		
	}

	@Override
	public void display() {
		
	}
	
	//-------TestClass에서 상속----------------------------`

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

}
