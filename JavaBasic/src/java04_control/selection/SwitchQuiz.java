package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		//
		final String HELLO_MENU = "1"; 
		final String NAME_MENU = "2";
		final String GENDER_MENU = "3";
		final String EXIT_MENU = "4";
		//----------------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int end = 10;
		//----------------------------------------------------------------------------------------------

		do{
			System.out.println();
			System.out.println("===========================================");
			System.out.println("         	M  e  n  u");
			System.out.println("===========================================\n");
			System.out.println("시작 하시려면 원하시는 메뉴의 숫자를 입력 해주세요.\n");
			System.out.println("1. Hello World 출력\n");
			System.out.println("2. 이름 출력\n");
			System.out.println("3. 성별 출력\n");
			System.out.println("4. 종료\n");
			
			System.out.print("\t>> ");
			String menu = sc.nextLine();
				
			System.out.print("\t>> ");
			switch (menu) {
			case HELLO_MENU: // Hello World 출력
				System.out.println("Hello World");
				System.out.println();
				break;
			case NAME_MENU: // 이름 출력
				System.out.println("윤정혁");
				System.out.println();
				break;
			case GENDER_MENU: // 성별 출력
				System.out.println("남성");
				System.out.println();
				break;
			case EXIT_MENU: // 종료
				System.out.println("종료합니다.");
				end = 0;
				break;
			default: // 다른 메뉴 선택
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
				break;
			}
			
		}while(end == 10);
		System.out.println();
		System.out.println("사용해주셔서 감사합니다!");
		sc.close();
		
	}
		

}
