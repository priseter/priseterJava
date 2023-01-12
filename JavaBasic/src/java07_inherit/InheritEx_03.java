package java07_inherit;
class Parent3{
//	private int num = 111;
	protected int num = 111;
//	int num = 111;
	
	public Parent3() {
		System.out.println("부모의 디폴트 생성자");
		
		System.out.println( num );
	}
	
}
class Child3 extends Parent3{
	private int num = 333;
	public Child3() {
		super();
		System.out.println("자식 디폴트 생성자");

		System.out.println( this.num );
		System.out.println( super.num );
	}
	public void display(){
		System.out.println("저 태어났어요");
	}
	
}

public class InheritEx_03 {

	public static void main(String[] args) {
		Parent3 p = new Parent3();
		System.out.println("--------------------------------------------------------------");
		Child3 c = new Child3();
		System.out.println("--------------------------------------------------------------");
		Parent3 pc = new Child3();
		
		c.display();

		
	}

}
