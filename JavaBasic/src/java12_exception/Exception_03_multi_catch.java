package java12_exception;

public class Exception_03_multi_catch {

	public static void main(String[] args) {
		try {
			//try 블록
			// 예외 발생이 예측된 코드를 작성한다.
			
		} catch (NullPointerException e) {
			//catch 블록
			//NullPointerException 예외 발생 시 예외 처리하는 코드를 작성한다.
		} catch (ArrayIndexOutOfBoundsException e) {
			//catch 블록 
			//ArrayIndexOutOfBoundsException 예외 발생 시 예외 처리하는 코드를 작성한다.
		} catch (Exception e) {
			//catch 블록
			// NullPointerException, ArrayIndexOutOfBoundsException의
			// 이외의 예외 발생 시 예외 처리하는 코드를 작성한다
		}
		//--------------------------------------------------------------------------------------------------------
		// 다중 예외 처리 (Multi Catch)
		// -> 하나의 catch 구문에서 예외 클래스를 여러개 적용하는 문법
		// -> JDK 1.7 부터 지원
		
		try {
			
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException | NullPointerException e) {
//			NegativeArraySizeException
//			ArrayIndexOutOfBoundsException
//			NullPointerException
			
			// 위 셋 예외 상황을 처리하는 구문 작성
		}
	}

}
