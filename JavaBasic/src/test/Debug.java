package test;

import java06_class.Class_02;

public class Debug {
	public static void main(String[] args) {
		Class_02 cl = new Class_02();
		
		for(int i = 0; i<=4 ; i++ ) {
			//반복횟수 : 0,1,2,3,4
			//반복구간 : 5번
			for (int j = 5; j>i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j<i; j++  ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------");
		

		}

	}

