package java04_control.loop;

public class While_02 {

	public static void main(String[] args) {
		
//		초기식; // while 구문 시작전에 작성
//
//		while( 조건식 ) { // while구문의 ()괄호 안에 작성한다.
//			(코드 실행 전에 증감)증감식;
//			
//			//조건식이 참일때 실행할 코드
//			
//			(코드 실행 후에 증감)증감식; [여기에 증감을 쓰면 for문과 같다.]
		
		//----------------------------------------------------------------------------------------
		
		for(int i = 0; i<10; i++) {
			System.out.println( i );
		}
		int j = 0;
		while (j<10) {
			System.out.println(j);
			
			
			
			j++;
		}
		//for문은 반복 횟수가 정해져 있거나 정수값의 반복을 적용할 때 사용한다.
		//while문은 반복횟수가 명확하지 않거나, 정해지지 않았을 때 사용한다.
//			-> 반복 종료 조건만 주어진 경우 많이 사용한다.
	}

}
