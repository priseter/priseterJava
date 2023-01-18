package java11_generic;

class Class03{
	// 일반메소드 -><T>적용 -> 제네릭 메소드
	public <T> void display(T num) {
		T data;
	}
	
	public <T> T out (T obj) {
		T data = obj;
		return data;
	}
}

public class Generic_03_GenericMethod {

	public static void main(String[] args) {
		//일반 클래스 생성
		Class03 cl = new Class03();
		
		//타입 파라미터를 결정하지 않고 호출
		// -> 매개변수 전달인자의타입을보고 Integer로 자동결정
		cl.out(12345);
		System.out.println(cl.out(12345));
		//------------------------------------------------------------------------------
		cl.<Double>out( 100.0 );
		System.out.println(cl.<Double>out( 5.76));
		
		cl.<String>out( "sam" );
		System.out.println(cl.<String>out( "sam" ));
	}

}
