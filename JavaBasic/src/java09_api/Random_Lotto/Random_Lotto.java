package java09_api.Random_Lotto;

import java.util.Arrays;
import java.util.Random;

public class Random_Lotto {

	public static void main(String[] args) {
		
		

		Random ran = new Random();
		
		int[] lotto = new int[6];
		
		for(int i = 0; i<lotto.length; i++) {
			int num = ran.nextInt(45) + 1;
			
			boolean isExist = false;
			
			for(int j = 0; j<i;j++) {//중복값 발견!
				if(lotto[j]== num) {
					isExist = true;
					break;
				}
			}
			if(isExist) {
				i--;
				continue;
			}
				
				
			lotto[i] = num;
		}
		Arrays.sort( lotto );
		System.out.println( Arrays.toString(lotto) );


	}
}
