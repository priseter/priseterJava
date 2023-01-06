package java05_array;

public class Array_05 {
	public static void main(String[] args) {
		
		//문자열
		String str = "Apple";
		//String배열 타입 변수 선언
		String[] strArr;
		
		//String 배열 공간 생성
		strArr = new String[3];
//		strArr[0] = "Apple";
//		strArr[1] = "Banana";
//		strArr[2] = "Cherry";
		for(int i =0; i<strArr.length; i++) {
			System.out.println( strArr[i] );
//			System.out.println( strArr[i].length());
//			
			//strArr        -> String[] 타입
			//strArr [i]    -> String 타입
			
			//strArr.lenhth -> 배열의 길이
			//strArr [i].length    -> 문자열의 길이를 반환하는 메소드 사용
			
//			// ** strArr[i].length -> int타입 리턴, 반환
			}
//		System.out.println(strArr.length);
		
		String[] strArr1 = new String[5];
		
		
		String[] strArr2 = {"Apple"};
	}

}
