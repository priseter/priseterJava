package java04_control.condition;

public class If_02 {

	public static void main(String[] args) {

		int num = 10;
		
		if(num == 15) {
			System.out.println("HI");
		
		} System.out.println("Hello");
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
			
			//{} 중괄호 블록은 여러 개의 코드를 묶어주는 역할을 한다.
			// 코드 실행 흐름(순서)에 영향을 주지않는다.
		}
		
		System.out.println("---------------------------------------------------------");
		
		//제어문은 해당 제어문의 다음에 오는 코드 한개 또는 {}중괄호 블록 하나에 영향을 준다.
		
		if(false) 
			System.out.println("코드 111111111111111");// 실행되지 않는다.
		
		
		
			System.out.println("코드 222222222222222");//실행된다.
		
		System.out.println("-------------------------------------------");
		
		//제어문에 영향 받는 코드가 한줄 이어도 반드지 {} 중괄호를 쓰도록 한다.
		
		if(false) { // 중괄호 전체가 실행되지 않는다.
			System.out.println("코드 111111111111111");	
			System.out.println("코드 222222222222222");
		}
		System.out.println("코드 222222222222222");
		
		System.out.println("-------------------------------------------");
		
		//제어문의 ()괄호 다음에 ;를 붙이지 않도록 조심하자
		//-> 실수로 많이 작성한다.
		
		if(false); {
			System.out.println("HI");	
			System.out.println("Hello");
			System.out.println("Hola");
		}
		
		
		
	}

}
