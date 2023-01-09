package squidgame;

import java.util.Scanner;


public class Glass {
	public void glass() {
		Scanner sc1 = new Scanner(System.in);
		final int GameOver = 0;
		
		String[][] answer = {
				{"운","쥬","실","력","딥","미","다"}, 
				{" "," "," "," "," "," "," "},
				{"문","도","칠","약","입","니","카"},
				{"운","도","실","력","입","니","다"},
				{"문","쥬","칠","약","딥","미","카"}
		};
		
		
		for(int i = 3; GameOver < i  ;i--) {
			for(int j = 0;j<answer[3].length;j++ ) {
				System.out.println("두 발판중 하나를 골라주세요.");
				System.out.println("┌--------┐" + "\t\t\t" +"┌--------┐");
				System.out.println("│   "+ answer[0][j] +"   │" + "\t\t\t" +"│   "+ answer[2][j] +"   │");
				System.out.println("└--------┘" + "\t\t\t" +"└--------┘");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
			
				answer[1][j] = sc1.next();
				if(answer[1][6].equals("다")) {
					System.out.println("승리하셨습니다!");
				}
				else if(answer[1][j].equals(answer[3][j])) {
					System.out.println("다음 단계");
					System.out.println();

				}else if(answer[1][j].equals(answer[4][j])) {
					System.out.println("남은 목숨 : "  + (i-1) );
					j = 100;
					System.out.println();
				}else {
					System.out.println("미끄러졌습니다!");
					System.out.println("남은 목숨 : "  + (i-1) );
					j = 100;
					System.out.println();
				}
				}
			if(answer[1][6].equals("다")) {
				i = GameOver;
			}
		}
		}	
	}


