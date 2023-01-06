package java05_array;

public class Array_04 {

	public static void main(String[] args) {

		//문자열, String
		//   내부 데이터 처리로 char[]를 이용하여 구현되어 있다.
		
		// char[]와 String은 같은 데이터타입은 아니다.
		
		//---------------------------------------------------------------------------------------------
		
		String str = "AppleBanana";// 문자열
		char[] chArr = {'A','p','p','l','e',}; // 문자배열, 캐릭터 배열
		
		System.out.println(str.length()); // 메소드는 둥근괄호가 반드시 있어야한다.
		System.out.println(chArr.length); // 변수를 불러와서 둥근괄호가 불필요하다.
		
		//ex) out은 참조형 변수, println은 메소드.
		// 제어문도 ()가 붙는다.
		
		System.out.println("문자열의 세번째 글자 : " + str.charAt(2));
		System.out.println("char[]의 네번째 글자 : " + chArr[3] );
		
		
	}

}
