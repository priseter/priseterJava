package java13_iopo.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_01 {

	public static void main(String[] args) {

		//class File
		//	->파일의 정보를 관리하는 클래스
		
		//  ->파일의 내용물을 관리하는 클래스
		
		//  ->파일의 경로(위치, path)와 이름을 저장하고 있다.
		
		//  ->파일 입출력 스트림의 대상 입출력 장치로 지정할 수 있다.
		
		//--------------------------------------------------------------------------------------
		
		File file = new File("C:\\Users\\user1\\git\\priseterJava\\JavaBasic\\src\\java13_iopo\\file\\Hello","Hello");
		
		System.out.println(file.length()); // 파일 크기
		System.out.println(file.exists()); // 존재하는파일인지 확인
		
		System.out.println(file);
		
		try {
			FileWriter filew = new FileWriter("C:\\Users\\user1\\git\\priseterJava\\JavaBasic\\src\\java13_iopo\\file\\Hello");
			
			filew.append('a');
//			filew.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
