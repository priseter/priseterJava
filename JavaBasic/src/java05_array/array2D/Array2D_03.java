package java05_array.array2D;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array2D_03 {

	public static void main(String[] args) {

		int[][] arr;
		
		arr = new int [3][]; // = int [] ar; int [] ar2; int [] ar3;
		
		System.out.println(arr[0]);
		
		for(int i = 0; i<3; i++) {			//(int[]타입) 의 배열 생성
			System.out.println(arr[i]);
		}
		arr[0] = new int[8];				//(int타입)의 배열 생성
		arr[1] = new int[3];				//(int타입)의 배열 생성
		arr[2] = new int[2];				//(int타입)의 배열 생성
		//-----------------------------------------------------------------------------------------------------------
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		System.out.println("-----------------------------------------------------");
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
