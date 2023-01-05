package java04_control.loop;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class For_05 {

	public static void main(String[] args) {

		// 1부터 10 까지의 총합 구하기
		// ->55
		
		//반복횟수 : 10회
		//반복구간 : 1~10

		//반복하면서 수행할 작업
		//초기식 : int i = 1
		//조건식 : i <= 10
		//증감식 : i++
		
		int sum = 0;
		for(int i =1; i<=10; i++) {
////			if (i == 10) {System.out.println("총합 : "+(sum += i));
////			}else {sum += i;
//			}
		 	sum = sum + i;
		}System.out.println(sum);
	}

}
