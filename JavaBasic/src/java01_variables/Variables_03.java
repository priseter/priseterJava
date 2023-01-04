package java01_variables;

public class Variables_03 {

	public static void main(String[] args) {
		
		int number;
		// -> 변수를 처음 선언하면 "쓰레기값"이 저장되어 있다.
		// 초기화는 변수가 할당된 메모리에 쓰레기값을 지우고 변수에 값이 있다는 것을 알려준다.
		// 자바는 C언어와 다르게 쓰레기값을 출력하지 못하고 에러가 발생한다.
		// initialize - 초기화 변수대입
			
		number = 123;
		
		System.out.println(number);
		System.out.println("--------------------");
		
		// 클릭 한번하고 드래그 - 글자단위, 클릭 두번하고 드래그 - 단어 단위, 클릭 세번하고 드래그 - 줄단위
		
		int number2 = 787; //선언과 동시에 초기화
		// 따로 초기화를 진행할 시엔 변수 선언과 초기화 사이에 다른 코드가 들어갈 수 있지만
		// 선언과 동시에 초기화는 그럴 여지를 주지 않는다.
		
		System.out.println(number2);
		
		
	}
}
