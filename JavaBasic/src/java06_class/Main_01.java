package java06_class;

import java.awt.DisplayMode;

//실행 클래스
//  메인 메소드를 정의하고 있는 클래스
//  프로그램을 실행 할 수 있는 클래스


public class Main_01 {
	public static void main(String[] args) {
		int num;
		
		//------------------------------------------------------------------------------------
//		Class_01 c02;
		Class_01 c01; 	// 객체 변수 선언
		//class형 참조형 변수
		// 아직 쓰레기 값을 가지고 있음
		// Class_01 타입의 변수인 c01을 선언함
		
		// Class_01 타입의 인스턴스를 생성하고 (new 연산자) [Class_01을 사용할 공간을 만들고]
		// 인스턴스에 참조값을 c01변수에 대입 [c01]에 참조값을 대입
		c01 = new Class_01(); // 객채 생성, 인스턴스화
//		c02 = new Class_01();
		
		System.out.println(c01); //java06_class.Class_01@4d591d15
//		System.out.println(c02); //java06_class.Class_01@4aa8f0b4
		// new는 사용하기 위한 새로운 공간을 배당하는 것이기 때문에 다른 참조위치를 나타내게 된다.
		
		// 멤버 필드에 대입하기
		System.out.println(c01.num);
		c01.num = 123;
		c01.data = "Apple";
		
		//c01객체의 멤버필드 num,data 저장된 값 출력하기
		System.out.println(c01.num);
		System.out.println(c01.num);
//		System.out.println(c02.num);
		System.out.println("--------------------------------------------------------------------");
		
		//객체 변수 c01를 이용하여 클래스의 멤버 메소드를 호출 사용한다.
		c01.display();
		// 객체 변수를 출력하면 참조값(레퍼런스, Reference이 호출된다.)
		System.out.println( c01 );
		System.out.println("--------------------------------------------------------------------");
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		
		c02.num = 200;
		c03.num = 300;
		c04.num = 400;
//		
//		System.out.println(c02.num);
//		System.out.println(c03.num);
//		System.out.println(c04.num);
		
//		Class_01 c05 = null;
//		c05.num = 500;
		
		//NullPointerException
		// -> null 참조하고 있는 객체변수를 이용하여 참조 연산자를 사용하면 발생한다.
		
		
		
		
	}

}
