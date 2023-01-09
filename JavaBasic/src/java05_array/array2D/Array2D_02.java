package java05_array.array2D;

public class Array2D_02 {

	public static void main(String[] args) {

		//1차원 배열의 선언과 동시에 초기화
		int[] arr1D = {1,2,3,4,5};
		
		//2차원 배열의 선언과 동시에 초기화
		
		int[][] arr2D = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(arr2D);
		// -> 3행 3열의 2차원 배열 생성
		// -> 3x3배열, 3 by 3 array
		//------------------------------------------------------------------------------------------------------------
		
		for(int i = 0; i<3 ; i++) {//i행 , 0~2
			for(int j =0; j<3; j++) {
				System.out.print(arr2D [i][j]+" ");
				
			}
			System.out.println();
		}
		
		//---------------------------------------------------------------------------------------------------------------
		arr2D = new int[5][4];
		System.out.println(arr2D);
		
		for(int i = 0; i<5 ; i++) {//i행 , 0~2
			for(int j =0; j<4; j++) {
				System.out.print(arr2D [i][j]+" ");
			}
			System.out.println();
		
		//new로 만들어진 공간을 GC 가비지 콜렉터가 관리한다. [[I@1e81f4dc에 저장되던 arr2D 값을 새로 new로 지정해서 [[I@5ccd43c2로 이동했기때문에
		//이전에 3,3짜리 공간은 사라진다.
		
		
		}

	}
}
