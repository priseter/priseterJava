package java06_class.variable;

public class ClassVariable_03 {
	//---------멤버필드-----------------
	private int num1 = 777; //인스턴스 변수          
	private static int num2 = 888; // 클래스 변수
	
	//---------일반 멤버 메소드-----------
	public void method() {
		System.out.println("-------------------------------------------------");
		System.out.println( num1 ); //인스턴스 변수
		System.out.println( num2 ); //클래스 변수
		
		//------------------------------------------------------------------------------------------------------------------------
		int num1 = 101;//지역 변수
		int num2 = 202;//지역 변수
//		
//		
		System.out.println("-------------------------------------------------");
		System.out.println( num1 ); //지역 변수
		System.out.println( num2 ); //지역 변수
		
		//** this : 자기 객체참조 ( 인스턴스 자신이 자신을 지칭할때 사용한다.)
		
		System.out.println( this.num1 );//일반 멤버필드
//		System.out.println( this.num2 );
		System.out.println(ClassVariable_03.num2); // 정적 멤버필드
	}
	public void method(int i) {
		
		this.num1 = i;
		this.num2 = i;
		System.out.println("-------------------------------------------------");
		System.out.println( this.num1 );
		System.out.println( this.num2 );
	}
	
	public void man () {
		System.out.println(num1);
	}

}
