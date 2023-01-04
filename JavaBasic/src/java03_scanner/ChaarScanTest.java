package java03_scanner;

import java.util.Scanner;

public class ChaarScanTest {

	public static void main(String[] args) {

		//Scanner를 이용하여 char값 입력 받기
		
		// -> Scanner에는 char를 입력 받는 기능이 없다.
		
		// -> String타입은 char형을 모아 나열해놓은 타입
		// -> String으로 입력 받아 첫 글자를 char 타입으로 꺼내온다.
		
		
		//------------------------------------------------------------------------------------------------
		String str = "Apple Banana";
		
		//String 에서 A p p l e 에서 A는 0번째 인덱스 이다.
		// public char charAt(int index)
		char returnData = str.charAt(4);
		
		System.out.println("리턴문자 : " + returnData);
		
		
		System.out.println("---------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input : ");
		String data = sc.nextLine();
		
		System.out.println(data.charAt(0));
		
		//----------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Intput : ");
		
		char charData = sc.nextLine().charAt(0);
		
		System.out.println("charData : " + charData);
		
	}

}
