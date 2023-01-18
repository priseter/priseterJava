package java10_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collection_04_Set {


	public static void main(String[] args) {

//		Set set = new HashSet(); // 기본 set
//		Set set = new LinkedHashSet(); 입력 유지 set
		Set set = new TreeSet(); // 오름차순 정렬된 상태 Set
		
		//순서없이 저장한다. HashSet
		//입력된 순서대로 저장한다. LinkedHashSet
		// 오름 차순 정렬 상태로 유지한다.
		set.add(40);
		set.add(10);
		set.add(20);
		set.add(30);
		
		set.add(20);
		set.add(20);
		set.add(20);
		set.add(30);
		set.add(30);

		System.out.println(set);
		
		System.out.println("---------------------------------------------------");
		
		//Set 객체의 Iterator 사용하기
		Iterator iter = set.iterator();
		
		//Iterator를 이용해 전체데이터 출력
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-----------------------------");
		System.out.println("크기 : "+ set.size());
		System.out.println("비었나? : "+ set.isEmpty());
		System.out.println("30이 있는가 : "+ set.contains(30));
		System.out.println("30이 제거 : "+ set.remove(30));
		System.out.println("50이 제거 : "+ set.remove(50));
	
		System.out.println("-----------------------------");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		System.out.println("비었나? : "+ set.isEmpty());
		System.out.println("크기 : "+ set.size());
		
	}
}
