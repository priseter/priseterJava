package java07_inherit.practice.controller;

import java.util.Iterator;
import java.util.Scanner;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
		
//		int[] Circle = {1,2,3};
//		int[] Rectangle = {1,2,3};
		
//		for(int i = 0; i < Circle.length; i++) {
//			Circle c = new Circle(0,0,Circle[i]);
//			Rectangle r = new Rectangle(0, 0, Rectangle[i], Rectangle[i]);
//			c.draw();
//			r.draw();
		
		Circle [] c = new Circle[3];
//		Rectangle [] r = new Rectangle[3];
		c[0] = new Circle( 2,3,4 );
		c[1] = new Circle( 5,6,7 );
		c[2] = new Circle( 8,9,10 );
		
//		r[0] = new Rectangle( 2,3,4,5 );
//		r[1] = new Rectangle( 6,7,8,9  );
//		r[2] = new Rectangle( 11,12,13,14  );
		
		Rectangle[] r = {
				new Rectangle(2,3,4,5),
				new Rectangle(6,7,8,9),
				new Rectangle(10,11,12,13)
		};
		
		for(int i = 0; i<c.length;i++) {
			c[i].draw();
			r[i].draw();
			System.out.println((i+1) +"번째입니다.");
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		//부모 배열 = new 부모[];
		//배열이름 = new 자식;
		
		Point[] t = new Point[5];
		t[0] = new Circle(2,3,4);
		t[1] = new Rectangle(2,3,4,5);
		t[2] = new Circle(5,6,7);
		t[3] = new Rectangle(6,7,8,9);
		t[4] = new Circle(8,9,10);
		
		for(int i = 0; i <t.length;i++) {
			t[i].draw();		}
	
		
		System.out.println("-------------------------------------------------------------------------");
		
		
		//for each 구문
		
		int[] arr = {1,2,3,4,5};
		
		for( int n : arr) {
			System.out.println( n );
		}
		
		double[] darr = {1,2,3,4,5};
		
		for( double n : darr) {
			System.out.println( n );
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		
		for(Circle i : c) {
			i.draw();
		}
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		for(Rectangle i : r) {
			i.draw();
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		for(Point i : t) {
			i.draw();
			System.out.println("====================");
		}
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		for(Point i : t) {
		if(i != null )
			{i.draw();
			System.out.println("====================");}
		
	}
}
}
