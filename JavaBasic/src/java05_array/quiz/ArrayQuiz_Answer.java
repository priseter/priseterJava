package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz_Answer {

	public static void main(String[] args) {
		
		//----상수 선언------- (많이 사용할 만하고 변환 할 만한 숫자를 상수로 해놓으면 재사용 할만한 코드가 된다)
		final int FLOOR = 5;
		final int FEE = 12000;
		
		//----필요한 변수 선언------
		
		Scanner sc = new Scanner(System.in);
		// 각 층 인원 + 총 인원 배열
		int[] people = new int[FLOOR +1];
		// 각 층 관리비 + 총 관리비 배열
		int[] expense = new int[FLOOR + 1];

		//----------1~5층의 인원 입력 ----------------
		for(int i= 0 ; i<FLOOR; i++) {
			System.out.print(" >> " + (i+1) + "층의 인원은? ");
			people[i] = sc.nextInt();
			
		//-----------총 인원 계산--------------------	
			people[FLOOR] += people[i] ; 
			// 상수와 배열의 마지막 숫자가 언제나 같기 때문에 이렇게 입력하면 언제든지 상수만 변경하면 다시 사용할 수 있는 코드가 된다.
		}
		
//		--------------TEST식 (인원 배열)------------
//		for(int i = 0; i<people.length;i++) {
//			System.out.println("people["+ i +"]" + " = " + people[i]);  
//		}
		
		//----------관리비 계산----------------------
		for(int i = 0; i<people.length;i++) {
			expense[i] = people[i] * FEE;
		}
		
//		--------------TEST식 (관리비 배열)-----------
//		for(int i = 0; i<expense.length;i++) {
//		System.out.println("expense["+ i +"]" + " = " + expense[i]); 
//		}
		
		//-----------------전체 출력-----------------
		System.out.println();
		System.out.println("----------- 각층의 관리비 출력---------------");
		for(int i = 0; i<FLOOR; i++) {
			System.out.println(" >> " + (i+1) + "층의 관리비는 " + expense[i] + "원입니다.");
		}
		System.out.println();
		System.out.println("총 인원은 " + people[FLOOR] + "명 입니다");
		System.out.println("총 관리비는 " + expense[FLOOR] + "원입니다.");
		
	}

}
