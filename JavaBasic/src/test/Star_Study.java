package test;

public class Star_Study {

	public static void main(String[] args) {

		for(int i = 0; i<5 ; i++ ) {
			//반복횟수 : 5번 0,1,2,3,4
			//반복구간 : 0~4
			System.out.println("*");//줄을 바꾼다.
		}
		System.out.println("---------------------------------------------------------------------------");
		for(int i = 0; i<5 ; i++) { // i가 참일 경우에 실행한다.
			//반복횟수 : 5번 0,1,2,3,4
			//반복구간 : 0~4
			for(int j = 0; j<5 ; j++) {
				//반복횟수 : 5번 0,1,2,3,4
				//반복구간 : 0~4
				System.out.print("*"); // j가 충족될때까지 *을 출력한다.
			}
			System.out.println(); // j가 5가 되면 빠져나와 줄을 바꾼다. i가 참인지 거짓인지 다시 진행하러 이동한다.
			
		}System.out.println("---------------------------------------------------------------------------");
		
		for(int i = 0; i<5 ; i++) {
			//반복횟수 : 5번 0,1,2,3,4
			//반복구간 : 0~4
			for(int j = 0; j-1<i; j++) {
				//반복횟수 : 등차수열로 1번 반복에서 5번 반복까지 늘어난다.
				//반복구간 : -1 1번에서 -1,0 두번 ....... -1,0,1,2,3 까지 진행한다.
				System.out.print("*");
			}System.out.println();
		}System.out.println("---------------------------------------------------------------------------");
		
		for(int i = 1; i<=5; i++) {
			//반복횟수 : 등차 수열로 5번 반복에서 1번 반복까지 줄어든다.
			//반복구간 : 5,4,3,2,1에서 4,3,2,1로 4번 .......... 1까지 진행한다.
			// 0이 되면 진행을 멈추고 나간다.
			for(int j = 5; j>=i; j--) {
				System.out.print("*");
				
			}System.out.println();
			
		}System.out.println("---------------------------------------------------------------------------");
		for(int i = 0; i<=4; i++) {
			//반복횟수 : 0,1,2,3,4
			//반복구간 : 5번
			
		
			for (int j = 0 ; j < i ; j++ ) {
				System.out.print(" ");
			}
			for (int j = 5; j>i ; j--) {
				System.out.print("*");
			}System.out.println();

		} System.out.println("---------------------------------------------------------------------------");
		
		for(int i = 0; i<=4 ; i++ ) {
			//반복횟수 : 0,1,2,3,4
			//반복구간 : 5번
			for (int j = 5; j>i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j<=i; j++  ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------");
		
		for(int i = 0; i<=4 ; i++) {
			//반복횟수 : 0,1,2,3,4
			//반복구간 : 5번
			for (int j = 0; j<=i ; j++) {
				System.out.print("*");
			}
			for (int j = 5; j>i ; j--) {
				System.out.print(" ");
			} System.out.println();
		}
		for(int i = 0; i<=3; i++) //i = 0
		{			
			for (int j = 3; j>=i ; j--) {
				System.out.print("*");
			}System.out.println();
			
		}
			
	}
		
}


