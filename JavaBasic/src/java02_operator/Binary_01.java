package java02_operator;

public class Binary_01 {
	public static void main(String[] arg) {
		// 이항 연산자 - 산술
		// + - * / %
		
//		------------------------------------------------------------------------------------------------------
		
		int num1 = 16, num2 = 7; //피연산자
		int result; // 연산의 결과값을 저장하는 변수
		
		
		result = num1 + num2;
		
//		result = 16 + 7; // 변수의 값 불러오기(변수의 값을 활용한다)
//		reult = 23;      // 덧셈 연산
//		 -> result 변수에 23을 대입한다(저장한다)

		
		System.out.println("덧셈 결과 : "+ result);
		System.out.println("--------------------------------------------------------------------------------------");
		
		//%
		// 나머지 연산자
		// modular operator
		// mod 연산자
		num2 = 6;
		result = num1 % num2;
		
		System.out.println(num1 + " 값을 " + num2 +"(으)로 나눈 나머지"+ result);
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("num1 + num2 = " + num1 + num2); // 옳지 않음
//		System.out.println("num1 + num2 = " + 16 + 6); 			//변수값 활용
//		System.out.println("num1 + num2 = 16"+ num2); 	//문자열 연결 연산
//		System.out.println("num1 + num2 = 166"); 		//문자열 연결 연산
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 + num2 = " + (num1 - num2));
		System.out.println("num1 + num2 = " + (num1 * num2));
		System.out.println("num1 + num2 = " + (num1 / num2)); //몪
		System.out.println("num1 + num2 = " + (num1 % num2)); //나머지
		
		//산술 연산은 반드시 피연산자들의 데이터타입이 같아야만 가능하다.
		
		System.out.println("--------------------------------------------------------------------------------------");
				
		System.out.println("16 / 6 = " + (16/6)); // int/int -> int)
		System.out.println("16.0 / 6.0" + (16.0/6.0));  // double/double -> double
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		
		System.out.println((double)num1 / (double)num2); // 피연산자들의 데이터타입을 바꾸는 형변환을 실행했다.
		// 실행하는 방법은 변수 앞에 ()를 붙이고 원하는 자료형으로 변경한다. 
//		System.out.println((double)16 / (double)6); // 변수값 활용
//		System.out.println(16.0 / 6.0); // double형으로 데이터타입 변환
//		System.out.println(2.666666666666666666666666665); // double형 타입들의 나눗셈 연산
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println(11 + 34.56); // 11의 double로 자동 형변환
		System.out.println(11 + (int)34.56); // 34.56의 int로 강제 형변함	
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println(num1 / (double)num2); //    int/ (double)int
//		System.out.println(16 / (double)6); // 변수 활용//	   int/ (double) int
//		System.out.println(16 / 6.0); // 강제 형변환   //      int/double
//		System.out.println(16.0 / 6.0); // 자동 형변환   //      double/double  
		
		System.out.println("------------------------잘못 사용하는 경우---------------------------");
		
//		System.out.println((double)(num1/num2));
//		System.out.println((double)(16/6));
//		System.out.println((double)(2));
		System.out.println("--------------------------------------------------------------------------------------");
		
		double dNum = 3.14;
		
		System.out.println("dNum / 2 = " + (dNum/2));
		System.out.println("dNum % 2 = " + (dNum%2));
		
		// 실수 계산에는 부동소수점 오차가 발생 할 수도 있다.
		// 0.000000000000000000000000001
		
		
	}
	
}	
