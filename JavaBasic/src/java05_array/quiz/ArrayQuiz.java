package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz {
	public static void main(String[] args) {
		// ------------- 상수선언 ------------------------
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] peo = new int[6]; // 인원수 배열
		int[] $$ = new int[6]; // 금액 배열
		int money = 12000; // 금액 총합 배열
		
		for(int i=0;i<peo.length-1;i++) {
			System.out.print((i+1) + "층의 사는 인원은 ? "); //
			peo[i] = sc.nextInt(); // 인원값 입력
			peo[5] += peo[i]; //arr값을 마지막 값에 더한다. //인원 총합
		} 
		for(int i=0;i<5;i++) {
			//관리비 계산
			$$[i]= peo[i]*money;//관리비계산 완료
			System.out.println((i+1)+ "층의 총 관리비 : " + $$[i]); //각층 관리 출력
			$$[5] += $$[i]; //관리비 총합
		} 
		System.out.println("건물에 사는 총 인원은 " + peo[5] + "명입니다." );
		System.out.println("관리비의 총 금액은 " + $$[5]  + "원 입니다."); //총합 계산
		
		// 오답 노트 - 중간까지 arr[6] 이라는 숫자에 현혹 당하여
		// arr[6]에 마지막 값을 넣으려 했으나 6개의 배열을 만드려면 peo[5] 까지 하면 0~5까지 총
		// 6개가 생기기 때문에 int[] arr = new int[6] 의 마지막 배열은 peo[5]라는 것을 기억해야 한다.
			
	}
	
	}


