package java09_api;

import java.math.BigInteger;

public class WrapperEx {

	public static void main(String[] args) {

		int num = 10; //int타입 변수(기본형)
		
		Integer ival1 = num; // Integer타입 변수(참조형)
		Integer ival2 = 12345;
		
		//생성자는 deprecate 되어 있음
//		Integer ival3 = new Integer(89786);
		
		
		//int타입 변수(기본형)
		int i1 = ival1;
		int i2 = ival2;
		
		//-------------------------------------------------------------------------------------------------
		
		//자료형에 대한 정보

		System.out.println("BYTES : " + Integer.BYTES);
		System.out.println("BYTES : " + Integer.SIZE);
		
		System.out.println("D.BYTES : " + Double.BYTES);
		
		System.out.println("D.BYTES : " + Character.BYTES);
		
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);

		// 문자열에서 데이터를 추출한다.
		int number = Integer.parseInt("12345");
				//parse는 규칙에 따라서 일정 패턴을 추출
		
		double dNum = Double.parseDouble("3.4567");
		
		boolean bData = Boolean.parseBoolean("true");
		
		
	}

}
