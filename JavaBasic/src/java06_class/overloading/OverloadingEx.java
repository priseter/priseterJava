package java06_class.overloading;

import java.util.Scanner;

public class OverloadingEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();

		Overloading ol = new Overloading();
		

		System.out.println("---------display()--------");
		ol.display();

		ol.setX(30);
		ol.setY(100);	
		ol.display();
//		ol.display(3,4);
		ol.display(a,b);
		System.out.println("---------display()--------");
		
		
		
		
		System.out.println("---------display()--------");
		ol.display(a,b);
	}

}
