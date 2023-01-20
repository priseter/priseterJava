package java12_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_01_Basic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int i = 0;
		int a = 0;
//		while(true) {
//			//ArrayIndexOutOfBoundsException
//			//인덱스를 음수로 지정하여 배열에 접근했을때
//			//인덱스를 배열의 길이와 같은 값으로 사용했을때
//			//인덱스를 배열의 길이보다 큰 값을 지정했을때 
//			
//			arr[i]= i+1;// 예외 발생 지점
//			i++;
//		}
//		while(true) {
//		if(i<0 || i>=arr.length) {
//			System.out.println("인덱스를 잘못 사용하셨습니다.");
//			break;
//		}
//		arr[i]= i+1;
//		i++;
//		}
		while (a <100) {
		try { a = sc.nextInt();
		System.out.println(a);
			
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요...");
//			e.printStackTrace();
			sc.nextLine();
			continue;
		}
		}
		
	}
}

