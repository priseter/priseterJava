package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		if( num%3 == 0 && num != 0) {
			System.out.println("3의 배수이다.");
		}
		
		if( num%3 != 0 && num == 0) {
			System.out.println("3의 배수가아니다.");
		}	
	}
}
