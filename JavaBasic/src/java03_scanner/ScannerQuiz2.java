package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 이름 입력
		// 변수를 한번에 지정해 두는 것보다, 필요할 때마다 변수를 새로 만들어서 사용하는 편이 좋다.
		String name;
		System.out.print("Input Name : ");
		name = sc.nextLine();
		
//		System.out.println("[TEST] name : " + name);
		//여러가지 변수를 사용하는 경우에는 테스트 코드를 사용하던지 디버깅을 습관화 하자.
		
		//나이 입력
		System.out.print("Input Age : ");
		int age = sc.nextInt();
		
//		System.out.println("[TEST] Age : " + age);
		
		//성별 입력
		System.out.print("Input Gender : ");
		sc.nextLine();// 위쪽에 nextInt가 왔기 때문에 버퍼 비우기용
//		String gender = sc.nextLine();
		
		//char 처리하는 방법
		char gender = sc.nextLine().charAt(0);
		
//		System.out.println("[TEST] Gender : " + gender);
		
		//국어 입력
		System.out.print("Input Korean : ");
		int korean = sc.nextInt();
		
//		System.out.println("[TEST] Korean : " + korean);
		
		//영어 입력
		System.out.print("Input English : ");
		int english = sc.nextInt();
		
//		System.out.println("[TEST] English : " + english);
		
		//수학 입력
		System.out.print("Input Mathmatics : ");
		int mathmatics = sc.nextInt();
		
//		System.out.println("[TEST] Mathmatic : " + mathmatics);
		
		
		//------------------총점, 평균계산------------------------//
		
		int sum = korean + english + mathmatics;
		double avg = sum/(double)3;
		
//		System.out.println("[TEST] sum : " + sum);
//		System.out.println("[TEST] avg : " + avg);
		
		System.out.println(); // 줄바꿈
		System.out.println(); // 줄바꿈
		System.out.println("----------------------출력-----------------------------");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(korean + "\t");
		System.out.print(english + "\t");
		System.out.print(mathmatics + "\t");
		System.out.print(sum + "\t");
//		System.out.println(avg);
		System.out.printf("%.2f%n",avg); // 소수점 둘째자리까지 출력
		
	}

}
