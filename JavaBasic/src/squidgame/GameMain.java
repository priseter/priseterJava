package squidgame;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean end = false;
		System.out.println("숫자 2를 입력하시면 게임이 시작됩니다.");
		System.out.println("숫자 1를 입력하시면 게임이 종료됩니다.");
		
		do { 
			int start = sc.nextInt();
			switch(start) {
			case 1: 
				end = true;
				System.out.println("게임을 종료합니다.");
				break;
			case 2: 
				end = false;
				System.out.println("게임을 시작합니다.");
				Glass gl = new Glass();
				gl.glass();
				end = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				end = false;
			}
		}while(end == false);
		System.out.println("운도 실력입니다!");
	}
}
