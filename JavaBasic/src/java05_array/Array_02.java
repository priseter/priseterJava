package java05_array;

public class Array_02 {

	public static void main(String[] args) {

		int[] arr1; // 배율 변수 선언
		arr1 = new int[5]; // 배열 공간 생성
		// 원래 변수를 선언하면 그 변수안에 쓰레기값이 들어가있는데, new를 이용해 공간이 생성된 변수들은 쓰레기값을 가지지않고 자동으로 초기화한다.
		// 따라서 arr[] 값에는 0이 들어간다.
		
		int[] arr2 = new int[7];
		
		for(int i=0; i<7; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3 = {1,2,3,4};
		
		//-------------------------------------------------------------------------
//		arr3 = {5,6};
		// 에러,배열 초기화는 선언때만 사용할 수있다.
		
		char[] chArr = {'a','p','p','l','e'};
		double[] dArr = {1.1, 2.2, 3.3};
		boolean[] bArr = {true,false,false,false}; // 이걸로 사다리게임이나 오징어게임 징검다리 만들 수 있을지도?
	}

}
