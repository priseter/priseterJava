package java13_iopo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream_02 {
	public static void main(String[] args) {
		
		byte[] buf = new byte[1024];
		int len = -1;
		
		try( InputStream in = System.in; OutputStream out = System.out){
			while ((len = in.read(buf)) != -1) {
			out.write(buf, 0, len);
			out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
