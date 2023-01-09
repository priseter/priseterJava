package java05_array.srot;

import java.util.Arrays;

public class BubbleSort_Answer {
	public static void main(String[] args) {
		
		//버블정렬
		
		int[] arr = {500, 6 ,3, 2, 5, 4, 1, 10 , 100, 13 };
		final int tri = arr.length - 1;

		//--- 원본 출력 ---
		System.out.println("--- 정렬 전 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println();
		//--- 버블 정렬 수행 --- (구현!)

//		int[] arr2 = new int[5];  
		
		for (int i = 0; i <tri; i++ ) {
			// 인접한 두 요소를 비교하고 왼쪽이 작으면 스왑
			
			for (int j = 0 ;j < tri; j++ ) {
				int save = 0;
//				if (arr[j] > arr[j+1]) {	//오름 차순
				if (arr[j] < arr[j+1]) {	//내림 차순
					//스왑코드
					save = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = save;
					save = 0;
				}
				
			}		
			
		
		}
		
		System.out.println();
		
		//--- 결과 출력 ---
		System.out.println("--- 정렬 후 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		
		System.out.println("----------------------------------------------------------------------");
		
		int[] arr2 = {5,45,457,618,816,422};
		
		System.out.println( Arrays.toString(arr2)); //배열
		
		//정렬
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2)); //오름 차순 정렬
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
