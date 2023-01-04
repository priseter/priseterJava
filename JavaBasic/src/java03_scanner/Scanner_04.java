package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {

	public static void main(String[] args) {
		
		//입력 객체
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------입력---------------");
		
		System.out.print("Input Number : ");
		int num = sc.nextInt(); // 정수값 입력
		
		System.out.print("Input String : ");
		
		sc.nextLine(); // 입력 버퍼에 남은 '\n' 제거한다 -> 입력버퍼 지우기
//		sc.skip("[\\r\\n]+"); // 입력 버퍼에서 '\r', '\n'을 모두 제거한다. -> 입력버퍼 지우기
		String str = sc.nextLine(); // 문자열 입력
		
		System.out.println("----------출력---------------");
		System.out.println("숫자 : " + num);
		System.out.println("문자 : " + str);
		
		
	}

}
