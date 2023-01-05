package java04_control.loop;

public class BreakContinue_01 {

	public static void main(String[] args) {

		//break;
		//continue;
		//	반복문 또는 switch 구문에서 사용가능
		// if, else if ,if else는 중단 불가
		
		if( true ) {
			System.out.println("Hi");
			
//			break; - 에러 코드. 반복문이나 switch 없이 사용불가
			System.out.println("Hello");
			
		}
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		//---------------------------------------------------------------------------------------------
		// 중첩된 제어문에서 break를 사용하면 가까운 블록의 제어문 한 개만 중단한다
		// -> 바깥쪽 for문 중단할 수 없음
		
		for(int i = 0; i<5; i++) { //i, 0~4, x5
			for(int j =0; j<5; j++) {//j, 0~4, x5
				
//				if(i>=2) {
//					break;
//				}
				if(j>=2) {
					break;
				}
				
				
				System.out.println("i:"+ i +", j"+ j);
	
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------");
		//---------------------------------------------------------------------------------------------
		
		//continue;
		//	반복문에서만 사용 할 수 있는 제어문

		// 현재 진행중이던 반복코드{} 를 중단하고 다음 반복으로 수행하게됨
		// 반복문에 남은 중괄호코드 남은부분을 1번 건너뛴다.
		
		//for 문에서는 증감식으로 간다
		//while문에서는 조건식으로 간다.
		
		for( int i = 0; i<10; i++) {
//			System.out.println( i ); (이렇게 쓰면 의미 없는 코드)
			if(i%2 == 0) { //짝수일 때
				continue;
			}
			
			System.out.println( i );
		}
	}

}
