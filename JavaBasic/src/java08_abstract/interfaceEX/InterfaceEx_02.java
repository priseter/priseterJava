package java08_abstract.interfaceEX;

import java08_abstract.interfaceEX.mutiple.Child;
import java08_abstract.interfaceEX.mutiple.Parent;
import java08_abstract.interfaceEX.mutiple.Inter_01;
import java08_abstract.interfaceEX.mutiple.Inter_02;

public class InterfaceEx_02 {

	public static void main(String[] args) {

		Child c = new Child();
		c.out();
		System.out.println("------------------------------------------------------------");
		Parent pc = new Child();
		pc.out();
		System.out.println("------------------------------------------------------------");
		
		//** extends 한클래스는 부모 데이터타입이된다.
		//** implements한 인터페이스는 부모 데이터타입이 된다.
		
		Inter_01 i01;
		i01 = new Child();
		
		i01.out();
		
		Inter_02 i02 = new Child();
		i02.out();
	// ** 자바는 다중상속을 금지하고 있다.
	// extends 키워드로 하나의 클래스만상속받을수 있다.
		
		
	
	}
		

}


//class P1 {
//	public void display() {
//		System.out.println("P1");
//	}
//}
//
//class P2 {
//	public void display() {
//		System.out.println("P1");
//	}
//}
//
//// 에러, 다중상속
//class Children extends P1,P2{
//	@Override
//	public void display() {
//		// P1, P2 부모클래스 중에서 어떤메소드를 상속받아야 하나느가?
//		// -> 결정불가
//	}
//}
	