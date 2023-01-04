package java02_operator;

public class Unary_02 {

	public static void main(String[] args) {

		// 단항연산자 - 증감
		
		// ++ : 증가연산자
		// -- : 감소연산자
		
		// 피연산자 적용한 변수의 값을 1 증가시키거나 감소시키는 역할을 한다.
		//--------------------------------------------------------------------------------------------
		int num;
		num = 15;
		num++;
		System.out.println("num : "+ num);
		++num;
		System.out.println("num : "+ num);
		num = 15;
		num--;
		System.out.println("num : "+ num);
		--num;
		System.out.println("num : "+ num);
		
		num = 15;
		
		System.out.println((num++)*4);
		num = 15;
		System.out.println((++num)*4);
		num = 15;
		System.out.println((--num)*4);
		num = 15;
		System.out.println((num--)*4);
		System.out.println(num);
		
		//--------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------------------------");
		
		num = 15;
		System.out.println( num );
		System.out.println( num-- ); //감소연산자 적용, 후위 감소, 후치 감소
		System.out.println( num );
		
		System.out.println("----------------------------------------------------------------------------");
		
		
		num = 15;
		System.out.println( num );
		System.out.println( --num ); // 감소 연산자 적용, 전위 감소, 전치 감소 
		System.out.println( num );
		
		// ** 전위 증감 연산자는 변수의 값을 활용하기 전에 변수의 값을 증감시킨다.
		// ** 후위 증감 연산자는 변수의 값을 활용한 후에 변수의 값을 증감시킨다.
		
		num = 13;
		
		System.out.println(num++ -10 -++num);
//		System.out.println(13 -10 -++num); num = 14
//		System.out.println(3 - 15); num = 15
//		System.out.println(-12); num = 15
		System.out.println(num);
		
		
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println();
		
		int car = 0;
		
		for(;car < 20; car++) {
			System.out.println("주차장에 남은 자리는 " + (20 - car) + "입니다.");
			System.out.println("주차가 가능합니다.");
			System.out.println();
		}  
		
		System.out.println("차량이 전부 찼습니다.");
		System.out.println("주차가 불가능합니다.");
		
		

	   }
	
		
	
	
	
	
	
	
	
	
		//--------------------------------------------------------------------------------------------
		//--------------------------------------------------------------------------------------------
	}


