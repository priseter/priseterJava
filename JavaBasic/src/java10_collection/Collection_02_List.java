package java10_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_02_List {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		List list2 = new LinkedList();
		List list3 = new Vector();
		
		ArrayList ar = new ArrayList();
		LinkedList lk = new LinkedList();
		Vector vt = new Vector();
		
		//각 타입의고유한 기능(메소드)를 사용하려면 객체변수를
		//부모타입인 List로 선언하면 안된다.
		
		//** 하지만, 보통의 경우 List로 객체 변수타입으로 사용한다.
	}

}
