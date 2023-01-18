package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection_01_List {

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); //빈 (empty) 리스트
		System.out.println( list );
		
		System.out.println("\n------------------데이터 삽입-------------------------");
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		System.out.println("\n------------------데이터 조회-------------------------");
		
		System.out.println("1번째 요소 : " + list.get(1));
		System.out.println("리스트의 크기 : " + list.size());
		System.out.println();
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
//		System.out.println(list.get(3));
		System.out.println("\n------------------데이터 수정-------------------------");
		
		list.set(0, "Orange");
		System.out.println(list);
		
		System.out.println("\n------------------데이터 삭제-------------------------");
		
		list.remove(1);
		System.out.println(list);
		System.out.println("리스트의 크기 : " + list.size());
		list.remove("Cherry");
		
		//----------------------------------------------------------------------------------------------------------
		
		//데이터를다룰 때 기본적으로 준비(수애, 서비스) 해야하는 작업들
		
		// CRUD작업
		
		// Create - 추가 / 삽입 / 생성
		// Read - 조회 / 탐색
		// Update - 수정 / 변경
		// Delete - 삭제 / 제거
		
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n------------------isEmpty()-------------------------");
		
		System.out.println("리스트가 비었는가?" + list.isEmpty());
		
		ArrayList l1 = null; // 리스트 객체가 생성하지 않음
		ArrayList l2 = new ArrayList(); //비어있음, 리스트 객체를 생성함
		
		//에러,객체가 아예 생성되지 않아서 오류이다.
//		System.out.println("리스트가 비었는가?" + l1.isEmpty());
		System.out.println("리스트가 비었는가?" + l2.isEmpty());
		if(null != l2) {
			if(!l2.isEmpty()) {
				System.out.println(l2.get(0));
			}
			
			
		}
		
		if(null!=l1 &&!l1.isEmpty()) {
		}
		System.out.println();
		String str = "Apple";
		if(null != str &&"Apple".equals(str)) {
			System.out.println("사과!");
		}
		
		System.out.println("\n------------------clear()-------------------------");
		
		list.clear();
		System.out.println(list);
		
		//Arrays.fill(배열, 값)
		//-> 배열의 모든 요소를 지정된 값으로 초기화한다.
		int[] arr = new int[10];
		Arrays.fill(arr, 0);
		
		System.out.println("\n-------------------------------------------");
		
		//** 컬렉션들은 요소의 데이터타입을 정해놓고 사용한다.
		// -> 제네릭을 이용하여 정한다.
		
		//** 특정데이터타입을 지정하지않으면 Object로 사용 하도록 되어 있다.
		
		list.add("문자열"); // String -> Object
		list.add(12345); // Wrapper로 인해 int가 아니라 Integer -> Object로 연결되어서 list에 저장된다.
		list.add(123.45); // Wrapper로 인해 double가 아니라 Double -> Object로 연결되어서 list에 저장된다.
		
	}

}
