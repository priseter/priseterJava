package java11_generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_01_Basic {

	public static void main(String[] args) {

//		public class java.util.ArrayList<E>{}
		
		
		//	클래스를 정의할 때 제네릭 타입을 적용할 수 있다.
		//  클래스 내부 코드에서 E를 자료형처럼 사용 가능하다.
		
		// -> 제네릭 클래스
		
		//---------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------
		
		//** 타입 파라미터, Type Parameter (파라미터 - 매개 변수)
		// -> 일반화시켜 적용한 데이터타입
		// -> 특정 자료형으로 결정되기 전 상태의 데이터타입 (일반화)
//		ArrayList<E> <E>가 타입 파라미터 // 약간 타입의 메타몽!
//		ArrayList<E> a;
		ArrayList<String> list;
		
		//타입 파라미터를 결정하지않으면 "raw type" 라고 한다.
		// Object타입으로 자동 결정된 것이다.
		ArrayList list2; // == ArrayList <Object> list2;
		//타입 파라미터를 String으로 결정
		ArrayList<String> list3;
		list3 = new ArrayList<String>();
		
		list3.add("Apple");
		list3.add("Banana");
		//에러,
//		list3.add(100);
		//---------------------------------------------------------------------------------------
		//제네릭타입으로 기본형 타입 사용불가
//		ArrayList<int> list4;
		ArrayList<Integer> list5;
		list5 = new ArrayList<Integer>();
		//---------------------------------------------------------------------------------------
		//객체를 생성하는코드에서는제네릭타입을 생략하고 <>만적어도된다.
		//-> JDK 1.7 이상 가능
		ArrayList<String> list6 = new ArrayList<>();
		ArrayList<Integer> list7 = new ArrayList<>();
		
		Iterator<Integer> iter = list7.iterator();
		}
	

}
