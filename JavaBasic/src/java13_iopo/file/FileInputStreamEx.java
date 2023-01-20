package java13_iopo.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		
		// 절대 경로 표기법
		// -> root가 되는 드라이븐 문자부터 파일(폴더)의 경로를 나타내는것
		
		// 상대 경로 표기법
		// -> 상대적인 기준점을 출발위치로 삼아 경로를 나타내는것
		
		//-> .으로 표현하며 시작한다.
		// -> 프로그램이 시작된 위츠를 기준으로 잡는다.
		
		//** 클래스 패스, classㅔㅁ소
		//-> 프로그램이 시작된 위치
		
		File file = new File("./src/java13_iopo/file/","input");
		//절대경로를 쓰면 모든 컴퓨터 경로가 같아야한다.
		// 운영체제는?
		
		// 파일의 존재여부 확인 
		if(!file.exists()) {
			System.out.println("없어요~");
			return; // 메인 메소드의 중단 - > 프로그램 중단.
		}
		//---------------------------------------------------------------------------------------
		
		byte[] buf = new byte[1024];
		int len = -1;
		
		StringBuilder sb = new StringBuilder(); // 입력 데이터 최종 저장소
		
//		FileInputStream fis = null;
		
//		try {
//			fis = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			if(fis!=null) { 
//				try {
//					fis.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
		
		try(FileInputStream fis = new FileInputStream(file)){
			while((len=fis.read(buf)) != -1) {
				sb.append(new String(buf,0, len));
			}
			
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch(/* FileNotFoundException e1 |*/ IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("입력된 데이터");
		System.out.println(sb);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
			FileWriter wr = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
