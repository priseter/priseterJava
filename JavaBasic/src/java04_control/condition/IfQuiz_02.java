package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		//음수도 정수야 ;;
		if (num<=0) {
			System.out.println("3의 배수가 아닙니다.");
		}else if (num%3 == 0){
			System.out.println("3의 배수입니다.");			
		}else{
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
