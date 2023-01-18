package java08_abstract.interfaceEX;

interface InterA{
	public abstract void getA();
}

interface InterB{
	public abstract void getB();
}

// 클래스에 대한 extends는 하나만 되지만 인터페이스는 아니다.
// -> 다중 상속 가능;
interface InterC extends InterA,InterB{
	public abstract void getC();
}

class Children implements InterA,InterB,InterC {
	@Override
	public void getA() {
	}
	@Override
	public void getB() {		
	}
	@Override
	public void getC() {		
	}
	
}
//** 클래스가 클래스를 상속받을 때 extends를 쓴다.
//** 인터페이스가인터페이스를 상속받을 때 extends를 쓴다.
//** 클래스가 인터페이스를 상속받을 때 implements를 쓴다.

//interface T1 extends InterfaceEx_03() {}



























public class InterfaceEx_03 {

}
