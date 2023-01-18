package java07_inherit_prac_02;

import java07_inherit.practice2.Computer;
import java07_inherit.practice2.Product;
import java07_inherit.practice2.Tv;
import java07_inherit_prac_03.Person;

public class productEx {
	public static void main(String[] args) {
		
//		System.out.println("---상속 전 테스트-----------------");
//		Computer c1 = new Computer("i7", 1000);
//		c1.out();
//		
//		Tv t1 = new Tv("Canvas", 800);
//		t1.out();
	


		
		
		
		
		System.out.println("---상속 후 테스트-----------------");
		Product p1 = new Computer("i5", 700);
		p1.out();
		
		Product p2 = new Tv("LG", 500);
		p2.out();
		
//		Product p3 = new Product("PROD",111);
		// Product가 추상 클래스이기 때문에 인스턴스화 할 수 없다.
		Product p4; // 변수 선언 까진가능하다. EU. 인스턴스화 한것은 아니기때문


		
		
		
		
		System.out.println("---Product 배열 테스트------------");
		Product[] products = new Product[5];
		
		int count = 0;
		products[count++] = new Computer("com1", 100);
		products[count++] = new Tv("tv1", 200);
		products[count++] = new Tv("tv2", 300);
		products[count++] = new Tv("tv3", 400);
		
		for(int i=0; i<count; i++)
			products[i].out();
		
		System.out.println(count+"개 물건 구입");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---Person------------");
		Person p = new Person("Alice", 2000);
		p.buy( new Tv("LG", 500) );
		p.buy( new Computer("i5", 1000) );
		p.buy( new Tv("Pavv", 700) );
		
		
		
		
		
		
		System.out.println("---Person2------------");
		
		
		
		Product[] parr = new Product[10];
		parr[0] = new Tv("LG",400);
		parr[1] = new Computer("i5",2200); 
		parr[2] = new Computer("i7",3400); 
		parr[3] = new Tv("Pavv",700); 
		
		for(int i = 0; i<parr.length; i++) {
			if(parr[i] != null) {
			p.buy(parr[i]);
			System.out.println();
			}
			else {
				break;
			}
			
			
		}
	
		
		
		
		
//	
	}
}


