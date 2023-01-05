package test;

public class Debug {
	public static void main(String[] args) {
		
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

