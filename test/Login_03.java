package test;

import java.util.Scanner;

	public class Login_03 {
		public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			
			String RightID = "priseter";
			String RightPS = "fhrekdns123";
			String ID;
			String PassWord;
			
			System.out.println("아이디를 입력하시오.");
			
			ID = in.nextLine();
			PassWord = in.nextLine();
			
			boolean success = (ID.equals(RightID) && (PassWord.equals(RightPS)));
			
			System.out.println(success ? "로그인에 성공하셨습니다." : "로그인에 실패하셨습니다." );
			
			
			in.close();
		}
	}
