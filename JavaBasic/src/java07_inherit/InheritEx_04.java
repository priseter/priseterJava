package java07_inherit;

import java.util.Scanner;

class Parent4{
	protected int num = 0;
//	static Scanner sc = new Scanner(System.in);
	public Parent4() {
//		this(66666666);
//		this(sc.nextInt());
		System.out.println("부모 디폴트 생성자");
//		this(); //this 생성자 호출 코드
//		System.out.println(sc.next());
		
	}
	public Parent4(int num) {
		this();
		System.out.println("부모 매개변수 있는 생성자");
		
		this.num = num;
	}
	
}

class Child4 extends Parent4{
	public Child4() {
//		super(); // 부모생성자를 호출하는코드, 평소엔 생략되어 있음
		System.out.println("자식 디폴트생성자");
	}
	public Child4(int num) {
		super ( num );
		System.out.println("자식 매개변수 있는 생성자");
//		super.num = num;
		this.num = num; //에러안나, Child4의 필드에없어서 super 영역을 찾는다.
	}
	
}

public class InheritEx_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parent4 p1 = new Parent4();
		Parent4 p2 = new Parent4(111);
		System.out.println("-------------------------------------------------------------------------------");
		
		Child4 c1 = new Child4();
		System.out.println("-------------------------------------------------------------------------------");
		Child4 c2 = new Child4(222);
		System.out.println(c2.num);
//		System.out.println(c2.);
		
	}

}
