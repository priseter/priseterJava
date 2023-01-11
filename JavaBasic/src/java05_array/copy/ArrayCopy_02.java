package java05_array.copy;

public class ArrayCopy_02 {

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
		
		int[] arr1 = {10,20,30} ;	// 원본
		int[] arr2;					// 사본
		
		//1. 데이터가 복사될 공간을 새롭게 생성한다.
		arr2 = new int[arr1.length];
		
//		//2. 데이터를 복사한다. - System.arraycopy() 메소드 이용
		
		
// 		System.arraycopy(src, srcPos, dest, destPos, length);
		// src : 원본 배열 이름
		// srcPos: 원본 배열에서 복사가 시작될 인덱스
		// desc : 사본 배열
		// destPos : 사본 배열세어 복사가 시작될 인덱스
		// length: 복사가 될 요소의 개수
		
		System.arraycopy(arr1, 0 , arr2, 0 ,arr1.length);
		
		
//		for(int i = 0; i <arr2.length; i++) {
//			arr2[i] = arr1[i];
//			System.out.println(arr2[0]);
//			System.out.println(arr2[1]);
//			System.out.println(arr2[2]);
//		}
		
	
		
		
		for(int i = 0; i<arr2.length;i++ ) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		System.out.println("------------------------------------------------");
		arr2[1] = 999;
		for(int i = 0; i<arr2.length;i++ ) {
		System.out.println(arr1[i] + " : " + arr2[i]);
		}
		System.out.println( arr1 );
		System.out.println( arr2 );
	}
	// 참조형을 = 을 이용해서 대입하게 되면 그 수치를 복사해서 새로운 장소를 만드는 것이 아니라, 대입한 참조형이 있던 주소를 복사해서 가져온 것이 된다.
	// 따라서 위의 상황 처럼 하나의 참조형 값을 변경하면 나머지 모두 변하게 되는 것이다.
	// 새로운 공간을 만들기 위해선 새로운 new를 만들어서 반복문이나 다른 방법을 통해서 하나하나 수치값을 대입해줘야한다.
	// 위 같은 상황을 깊은 복사라고 한다.

}
