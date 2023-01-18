package java09_api;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		Random ran; //랜덤 객체 변수
		ran = new Random();
		System.out.println(ran.nextInt());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextDouble());
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println(ran.nextInt(100)); // 0~99, 100개중 랜덤
		System.out.println(ran.nextInt(100)+1); // 1~100, 100개중 랜덤
		
		System.out.println(ran.nextInt(3)+ 6);
		
		
		
		for(int i =0; i<10; i++) {
			sc.next();
//			System.out.println(ran.nextInt(100)+1);
			
			switch(ran. nextInt(3)) {
			case 0: 
				System.out.println("가위");
				break; 
				
			case 1:
				System.out.println("바위");
				break;
				
			case 2:
				System.out.println("보");
				break;
			}
			
		}
	}

}
