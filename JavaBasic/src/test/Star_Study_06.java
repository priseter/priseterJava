package test;

public class Star_Study_06 {

	public static void main(String[] args) {

		for(int i = 1; i < 10; i += 2 ) {
			for(int j = 10; j>i ; j-=2 ) {
				System.out.print("*");
			}
			for(int j = 0; j<i ; j++ ) {
				System.out.print(" ");
			}
			for(int j = 10; j>i ; j-=2 ) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 9 ; i > 0 ; i -=2) {
			for(int j = 10 ; j>i; j-=2) {
				System.out.print("*");
			}
			for(int j = 0; j<i ; j++) {
				System.out.print(" ");
			}
			for(int j = 10 ; j>i; j-=2) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
