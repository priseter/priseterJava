package java03_scanner;

import java.util.Scanner;

public class Scanner_02 {
	public static void main(String [] args) {
		
		//문자열(String) 입력 받기
		
		// 1. 입력객체 변수 선언 - java.util.Scanner
		
		// 2. 입력객체 생성, 입력 기능 활성화 - new
		
		// 문자열(String) 입력 받기 - nextLine() 메소드
		
		// 입력 받은 문자열 출력하기
		
		Scanner in;
		
		in = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		
		String str = in.nextLine();
		
		System.out.println("입력된 값 :" + str );
		
	    in.close();
		
	}

}
