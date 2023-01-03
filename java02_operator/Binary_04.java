package java02_operator;

public class Binary_04 {
	
	public static void main(String[] args) {
		
		//이항 연산자 - 논리
		
		// And 연산자 : && 양쪽이 모두 true일 때만 결과값이 true이다.
		// Or  연산자 : || 양쪽 중 하나라도 true 일 경우에 true이다.
		// not 연산자 : ! 결과값이 true인 경우 false로 false인 경우엔 true가 된다.
		
		// 		&&		||			! 
		//		AND		OR			Not
		
		// !(NOT) 연산자는 단항 연산자
		// 논리(boolean) 데이터의 관계를 따져서 결과를 반환한다.
		
		//----------------------------------------------------------------------------------------------
		System.out.println("---------------------------------------------------------------------");
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true && false : "+ ( b1 && b2 ));
		System.out.println("true && false : "+ ( b1 || b2 ));
		
		//----------------------------------------------------------------------------------------------
		
		
		int num = 77;
		
		System.out.println(num>=1); //(num >= 1)
		System.out.println(num<=100); //(num <= 100)
		
		System.out.println((num>=1) && (num<=100));
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println(!((num>=1) && (num<=100)));
		// System.out.println(!(num>=1) !&& !(num<=100)); ! 부정 연산자의 배분
	    // System.out.println((num < 1) || (num > 100)); 부정 연산자에 배분에 의해서 연산자가 반대로 변함
		
		// ** !(논리부정) 연산자를 적용
		// 관계연산자는 반대 조건으로 치환된다.	>=는 < 같이.
		// 논리연산자는 &&는 ||로 ||는 &&로 치환된다.
		
		int num1 = 88;
		int num2 = 110;
		
		System.out.println(!((num1-num2 < 100) || (num1+num2) <190));
		
		// bit operator
		// 비트 연산자 이진수의 0일경우에는 false 1일 경우엔 true인 연산자
		// bit shift oparator (shift)
		// <<, >>, >>>
		// 7 		0000 0000 0000 0111
		// 7<<1		0000 0000 0000 1110
		// x<<y = 정수 x의 각 비트를 y만큼 왼쪽으로 이동시킵니다. (생기는 부위는 0으로)
		// x>>y = 정수 x의 각 비트를 y만큼 오른쪽으로 이동시킵니다. (맨앞쪽 숫자를 따라감)
		// x>>>y = 정수 x의 각 비트를 y만큼 오른쪽으로 이동시킵니다. (앞자리 0으로)
	}
	

}
