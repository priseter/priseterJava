package java07_inherit;

class Parent2 {
	// private 접근 제한자는 상속 관계여도 접근 할 수 없다. 
//private int num;
	//-----------------------------------------------------------------------------------------------------------
	
	public int num = 0;
	
	public void display() {
		System.out.println("부모 클래스");
	}
//	public void display() {
//	System.out.println("부모 클래스");
//}
	
}
class Child2 extends Parent2 {
	
	
	
//	public void method() { 
		//에러,private 부모 멤버에 접근할 수 없다.
//		num = 123;
	//-----------------------------------------------------------------------------------------------------------	
//	}
	
	public int num = 1; // 상속받은 필드와 같은 이름 -> 적절하지 않은 변수이름
	public String name; // 자식의 고유한 멤버필드
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
//	@Override
//		public void display() {
//			System.out.println("오버라이딩 메소드");
//			
//			int num; // 지역 변수 선언
//			num = 111;
//			this.num = 222; // 멤버 필드 num (자식 클래스)
//			super.num = 333; // 멤버 필드 num (부모 클래스)
//		
//		}
	
}

public class InheritEx_02 {

	public static void main(String[] args) {
		
		Child2 c = new Child2();
		
		c.num = 12345;
		
		c.display();
		//--------------------------------------------------------------------------
		Parent2 p = new Parent2();
		p.num =45678;
		p.display();
		
		System.out.println("-------------------------------------------");
		
		Parent2 pc =/*(Parent2)*/ new Child2();
		// 원래 클래스 타입을 new할때 다른 타입으로 참조형 변수를 만들순 없다.
		// 다만 자식 타입이 부모타입으로 변수 선언할때만 가능하다.
		/**/ // 내부의 것이 실제로 존재하는 것 처럼 실행이 된다.
		
		
		// 에러, ClassCastException
		// 클래스 타입은 형변환이 불가능하다. (예외 몇개 있음)
//		Child2 cp = (Child2) new Parent2();
		
		System.out.println("-------------------------------------------");
		
		
		System.out.println(pc.num);
		
		pc.num = 55; // pc변수의 데이터타입 Parent2에 선언된 부모멤버 필드 num
		//에러 부모 타입으로 선언된 변수는 자식의 멤버에게 접근이 불가능하다.
		// 부모가 상속해준 곳 까지만 가지고 있다.
		((Child2)pc).num = 77;
//		pc.name = "kim";
		((Child2)pc).name = "kim";
		((Child2)pc).name = "kim";

		
		System.out.println(c.name);
		System.out.println(((Child2)pc).name);
		System.out.println("-------------------------------------------");
		System.out.println(pc.num);
		System.out.println(((Child2)pc).num);
		System.out.println(p.num);
		System.out.println("-------------------------------------------");
		pc.display();
		c.display();
		// 
		
		
	}

}
