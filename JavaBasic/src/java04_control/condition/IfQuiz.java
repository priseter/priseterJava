package java04_control.condition;

import java.util.Scanner;

public class IfQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("음수입니다.");
		}else if(num == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("양수입니다.");
		}
	}

}
