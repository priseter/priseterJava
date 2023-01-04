package java03_scanner;

import java.util.Scanner;

//import 선언코드
// -> 현재 소스코드에서 Scanner라는 이름으로 java.util.Scanner를 대신 선택해서 사용하겠다.

public class Scanner_01 {

	public static void main(String[] args) {
		
		//class Scanner
		// 스캐너 클래스
		
		// 키보드로 입력한 내용을 프로그램 데이터로 가져오는 기능 클래스
		
		// 입력 기능 클래스
		
		//--------------------------------------------------------------------------------------

		// 기본형 변수 사용법
		int num; //int 형 변수 선언
		num = 123; //int형 데이터 대입
		//----------------------------------------------------------------------------------------
		
		//참조형 변수 선언
		java.util.Scanner input;
		
		Scanner in;
		
		//Organize Import : ctrl + shift + o
		// -> 임포트 최적화
		
		//참조형 변수 사용법
		// [클래스명][변수명]; //참조형 변수 선언
		// [변수명] = new [클래스명] ([필요한 데이터]); //객체 생성 (클래스 기능을 활성화)
		// Scanner는 필요한 데이터가 필수
		
//		Scanner sc; // 입력 기능 Scanner 변수 선언 (참조형)
//		sc = new Scanner( System.in ); // 입력 기능을 활성화 (객체 생성) (System.in - 키보드)
		
		Scanner sc = new Scanner( System.in );
		Scanner st = new Scanner( System.in );
		
		//자원 반납(해제); - 연결해서 사용하던 키보드의 사용 종료를 알린다.
		// 대부분 자원반납을 해야하지만 키보드는 안해도 크게 상관이 없다.
//-------------------------------------------------------------------------------------------------------
		System.out.print("숫자 입력하세요 : ");
		
		int data = sc.nextInt();
		
		System.out.println("입력된 값 : " + data);
		

		String str = st.nextLine();
		System.out.print(str);
		
//-------------------------------------------------------------------------------------------------------
		
		System.out.print("실수값 입력 : ");
		System.out.println("입력된 실수값 : " + sc.nextDouble());
		
		sc.close();
		st.close();
	
	}

}
