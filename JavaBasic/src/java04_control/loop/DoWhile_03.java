package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03 {

	public static void main(String[] args) {

		//숫자를 입력하고 (Scanner) 그 값을 다시 출력하는 시스템
		
		// -> 99를 입력하면 종료한다.
		
		Scanner sc = new Scanner(System.in);
		int input = 0;// 입력값
		
//		do { 
//			System.out.print("Input Number(종료 = 99) : ");
//			input = sc.nextInt();
//			
//			System.out.println("입력한 값 : " + input);
//			System.out.println();
//		} while(input != 99);
//		
//		System.out.println("종료");
		
		for(;;) {
			System.out.print("Input Number(종료 = 99) : ");
			input = sc.nextInt();
			
			System.out.println("입력한 값 : " + input);
			System.out.println();
			
			if(input == 99) {
				break;
			}
		
		}

	}
}






















