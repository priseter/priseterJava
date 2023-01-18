package java09_api;


public class ObjectEx {

	public static void main(String[] args) {

		Object obj = new Object();
		
		System.out.println(obj.getClass());
		
		
		// obj 객체의 클래스정보를 확인 할 수 있다.
		Class classInfo = obj.getClass();
		
		//----------------------------------------------------------------------
		System.out.println("---------------------------------------------------------------");
		
		//Object 객체 출력
		System.out.println(obj);
		
		Point p1 = new Point(10,20);
		System.out.println(p1);
		// println에 tostring을 호출하도록 되어있다.
		System.out.println(p1.toString());
		
		Point p2 = new Point(0, 0);
		Point p3 = new Point(0, 0);
		Point p4 = new Point(0, 0);
		Point p5 = new Point(0, 0);
		
		p2=p4;
		
		System.out.println(p2.equals(p3));
		
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println();
		
		System.out.println("p2 : "+p2.hashCode());
		System.out.println("p3 : "+p3.hashCode());
		System.out.println("p4 : "+p4.hashCode());
		
		System.out.println();
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("s1 : "+s1.hashCode());
		System.out.println("s2 : "+s2.hashCode());
		System.out.println("s3 : "+s3.hashCode());
		System.out.println("s4 : "+s4.hashCode());
		
		System.out.println();
		System.out.println("---------clone()---------------");
		
		Point pOriginal = new Point(33,44);
		//얕은 복사
		Point pClone1 = pOriginal;
		//깊은 복사
		Point pClone2 = new Point (pOriginal.getX(), pOriginal.getY());
		//clone()을 이용한 복사
		try {//예외 처리 구문 try-catch
			//clone()을이용한 깊은 복사
			Point pclone3 = pOriginal.clone();
			System.out.println(pclone3);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}


	}

}
