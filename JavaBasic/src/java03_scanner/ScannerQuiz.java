package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name,gender;
		int age, korean, english, mathmatics;
	
		
		System.out.println("===============입력===================");
		
	
		System.out.print("Input Name : ");
		name = sc.nextLine();
		System.out.print("Input Age : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.print("Input Gender : ");
		gender = sc.nextLine();
		System.out.println();
		System.out.print("Input Korean : ");
		korean = sc.nextInt();
		System.out.print("Input English : ");
		english = sc.nextInt();
		System.out.print("Input Mathmatics : ");
		mathmatics = sc.nextInt();
		
		System.out.println("==============출력==================");
		
		System.out.println("이름	" + "나이	" +"성별	"+"국어	" + "영어	" +"수학	"+"총점	"+"평균	");
		System.out.print(name +'\t' + age + '\t' + gender + '\t' + korean + '\t' + english + '\t' + mathmatics + '\t'+ (korean + english + mathmatics)
				+ '\t' + ((double)(korean + english + mathmatics)/3));
		
	}

}
