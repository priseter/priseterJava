package test;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String RightID = "priseter";
				
		String ID; 
//		int Password;
		
		System.out.println("아이디를 입력하시오");
		
		ID = in.nextLine();
//		Password = in.nextInt();
		
		System.out.println(ID.equals(RightID) ? "로그인에 성공하셨습니다." : "로그인에 실패하셨습니다.");
//		System.out.println(Password == 19981018  ? "로그인에 성공하셨습니다." : "로그인에 실패하셨습니다.");
		
		
		
		
	}
	

}
