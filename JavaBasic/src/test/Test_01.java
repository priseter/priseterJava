package test;

import java.io.StringReader;
import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		Scanner pr = new Scanner(StringReader);
		System.out.print("Input Number : ");
		
		int num1 = sc.nextInt();
		
		if (num1 == 981018) {
			System.out.println("생일");
		}else {
			System.out.println("생일아님");
		}
//		String BD = pr.nextLine();
//		if (BD.equals("생일")) 
		{System.out.println("축하해요!");
			
		}
	}

}
