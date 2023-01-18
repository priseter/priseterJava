package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;


public class UpDown {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		String level = sc.next();
		int levelSet = 7;
		
//		if(level.equals("Hard"){
//			levelSet = 4;
//		}
		int com = ran.nextInt(50)+1; // 랜덤 생성
		int user;
		System.out.println(com);
		
		for(int i=0;i<7;i++) {
			System.out.println("1~50 사이의 숫자를 입력하세요.");
			user = sc.nextInt();
			if (user>50||user<1) {
				System.out.println("값을 벗어났습니다. 다시 입력해 주세요. 횟수 -1");
			}
			else {
			if(user>com && i <= 5) {
				System.out.println("Down");
				System.out.println((6-i) + "번 남았습니다.");
			}else if (user<com && i <= 5) {
				System.out.println("UP");
				System.out.println((6-i) + "번 남았습니다.");
			}else if (user>com &&  i==6) {
				System.out.println("You are Loser!!!");
				System.out.println("Ԅ(΄◞ิ౪◟ิ‵ ԅ)");	
			}else if (user<com &&  i==6) {
				System.out.println("You are Loser!!!");
				System.out.println("Ԅ(΄◞ิ౪◟ิ‵ ԅ)");
			}else {
				System.out.println("You are Winner!!");
				System.out.println("｡ﾟ( ﾟஇ‸இﾟ+)ﾟ｡");
				break;
			}
			}
			
		}
		System.out.println("게임이 종료되었습니다.");
		sc.close();
		
		
		
	}

}
