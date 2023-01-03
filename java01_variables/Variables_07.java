package java01_variables;

public class Variables_07 {

	public static void main(String[] args) {
		
		//자바의 자료형 종류
		
		//  8가지 기본 데이터타입( Primitive Type )
		// --> 저장된 데이터를 표현
		
		// 참조형 데이터타입 ( Reference Type )
		// --> 데이터가 저장된 위치
		
		//-------------------------------------------------------------------------------------------
		
		//String 타입
		// 문자열 - 문자(char)들의 나열
		
		// "" 큰따옴표를 이용하여 여러 문자를 감싸서 표현한다.
		//  -> String형 리터럴 상수
		
		int num; // 기본데이터타입 int 변수 선언
		String str; // 참조형 데이터타입 String 변수 선언
		
		//-------------------------------------------------------------------------------------------
		
		String fruit; //과일 이름
		
		//String은 기본 데이터 타입이 아니지만, 참조형이면서도 기본과 사용법은 같다.
		
		fruit = "Apple"; 
		
		fruit = "Banana";
		
		fruit = "Cherry";
		
		System.out.println(fruit);
		System.out.println("맛있는 과일 : " + fruit );
		
		// class를 만드는것도 참조형 데이터타입을 만드는 것과 같다.
		
		//-------------------------------------------------------------------------------------------
		
		
	}

}
