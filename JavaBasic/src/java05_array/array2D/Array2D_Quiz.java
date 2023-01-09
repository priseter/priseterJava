package java05_array.array2D;

import java.util.Scanner;

public class Array2D_Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[][] student = new int[2][4]; // 2명의 학생, 3개의 점수
		double[] avg = new double[2];
		
//		int[] sum = new int[2];
//		
//		double[] avg = new double[2];
		
		//2명에 대한 3과목 점수 입력
		String[] sub = {"국어","영어","수학"};

		
		for(int i = 0; i<student.length ;i++) {
			for(int j=0; j<student[i].length-1; j++){
				System.out.println((i+1) +"번의" + sub[j] + " 점수는?");
				student[i][j] = sc.nextInt();
				student[i][3] += student[i][j];	
				avg[i] = student[i][3]/3.0;
			}
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i<student.length ;i++) {
			System.out.print((i+1)+"\t");
			for(int j=0; j<student[i].length; j++){
				System.out.print(student[i][j]+"\t");
			}System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
		
	
				
	}

}
