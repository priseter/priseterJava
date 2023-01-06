package java05_array.srot;

public class BubbleSort_Answer {
	public static void main(String[] args) {
		
		//버블정렬
		
		int[] arr = { 6 ,3, 2, 5, 4, 1 };
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
		int save = 0;
		
		
		for (int i = 0; i <tri; i++ ) {
			for (int j = 0 ;j < tri; j++ ) {
				if (arr[j] > arr[j+1]) {
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
	}

}
