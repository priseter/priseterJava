package java12_exception;

import java.awt.image.ImagingOpException;
import java.io.IOException;

public class Exception_04_throw {

	public static void main(String[] args) {

		String str = null;
		
//		System.out.println(str.length());
		
//		System.out.println("문자열 길이 출력 후 ");
		
		
		if(str != null) {
			System.out.println(str.length());
		} else { //예외가 발생하는 경우
			System.out.println("문자열이 null 입니다.");
			
			//예외 객체를 직접 만들어서 던지는 코드
			// 예외 상황 발생 시키키
//			throw new NullPointerException(); //널포인트 익셉션이 발동해서 아래쪽 발동이 안됨
			//예외 발생시 프로그램 종료
		}
		System.out.println("if 구문 이후");
		
		System.out.println("----------------------------------------------------------------------");
		
////		System.out.println(90/0);
//		// 예외 정보 객체 생성
//		ArithmeticException ae = new ArithmeticException();
//		// ArithmeticException 산술적으로 불가능한 것을 오류로 표현한다. 70/0 같은것
//		
//		//예외던지기 ( 예외 발생시키기)
//		throw ae;
//		
//		//** 예외 객체를 생성(new)한다고 해서 예외를 발생(throw)시키는 것은 아나디.
//		// throw를 통해 던져지면 그때 예외가 발생한다.
		
		// 따라서 예외가 생성된 위치와 발생된 위치를 일치시키는 것이 좋다.
		// EU) throw를 던진 위치가 아니라 객체를 생성한 곳을 가리키기때문
//		throw new ArithmeticException();
		//---------------------------------------------------------------------------------------------------------------------
		try {
		throw new IOException();
		// Unhandle Exeption// 체크 익셉션이다.
		}catch (IOException e) {
			e.printStackTrace(); // 예외 상황 확인
			// 꼭 확인 하도록 하자! 예외가 발생했으면 어떻게 해결해야하는지를 고민해야한다!
			// e.printStackTrace() 를 사용하지 않으면 보이지가 않기 때문이다.
		}
		// 예외 상황을 핸들링 해서 밖으로 꺼내놓은 것이다.
		System.out.println("throw 이후");
		
		
		//----------------------------------------------------------------------------------------------------------------------
		// 아래 코드는 예외 변수를 밖에다가 한 것이다. 다만 체크드 익셉션이지만 밖에 변수 생성에는 오류가 생기지 않는다.
		//throw 하지 않았기 때문
		// 왠만하면 같이 붙여 쓰도록하자.
		IOException ie = new IOException();
		
		try {
			 throw ie;
			}catch (IOException e) {
				e.printStackTrace(); 
			}
			System.out.println("throw 이후");
	}
}
	


