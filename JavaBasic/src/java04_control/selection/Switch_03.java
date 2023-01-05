package java04_control.selection;

public class Switch_03 {

	public static void main(String[] args) {

		//switch의 비교대상은 정수로 표현 가능해야만 한다.
		//---------------------------------------------------------------------
		
//		double d = 3.14;
//		switch (d) {
//		}
//		boolean b = true;
//		switch (b) {
//		}
		char alpha = 'B'; // char형은 정수값 ASCII CODE로 처리한다.
		switch (alpha) {
		case 'A':
			System.out.println("A에요");
			break;
		case 'B':
			System.out.println("B에요");
			break;
		}
		//---------------------------------------------------------------------
		// switch에서 String타입 사용 가능하다.
		// JDK 1.7 이상 사용이 가능하다.
		String str = "Banana";
		
		str = new String("Banana");
		
		switch (str) {
		case "Apple":
			System.out.println("사과");
			break;

		case "Banana":
			System.out.println("바나나");
			break;
		}
		str = new String("Banana");
		
		System.out.println( str );
		
		if( str == "Banana") {
			System.out.println("if == 바나나"); //--> 같은 글자이지만 false 여서 출력 되지 않는다. 
			// ==는 위치가 같은 곳에 들어 있는가를 묻는 것이다. 
			// 따라서 참조형인 string을 비교할때는 ==을 사용해서 안된다.
			// 이유는 String str = "java" 와 str = new String("java")는 같은 str을 사용하지만 저장된 위치가 달라서
			//( 전자는 java가 만든 데이터) (후자는 따로 지정한 데이터) 위치를 사용한다.
			// 같은 위치임을 확인하는 동등 연산자는 거짓으로 판명한다. 하지만 글자는 같기때문에 .equals는 글자
			// 하나하나를 비교해서 참거짓을 판별하기에 어느 위치던 같은 글자면 동일하다고 판단한다.
		}
		if(str.equals("Banana")) {
		System.out.println("if는 바나나");
		}
		
		
	}

}
