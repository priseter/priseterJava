package java01_variables;

// 선택 영역 한 줄 주석 토글 : ctrl + shift + c

/* 문장 주석 */

public class Variables_01 {
	
	public static void main(String[] args) {
	
//		System.out.println("동작 테스트");
		
//		-----------------------------------------------------------------------------------------------------
		
		// 커서 + shift + 방향키 영역설정
//		shift + ctrl + 방향키 단어단위 영역설정
//		shift + End or Home
		
		
		System.out.println( 12345 );			// int형 타입 (정수형)
		System.out.println( 123.456 );			// double형 타입(실수형)
		System.out.println( true );				// boolean형 타입(논리형)
		System.out.println( 'i' );				// char형 타입(문자형)
		System.out.println( "Hello" );			// String형 타입(문자열 타입)
		System.out.println( "123.145" );	    
		
		//---------------------------------------------------------------------------------------------------
		// sysout + ctrl + space = System.out.println();
		// syso 만치고 ctrl + space 도 가능
		
		char quote = 34;

		System.out.println( '가' );
		System.out.println((int)'가' );			// char형 -> int형 변환하여 출력 : 44032
		System.out.println(99);
		System.out.println( (char)99 ); // int형 -> char형 변환하여 출력 : c
		
		
		System.out.println( quote );
		System.out.println( "" + (char)99 );
		System.out.println( "" + quote + (char)99 + quote );
		
		System.out.print((char)34);
		System.out.print((char)99);
		System.out.println((char)34);
		
//		System.out.printf(%c,(char)34 );
//		System.out.printf(%c, quote);
//		System.out.printf(%c, "");
		
		
	}
	

}
