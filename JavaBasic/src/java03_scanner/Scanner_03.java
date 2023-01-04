package java03_scanner;

import java.util.Scanner;

public class Scanner_03 {
	
	public static void main(String [] args) {
		// 문자열 입력 처리 메소드
		// nextLine(), next()
		//----------------------------------------------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
		
		System.out.print("Input String : ");
		
//		str1 = sc.next();
//		str2 = sc.next();
		
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		
		//--------------------------------------------------------------------------------------------------------------------------------
		//nextLine() - '\n'
		//	개행 문자 (엔터)를 기준으로 입력한 한 줄을 하나의 데이터로 판단한다.
		//next() - ' ', '\n', '\t'
		//엔터 뿐만 아니라 공백문자(white space, ws)를 기준으로 하나의 데이터로 판단한다. (space, tab)
		
		System.out.println("\n--- 출력 ---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		
		
		//nextInt(),nextDouble(), nextBoolean(),....... 들은 next()처럼 데이터를 판단한다.
		
	}

}
