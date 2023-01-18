package java10_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_05_Map {
	public static void main(String[] args) {
		
		//맵 객체 생성

//		Map map = new HashMap();
		Map map = new Hashtable();
		
		//데이터 삽입
		map.put("a", "Apple"); // a=Apple
		map.put(1, "Banana"); // 1=Banana
		map.put(true, 3.345); // true=3.345
		System.out.println("map : "+map);
		
		
		System.out.println("\n--------get(key)----------------------");
		
		System.out.println("\"a\" : " + map.get("a"));
		System.out.println("\"1\" : " + map.get(1));
		System.out.println("\"true\" : " + map.get(true));
		
		//존재하지 않는 key를 이용하여 get()하면 null 반환
		
		System.out.println(map.get(99999));
		System.out.println("\n--------put(key)----------------------");
		map.put("D", "Durian");
		System.out.println(map);
		
		System.out.println("---------------------------------------------");
		// 기존에 존재하던 key를 이용한 데이터 삽입
		// -> key에 매핑된 value를 변경한다.
		map.put(1, "Orange");
		System.out.println(map);
		System.out.println("---------------------------------------------");
		
		map.put(2, "Apple");
		System.out.println(map);
		
		System.out.println("\n----------contains----------------------");
		
		System.out.println("Key 5 : " + map.containsKey(5));
		
		
		// key 2가 없을 때만 데이터를 삽입하자.
		
		if(!map.containsKey(2)) {
			map.put(2, "Cherry");
		}
		System.out.println(map);
		System.out.println("---------------------------------------------");
		System.out.println("Value Apple : "+ map.containsValue("Apple"));
		
		System.out.println("크기 : " + map.size());
		System.out.println("비었는가 : " + map.isEmpty());
		System.out.println();
		System.out.println("---------------------------------------------");
		//value들만 Collection 형태로출력하기
		System.out.println(map.values());
		System.out.println("---------------------------------------------");
		
		map.remove(true);
		System.out.println(map);
		
		map.remove(2, "Banana");
		System.out.println(map);
		
		map.remove("D","Durian");
		System.out.println(map);
		
		System.out.println("\n----------null 값 처리----------------------");
		//HashMap은 key,value 로 null이 허용된다.
		//Hashtable는 key,value 둘다 null을 허용하지 않는다.
		
//		map.put(null,"Alice");
//		map.put("Bob", null);
		
//		System.out.println(map);
//		
////		map.put(null, null);
//		System.out.println(map);
		
		System.out.println("\n----------전체 데이터 반복----------------------");
		
		Set keys = map.keySet();
		Iterator iter = keys.iterator();
		
		while (iter.hasNext()) {
			Object key = iter.next();
			Object value = map.get(key);
			System.out.println(key + " = " + value);
		}
		System.out.println("---------------------------------------------");
		for (Object key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
		
//		map.put(true, 3.34);
//		map.put(3, "Banana");
//		map.put(4, "Banana");
//		map.put(1, "Banana");
//		System.out.println(map);
//		map.remove(1);
//		map.put(1, "Banana");
//		System.out.println(map);
		
		
	}
	
}
