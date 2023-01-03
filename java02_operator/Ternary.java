package java02_operator;

public class Ternary {

	public static void main(String[] args) {

		// 삼항 연산자 - 조건
		// 삼항조건 연산자
		// 조건 연산자
		
		//		조건식 ? true일때 반환할 값 : false일때 반환할 값
		//		** 조건식 - true/false로 판별할 수 있는 연산식
		
		int num1 = 30, num2 = 20;
		
		System.out.println( num1<num2 ? "num1이 작다." : "num1이 작지 않다.");
		System.out.println( num1<num2 ? "num1이 작다." : "num1이 크거나 같다.");
		
		System.out.println("----------------------------------------------------------------");
		
		String resultText = num1>num2 ? "num1이 크다" :"num1이 크지 않다.";
		
		System.out.println("----------------------------------------------------------------");
		
		// 두 숫자 중에서 큰 값을 저장하기
		int result = num1 > num2 ? num1 : num2;
		

		
		
		
		
		
	}

}
