package java08_abstract;

public class AbstractEx {

	public static void main(String[] args) {

		
		Professor ps = new Professor("Alice", "컴퓨터");
		Student st = new Student("Bob", "자바")	;
		
		ps.display();
		st.display();
		
		System.out.println("---------------------------------------------------------------------------------");
		
		Person p1 = new Professor("Clare", "인공지능");
		Person p2 = new Student("Dave", "알고리즘");
		System.out.println("---------------------------------------------------------------------------------");
		
		Person p;
		
		//에러, 추상클래스로 객체 생성 불가
//		p = new Person("Edward");
			
		
		
		
	}

}
