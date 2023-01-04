package java04_control.condition;

public class InElse_03 {

	public static void main(String[] args) {

		int num = 101;
		
		if( num> 0 && num<=100 ) {
			System.out.println("num과 1~100사이의 정수");
			
		}
		
		System.out.println("----------------------------------------------");
		if (num > 0) { // 아래쪽 if else의 전제 조건으로 작용
			System.out.println("0보다 크다");
			// 아래의 if 문은 위쪽 if의 전제 조건을 충족해야함으로 0보다 큰 수 일때 작동한다는 조건을 기본으로 가지게 된다.
			if(num<=100) {
			System.out.println("100보다 작거나 같다.");
			}
			
		}else { // 아래쪽 if else의 전제 조건으로 작용
			System.out.println("0보다 크지 않다.\n" + "0과 같거나 작다.");
			// 아래의 if else 문은 위쪽 else의 전제 조건을 충족해야함으로 0보다 작거나 같은 0<=num의 조건을 기본으로 가지게된다
			if(num == 0) {
				System.out.println("0과 같다");
			} else {
				System.out.println("0보다 작다.");
			}
		}
	}
		

}
