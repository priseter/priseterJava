package test;

import java.util.Scanner;

public class Login_02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String RightID = "priseter"; // 올바른 아이디를 변수 저장
		String RightPS = "fhrekdns123"; // 올바른 비밀번호를 변수로 저장
		String ID; // 입력 값을 저장할 변수
		String PassWord; // 입력 값을 저장할 변수
		
		System.out.println("아이디를 입력하시오.");
		
		ID = in.nextLine(); // 아이디 입력
		
		if(ID.equals(RightID)) {  // 아이디가 맞았을 경우 비밀번호 입력 하도록 하는 명령문
			System.out.println("비밀번호를 입력하시오.");
			PassWord = in.nextLine(); // 비밀번호 입력
			System.out.println(PassWord.equals(RightPS) ? "로그인에 성공하셨습니다." :"로그인에 실패하셨습니다.");
			}
		
		else {
			System.out.println("아이디가 틀렸습니다.");
			}
		in.close();
		
	}
}
