package java06_class.constructor;

import java.util.Scanner;

// 기능 클래스
class Constructor_01{
	
	//멤버 필드
	private int num1 = 11;  //초기값 11
	private int num2 = 22;  //초기값 22
	// 디폴트 생성자
		// 매개변수가 없는 생성자
		// setter,getter 같은 경우에는 디폴트 생성자를 사용한다. 따라서 생성자를 만드는 경우에는
		// 대부분 디폴트 생성자를 생성한다.
	public Constructor_01(){
		System.out.println("디폴트 생성자");
		
		System.out.println();
		System.out.println("---생성자 코드 실행 전----" );
		display();
		
		//멤버 필드 초기화
		this.num1 = 55;  
		this.num2 = 66;
		System.out.println("---생성자 코드 실행 후----" );
		display();
	}
	//생성자 오버로딩
	public Constructor_01(int num1, int num2){
		System.out.println("---매개변수 있는 생성자 코드 실행 후----" );
		
		//매개 변수로 멤버필드 모두 초기화 하기
		this.num1 = num1;
		this.num2 = num2;
	}
	public void display() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	
	}
	
}
// 이런식의 클래스 생성은 눈으로 보기 힘들기 때문에 하지않는 것이 올바르다.

// 실행 클래스
public class ConstructorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double k = 3.12;
		
		Constructor_01 cons1 = new Constructor_01(); // ();에 아무것도 입력하지 않았으니 생성자를 자동으로 호출한다.
		cons1.display();
		
		System.out.println("-------------------------------------------------------------------");
		
		Constructor_01 cons2 = new Constructor_01(100,200);
		cons2.display();
		System.out.printf("%.3f\n",k);
		
		System.out.println("-------------------------------------------------------------------");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Constructor_01 cons3 = new Constructor_01(a,b);
		cons3.display();
		sc.close();
	}
	

}
