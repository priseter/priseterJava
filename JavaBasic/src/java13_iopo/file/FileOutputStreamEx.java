package java13_iopo.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileOutputStreamEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("./src/java13_iopo/file/","output");
		
		try(FileOutputStream fos = new FileOutputStream(file,true)){ //추가모드
			//FileOutputStream fos = new FileOutputStream(file) 쓰기모드
			//** 파일 출력 스트림 객체는 객체 생성될 때 출력 대상 파일이 없으면 생성해버린다.
			
//			String msg = "Orange";
//			fos.write(msg.getBytes(),0,msg.length());
//			fos.flush();
//			System.out.println();
			String re = sc.nextLine();
			fos.write(re.getBytes(),0,re.length());
			fos.flush();
			sc.close();
			
		}catch (FileNotFoundException e) { // 생성자
			e.printStackTrace();
		}catch (IOException e) { //.close() 꺼
			e.printStackTrace();
		}

	}

}
