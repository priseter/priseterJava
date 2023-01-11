package java06_class.variable;

public class ClassVariableEx {

	public static void main(String[] args) {

		ClassVariable_01 cv01 = new ClassVariable_01();
		
		ClassVariable_01 cv02 = new ClassVariable_01();
		
		ClassVariable_01 cv03 = null;
		
		ClassVariable_02 cv04 = new ClassVariable_02();
		ClassVariable_02 cv05 = new ClassVariable_02();
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);
		System.out.println(cv04.city2);
		System.out.println(cv05.city2);
		
		cv05.city = "Busan";
		cv05.city2 = "Busan";
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);
		System.out.println(cv04.city2);
		System.out.println(cv05.city2);
		
		// static은 정적 변수로 저장되기에 data(class) 구역에 저장이 되고
		// 동적 변수와 다르다
		
		//** null 키워드
		// 참조형 데이터의 기본값 모두 0이다.
		// 참조하고 있는 대상이 없음을 나타낸다.
		
		//클래스 변수(정적변수를 정적인 방법으로 접근하기
		ClassVariable_02.city = "Incheon";
		System.out.println(ClassVariable_02.city);
		System.out.println(ClassVariable_02.DATA);
	}

}
