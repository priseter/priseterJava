package java06_class.method;

public class MethodEx { // Execute == 실행한다   Ex = 실행

	public static void main(String[] args) {
		
		// 객체 생성
		Method_01 m01 = new Method_01();
		
		m01.method();
		
		int a = m01.sub(55, 33); // == 22로 바뀜 (리턴됨) 
		
		
		System.out.println(a);

	}

}
