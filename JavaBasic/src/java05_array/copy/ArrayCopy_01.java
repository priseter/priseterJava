package java05_array.copy;

public class ArrayCopy_01 {

	public static void main(String[] args) {

		// 기본 데이터 타입의 변수 값 복사하기
		int num1 = 100;
		int num2;
		
		//num1의 값이 num2에 복사 된다. 다만 num1값을 그대로 num2로 보내는 것이 아니라
		//num1의 값을 꺼내서 100으로 바꾼후에 num2로 넣는다.
		num2 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("------------------------------------------------");
		
		int[] arr1 = {10,20,30} ;
		int[] arr2;
		int[] arr3 = new int[5];
		// new를 하기 전에는 쓰레기 값이 저정되어 있다.
		
		System.out.println( arr1 );
//		System.out.println( arr2 ); //에러, 초기화 되지 않아서
		System.out.println( arr3 );
		// 아직 얕은 복사가 이뤄지지 않아서 주소 값이 다르게 나온다.
		System.out.println("------------------------------------------------");
		arr2 = arr1;
		arr3 = arr1;
		//** 얕은 복사, Shallow Copy
		// 모든 참조형이 일어날수 있는 상황
		// 참조 대상의 주소만 (참조값)만 복사되는 현상이다.
		// 실 데이터를 저장하고 있는 내부 공간이 복사되지 않는다.
		// 원본과 사본 이 모두 같은 메모리 주소를 참조하게 된다.
		
		
		for(int i = 0; i<arr2.length;i++ ) {
			System.out.println(arr1[i] + " : " + arr2[i] +" : " + arr3[i]);
		}
		System.out.println("------------------------------------------------");
		arr2[1] = 999;
		for(int i = 0; i<arr2.length;i++ ) {
		System.out.println(arr1[i] + " : " + arr2[i]);
		}
		System.out.println( arr1 );
		System.out.println( arr2 );
		System.out.println( arr3 );
		
		String copy1 = "Real?";
		String copy2;
		
		copy2=copy1;
		
		System.out.println( copy1 );
		System.out.println( copy2 );
		
		copy2 = "rEAL?";
		
		System.out.println( copy1 );
		
		String copy3 = new String("same");
		String copy4;
		
		copy4 = copy3;
		
		System.out.println( copy3 );
		System.out.println( copy4 );
		
		copy4 = "LLL";
				
		System.out.println( copy3 );		
		
	}
	// 참조형을 = 을 이용해서 대입하게 되면 그 수치를 복사해서 새로운 장소를 만드는 것이 아니라, 대입한 참조형이 있던 주소를 복사해서 가져온 것이 된다.
	// 따라서 위의 상황 처럼 하나의 참조형 값을 변경하면 나머지 모두 변하게 되는 것이다.
	// 새로운 공간을 만들기 위해선 새로운 new를 만들어서 반복문이나 다른 방법을 통해서 하나하나 수치값을 대입해줘야한다.
	// 위 같은 상황을 얕은 복사라고 한다.

}
