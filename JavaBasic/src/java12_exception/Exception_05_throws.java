package java12_exception;

import java.io.IOException;

class ThrowTest{
	//ucchecked
	public void method() throws NullPointerException {
		//메인 쪽으로 떠넘김
		//ucchecked
		throw new NullPointerException();
		
	}
	//cheaked
	public void method2() throws IOException {
		//메인 쪽으로 떠넘김
		//cheaked
		throw new IOException();
		
	}
	
	
}

public class Exception_05_throws {

	public static void main(String[] args) {

		// throws 키워드
		// 예외 처리에 대한 책임을 떠넘긴다.
		
		ThrowTest tt = new ThrowTest();
		//tt.method(); 오류안뜸 uncheak니까
//		try {
//			tt.method();
//			
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
		//tt.method2();
		
		try {
			tt.method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	System.out.println("프로그램 종료");
	}

}
