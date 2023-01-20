package java13_iopo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileStore;
import java.util.ArrayList;

public class IO {

	public static void main(String[] args) {

		//키보드 표준 입력 스트림 객체
		
		InputStream is = System.in;
//		byte[] arr = new byte[10];
//		try {
//			is.read(arr);
//			for (int i = 0 ; i < arr.length; i++) {
//			System.out.println(arr[i]);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	//--------------------------------------------------------------------------------	
		byte[] buf = new byte[10];
		
		int len = -1;
		
		//입력할 전체 문자열을 저장할 객체
		StringBuilder sb = new StringBuilder();
		// 입력한 전체 문자열의 길이
		int total = 0;
		
		try {
			System.out.println("입력 대기중");
			while((len = is.read(buf)) != -1) {
				//입력받은데이터 byte[]을 String으로 변환
				String data = new String(buf,0,len);
//				System.out.println("입력 받은 데이터 : " + data);
//				System.out.println("입력 받은 데이터 : " + new String(buf));
//				System.out.println(len + "바이트 입력받음");
				// 키보드 스트림의 EOF 입력
				// 윈도우 : ctrl + z
				// 맥OS : command + d
				
				// read()가입력받은 전체문자열을 StringBulider에 추가한다.
				sb.append(data);
				// read()가 입력 받은 전체문자열의 길이를 total에 추가한다.
				total += len;
			}
			
//			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null) {is.close();
				
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\n입력 데이터");
		System.out.println(sb);
		System.out.println("\n 입력받은 데이터의 전체 길이");
		System.out.println(total);
		
	//-------------------------------------------------------------------------------------
		
		
	}

}
