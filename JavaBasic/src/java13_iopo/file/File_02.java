package java13_iopo.file;

import java.io.File;

public class File_02 {
	public static void main(String[] args) {
		
		File file1 = new File("C:\\Users\\user1\\git\\priseterJava\\JavaBasic\\src\\java13_iopo\\file\\Hello","Hello");
		
		System.out.println(file1.length());
		System.out.println(file1.exists());
		
		System.out.println(file1.isDirectory()); //폴더인지 확인
		System.out.println(file1.isFile()); //파일인지 확인
		
		System.out.println("----------------------------------------------------------------------");
		
		File file2 = new File("C:\\Users\\user1\\git\\priseterJava\\JavaBasic\\src\\java13_iopo\\file\\Hello");
		
		System.out.println(file2.length());
		System.out.println(file2.exists());
		
		System.out.println(file2.isDirectory()); //폴더인지 확인
		System.out.println(file2.isFile()); //파일인지 확인
	}

}

