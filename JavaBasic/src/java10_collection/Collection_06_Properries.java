package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Collection_06_Properries {

	public static void main(String[] args) {

		Properties prop = new Properties();
		Scanner sc = new Scanner(System.in);
		
		//put() 메소드를 이용하여 Properties의 고유한 특성을 이용하지 않는다.
//		prop.put("A", 100);
//		prop.put(true, 3.456);
//		System.out.println(prop);
		
		//setProperty(), getProperty()를 아용하여
		// 문자열 (String)타입의 키-값을 관리한다.
		prop.setProperty("A","100");
		System.out.println("A : " + prop.getProperty("A"));
		prop.setProperty("username","Alice");
		prop.setProperty("password","Ali12345");
		System.out.println(prop);
		
		System.out.println("-----------------------------------------------------");
		
		// 파일 출력  객체
		
		FileWriter writer = null;
		
		try{ 
			//파일출력스트림생성 (파일이 없으면 파일을 생성한다.)
			writer = new FileWriter("C:\\Users\\user1\\git\\priseterJava\\JavaBasic\\src\\java10_collection\\user.properties");
//			while(!sc.next().equals("stop")){ System.out.println("이름, 비번을 입력하세요.");
//			prop.setProperty(sc.next(), sc.next());
//			System.out.println("끝내려면 stop을 입력하시오.");
//			}
			
			prop.store(writer, "Comment: USer Information");
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------------------");
		FileReader reader = null;
		
		Properties test = new Properties();
		try {
			reader = new FileReader("C:\\Users\\user1\\git\\priseterJava\\JavaBasic\\src\\java10_collection\\user.properties");
			System.out.println("불러오기 전 : " + test);
			test.load(reader);
			System.out.println("불러오기 후 : " + test);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("-----------------------------------------------------");
		
		Properties sysProp = System.getProperties();
		
		System.out.println("\n-----------------자바정보--------------------------");
		System.out.println(sysProp.getProperty("java.version"));
		System.out.println(sysProp.getProperty("java.vendor"));
		
		System.out.println("\n-----------------OS버전--------------------------");
		
		System.out.println(sysProp.getProperty("os.name"));
		System.out.println(sysProp.getProperty("os.version"));
//		System.out.println(Integer.parseInt(sysProp.getProperty("os.version")));
		
	}

}
