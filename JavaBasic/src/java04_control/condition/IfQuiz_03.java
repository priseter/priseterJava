package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
//		if (num1==num2) {
//			System.out.println("두 수는 같습니다.");
//		}else if (num1>num2) {
//			System.out.println(num1 +" 이 더 큰수");
//		}else{
//			System.out.println(num2 +" 이 더 큰수");
//		}
				
				
				
				
				
				
			int result = 0; 
				
			if (num1==num2) {
			result = num1;
			}else if (num1>num2) {		
			result = num2;
			}else{
			result = num2;
			}
			System.out.println(result +" 이 더 큰수");

	}
}
