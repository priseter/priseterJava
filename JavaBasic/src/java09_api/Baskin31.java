package java09_api;

import java.util.Random;
import java.util.Scanner;

public class Baskin31 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int player;
		int com;
		int answer = 0;
		
		int coma = 0;
		int playera = 0;
		
		do {
			System.out.println("1~3 사이의 숫자를 입력해주세요. ");
			player = sc.nextInt();
			if (player == 1) {
					answer += player;
					System.out.println("플레이어 > "+answer);
			}else if (player == 2) {
				answer += player;
				System.out.println("플레이어 > "+ (answer-1));
				System.out.println("플레이어 > "+answer);
			}else if (player == 3) {
				answer += player;
				System.out.println("플레이어 > "+(answer-2));
				System.out.println("플레이어 > "+(answer-1));
				System.out.println("플레이어 > "+answer);
			} else {
				System.out.println("값이 다릅니다.");
				continue;
			} 
			playera = answer;
			if(answer<31) {
			com = (ran.nextInt(2)+1);
			if (answer > 26 && answer<30) {
				if(answer == 27) {
					answer += 3;
					System.out.println("컴퓨터 > "+(answer-2));
					System.out.println("컴퓨터 > "+(answer-1));
					System.out.println("컴퓨터 > "+answer);
					continue;
					}
				else if(answer == 28) {
					answer += 2;
					System.out.println("컴퓨터 > "+(answer-1));
					System.out.println("컴퓨터 > "+answer);
					continue;
					}
					else if(answer == 29) {
					answer += 1;
					System.out.println("컴퓨터 > "+answer);
					continue;
				}
			}
			else if (com == 1) {
				answer += com;
				System.out.println("컴퓨터 > "+answer );
			}else if (com == 2) {
				answer += com;
				System.out.println("컴퓨터 > "+(answer-1));
				System.out.println("컴퓨터 > "+answer);
			}else if (com == 3){
				answer += com;
				System.out.println("컴퓨터 > "+(answer-2));
				System.out.println("컴퓨터 > "+(answer-1));
				System.out.println("컴퓨터 > "+answer);
			}
			coma = answer;
			}
			
			
		}while(answer < 31);
		
		if (coma >= 31) { 
			System.out.println("컴퓨터의 패배!");
			
		} else if (playera >= 31) {
			System.out.println("당신의 패배!");
			
		}
		
		
	}

}
