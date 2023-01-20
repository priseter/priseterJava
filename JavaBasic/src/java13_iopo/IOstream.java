package java13_iopo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOstream {

	public static void main(String[] args) {

		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte[] buf = new byte[1024]; //입출력 데이터의 임시 저장소
		int len = -1; // 입력 데이터의 길이
		
		
		
		
		try {
			//입력 데이터가 EOF가 될때까지 반복적으로 입력받는다.
			while ((len = in.read(buf)) != -1) {
				out.write(buf,0,len);
				out.flush(); // 출력 버퍼 비우기
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {if(in!=null)
				in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			try {if(out!=null)
				out.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
