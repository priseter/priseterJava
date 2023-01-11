package java06_class.overloading;

public class Overloading {
	// 멤버 필드
	private int x;
	private int y;
	
	// 멤버메소드
	
	public void display() { //멤버 필드 x,y를 콘솔에 출력하는 기능
		System.out.println("(" + x + ")"+"("+ y +")");
		}
//	public void display(int a,int b) { //멤버 필드 x,y를 콘솔에 출력하는 기능
//		System.out.println("(" + y + ")"+"("+ x +")");
//		}

	// 멤버 필드 x, y에 값을 저장하고, 콘솔에 출력하는 기능
	public void display(int x,int y) { 
		this.setX(x); // == this.x = x;
		this.setY(y); // == this.y = y;
		display();
		}
	
	//-------오버로딩 테스트 메소드----------
	public void display(int num) {}
	public void display(double num) {}
	public void display(int num,String data) {}
	public void display(String data,int num) {}
		
//	//에러 (25라인), 매개변수의 이름이 달라도 자료형이 같으면 오버로딩 x 
//	public void display(int num2) {}
	
//	//에러 (26라인), 접근제한자가 달라도 오버로딩 X
//	private void display(double num) {}
	
//	//에러 (10라인), 반환타입이 달라도 오버로딩 X
//	public int display() {
//		return 0;
//	}
	
	
	// Getters,Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
