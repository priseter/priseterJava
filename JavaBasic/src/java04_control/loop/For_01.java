package java04_control.loop;

public class For_01 {
	public static void main(String[] args) {

		//반복문, loop
		// for, while, do-while
		//--------------------------------------------------------------------------------------
		
		//for문, for loop
		
//		for(초기식;조건식;증감식) {
//			
//			//조건식이 참일때 실행하는 영역
//			//반복적으로 실행하는 영역
//		}
		//--------------------------------------------------------------------------
		
		int i;//반복 조절에 사용될 변수
		
		for(i=0;i<5;i++ ) {
			System.out.println("HI : " + i);
		} 
		//초기식 : i=0
		//조건식 : i<5 
		//증감식 : i++
		
		//for문 읽는 방법
		// i 변수가 0부터 시작해서
		// i 변수가 0보다 작은 동안
		// i 변수를 1씩 증가하면서
		//{중괄호 영역을 실행시킨다
		
		//ctrl shift "[" ,"]" 화면 분할
		
		//for 문 실행 순서
		// 1. 초기식 실행
		// 2. 조건식 판별
		// 	2-1. true일 때, 3번 항목 수행
		//  2-2. false일때
		// 3. {}중괄호 영역 실행
		// 4. 증감식 실행
		// 5. 2번부터 다시 실행
	}

}
