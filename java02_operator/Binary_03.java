package java02_operator;

public class Binary_03 {
	public static void main (String[] args){
		
		
		//이항연산자 - 관계, 비교
		
		//  <			less than			lt			작다
		//  >			greater than		gt			크다

		// <=			less than equal		le			작거나 같다
		// >=			greater than equal	ge			크거나 같다

		// ==			equal				eq			같다
		// !=			not equal			ne			같지 않다
		
		// 왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교한다.
		// 비교 결과를 참/거짓으로 반환한다.
			//--> boolean타입으로 리턴
			//--> true/false
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 == num2 : " + (num1 != num2));
		
		System.out.println("num1 == num2 : " + (num1 < num2));
		System.out.println("num1 == num2 : " + (num1 > num2));
		
		System.out.println("num1 == num2 : " + (num1 <= num2));
		System.out.println("num1 == num2 : " + (num1 >= num2));
		
		//--------------------------------------------------------------------------------------
		
		boolean result = num1==num2;
		System.out.println("결과 : "+ result);
		
	}

}
