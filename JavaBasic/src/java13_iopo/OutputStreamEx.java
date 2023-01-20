package java13_iopo;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
// 모니터 표준 출력 스트림 객체
		OutputStream os = System.out;
		
		byte[] buf = new byte[1024];
		int len = 0;
		//출력할 데이터
		buf[len++] = 'A';
		buf[len++] = 'p';
		buf[len++] = 'p';
		buf[len++] = 'l';
		buf[len++] = 'e';
		buf[len++] = '\n';
		
		try {
			//데이터출력
			os.write(buf,0,len);
			// 출력 버퍼 비우기
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally { 
			try { 
				if(os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
