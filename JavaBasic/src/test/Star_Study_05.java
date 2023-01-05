package test;

public class Star_Study_05 {

	public static void main(String[] args) {
		
		for(int i = 3; i<10 ; i+=2 ) {
			for(int j = 10; j>i ; j-=2 ) {
				System.out.print(" ");
			}
			for(int j = 2; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i = 1; i<10 ; i+=2) {
			for(int j = 1; j<i ; j+=2) {
				System.out.print(" ");
				
			}
			for(int j = 10; j>i; j--) {
				System.out.print("*");
			}System.out.println();
		}

		
	}

}
