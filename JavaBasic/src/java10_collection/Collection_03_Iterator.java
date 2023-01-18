package java10_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {

	public static void main(String[] args) {

		//interface Iterator
		//반복자
		//컬렉션(List,Set)의 모든 요소들을 순차적으로 접근할 때 사용한다.
		//for-each 구문과 비슷한 역할을 수행한다.
		//---------------------------------------------------------------
		
		//Arrays.List(T...a)메소드
		//	->매개 변수로 나열된 데이터들을 순서대로 삽입한
		//	ArrayList객체를 생성하여 반복한다.
		
		List list = Arrays.asList("A", "B", "C", "D", "E");
		System.out.println(list);
		//---------------------------------------------------------------------------
		//반복자 변수 선언
		Iterator iter = null;
		
		// list객체를 이용하여 Iterator객체 생성
		iter = list.iterator();
		
		//요소가 존재하는 만큼 반복한다.
		while(iter.hasNext()) {
			// 요소를 반환하고 다음 요소를 반환할 수 있도록 준비한다.
			Object data = iter.next();
			System.out.println(data);
		}
//		while(!list.isEmpty()) {
//			Object data2 = list.get(0);
//			System.out.println(data2);
//		}
		
	}

}
