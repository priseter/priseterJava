package test;

import java.util.Scanner;

public class Login_02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String RightID = "priseter";
		String RightPS = "fhrekdns123";
		String ID;
		String PassWord;
		
		System.out.println("아이디를 입력하시오.");
		
		ID = in.nextLine();
		
		if(ID.equals(RightID)) { 
			System.out.println("비밀번호를 입력하시오.");
			PassWord = in.nextLine();
			System.out.println(PassWord.equals(RightPS) ? "로그인에 성공하셨습니다." :"로그인에 실패하셨습니다.");
			}
		
		else {
			System.out.println("아이디가 틀렸습니다.");
			}
		in.close();
		
	}
}
