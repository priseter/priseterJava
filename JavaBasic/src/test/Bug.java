package test;

import java.util.Scanner;

import java06_class.Class_02;

public class Bug {
	public static void main(String[] arg){
		Class_02 cl = new Class_02();
		Scanner sc = new Scanner(System.in);
		//스캐너 생성
		String start;
		String end = "x";
		String startswitch = "z";
		// 시작 및 종료 버튼 파트
		int realEnd = 10;
		//dowhile 종료 변수 생성
		int answer1 = (7*7);
		int answer2 = (9*8);
		int youranswer;
		// 문제 정답 변수


		
	do{ 
		System.out.print("시작을 하시려면 소문자 z를 입력하세요. 종료는 소문자 x : "); 
		start = sc.next();
			//z,x, 다른 키를 입력시 각각 상황이 오도록 if - else if - else 구문 사용
			if(start.equals(startswitch)) { // z키를 입력시 if 발동
				System.out.println("구구단 게임을 시작하겠습니다.");
				System.out.print("7 X 7 = ");
				youranswer = sc.nextInt(); // 첫번째 정답 입력파트 정답 입력시 if로 진행, 오답일시 else로 진행
					if(youranswer == answer1) { 
						System.out.println("정답입니다.");
						System.out.println(); 
						System.out.print("9 X 8 = "); // 첫번째 정답 입력시 두번째 문제 제공
						youranswer = sc.nextInt(); // 두 번째 정답 입력 파트 정답시 if로 진행, 오답일시 else로 진행
						if(youranswer == answer2) { // 두번째 입력 정답시 진행파트
							System.out.println("정답입니다.");
							System.out.println();
							System.out.println("정말 대단하시네요."); // 게임 승리 문구
							System.out.println();
						}else { //  두 번째 답이 오답일시 진행 루트
							System.out.println("구구단 공부 다시 하셔야겠어요.");
							System.out.println("구구단 알려드릴테니 다시 공부하고 도전하세요!");
							System.out.println();
							
							for(int i = 2; i<=9 ; i++) {
								for(int j = 1 ; j<=9; j++) {
									System.out.print(i + " X " + j + " = " + i*j + "\t");
								} 
								System.out.println();
							}
							System.out.println();
							// 구구단 for 구문 
							
						} // 두번째 오답 진행 루트 마무리
					}// 첫 번째 문제 정답, 두 번째 문제 오답 진행 루트 마무리
					else { // 첫 번째 문제 오답 루트
						System.out.println("구구단 공부 다시 하셔야겠어요");
						System.out.println();
						for(int i = 2; i<=9 ; i++) {
							for(int j = 1 ; j<=9; j++) {
								System.out.print(i + " X " + j + " = " + i*j + "\t" );
							}
							System.out.println();
							
						}
						System.out.println();
						//구구단 for 구문
						
					} // 첫 번째 문제 오답 루트 종료
				} else if(start.equals(end)) { // x키를 눌렀을시 종료로 이동
					realEnd = 0;
				} else { // 처음에 z나 x가 아닌 다른 키를 입력시에 처음으로 돌아가는 루트
					System.out.println("소문자 z나 x를 입력해주세요.");
					System.out.println("다른 키를 입력시 처음으로 다시 돌아갑니다. ");
					System.out.println();
				}
//				System.out.println(); // 종료절차
//				System.out.println("종료하시려면 소문자 x를 입력해주세요. ");
//				System.out.println("다른 키를 입력시 처음으로 다시 돌아갑니다. ");
//				start = sc.next();
//				if(start.equals(end)) {//게임 종료 구문
//					realEnd = 0;
//				}else {// 다른 키 입력시 처음으로 다시 돌아가는 구문
//					System.out.println("다른 키를 눌러 처음으로 돌아갑니다.");
//					System.out.println();
//				} //원래는 게임 승리후 종료절차로 넘어가려했는데 굳이 필요없어서 주석처림 나름 코드 공부한거라 생각중
	
		} while(realEnd == 10); // 종료 조건 만족시 while의 realEnd가 10이 아닌 0으로 되어 Do while 구문 종료
		System.out.println("즐겨주셔서 감사합니다."); //엔딩멘트
		
	sc.close(); // 키보드 입력값 닫음
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

