package test;

public class Star_Study_02 {

	public static void main(String[] args) {

		for(int i = 0; i <= 4 ; i++ ) {
			for(int j = 5; j>i ; j--) 
			{
				System.out.print("*");
			}System.out.println();
		}
		for (int i = 2; i <= 5 ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("---------------------------------------------------------------------------");
		
		
		for(int i = 0; i < 5; i++) {// i, 0~4, x5
			for(int j = 4; j>i;j--){// j, 4~1, x4
				System.out.print(" ");
			}
			for(int j = 0; j<=i ; j++) { // j, 0 ~ 4
				System.out.print("*");
			} System.out.println();
		}
		for(int i = 4; i > 0 ; i--) {// i, 4~1, x4
			for(int j = 4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
				

		}
		System.out.println("---------------------------------------------------------------------------");
		
		
		for(int i = 1; i <10; i+=2 ) {
			for(int j = 9; j > i ; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}