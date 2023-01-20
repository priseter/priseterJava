package java13_iopo;

import java.io.IOException;
import java.io.OutputStream;

public class TryWithResources {

	public static void main(String[] args) {
		
		// try - with - resources 구문
		// 예외처리구문
		//try -catch

		//JDK 1.7 추가
		
		
		// ->입출력 객체를 사용할 때 finally 블록을 이용한 close호출을
		//구문에서 자동으로 대신 처리해준다.
		
		//->try키워드에()괄호를 적용한다.
		//-> ()괄호에는 입출력 객체를 선언한다.
		//-> try{}블록이 종료된 이후에 객체를 자동으로 close() 한다
		
		// -> Autocloseable interface의 동작이다.
		
		byte[] buf = "AppleBananaCherry".getBytes();
		int len = -1;
		
		try(OutputStream out = System.out) {
			out.write(buf, 0, len);
			out.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
