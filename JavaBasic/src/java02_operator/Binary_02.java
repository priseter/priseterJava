package java02_operator;

public class Binary_02 {

	public static void main(String[] args) {

		//이항연산자 - 대입(Assign)
		// =
		
		// 오른쪽에 있는 값을 왼쪽에 있는 공간에 저장한다.
		// 연산 방향이 오른쪽에서 왼쪽으로 진행된다.
		
		// 연산자 우선순위가 거의 최하위에 있다.
		
		int num1 = 10;
		int num2 = 20;
		
		num1 = 11;
		num2 = 22; 
		
		//-------------------------------------------------------------------------------------------------
		
		// num1 변수의 값 11을 활용하여 num3 변수 공간에 대입(저장)한다.

	    int num3 = num1;	
		
		int num4, num5, num6;
		
		num6 = num5 = num4 = num3;
//		num6 = num5 = num4 = 11;
//		num6 = num5 = 11;
//		num6 = 11;
//		11;
		// 디버깅을 자주 사용하도록하자!
		
//------------------------------------------------------------------------------------------------------------		
		
		// 복합 대입 연산자 -산술대입
		// += -=  *= /= %=
		
		num1 = 13;
		num2 = 14;
		
		System.out.println("--- 산술 대입 연산 전 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 산술 대입 연산(덧셈)
		num2 += num1; //== num2 + num1;
		
		System.out.println("\n--- 산술 대입 연산 전 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 -= num1; //== num2 - num1;
		
		System.out.println("\n--- 산술 대입 연산 전 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	
		num2 *= num1; //== num2 * num1;
		
		System.out.println("\n--- 산술 대입 연산 전 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 /= num1; //== num2 / num1;
	
		System.out.println("\n--- 산술 대입 연산 전 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		//복합 대입 연산자의 대입연산기호(=)는 항상 오른쪽에 적는다.
		
		num2 -= 7;  // -= 산술 복합 대입연산자 (이항연산자)
		num2 =- 7;  // - 부호 변환 연산자 (단항연산자)
	}

}
