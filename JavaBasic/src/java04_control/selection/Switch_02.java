package java04_control.selection;

public class Switch_02 {

	public static void main(String[] args) {

		int num = 30;
		
		if( num==10) {
			System.out.println("10이다.");
			
		} else if( num==20){
			System.out.println("20이다.");
			
		} else if( num==30){
			System.out.println("30이다.");
			
		} else {
			System.out.println("10, 20, 30 모두 아니다.");
			
		}
		
		//---------------------------------------------------------------------------------------
		
		int score = 88; // 점수
		
		if (score>=90) {
			System.out.println("A등급");
		} else if( score>= 80) {
			System.out.println("B등급");
		} else if( score>= 70) {
			System.out.println("C등급");
			
		}
		
		//switch는 범위비교를 할 수 없다 -> if 문을 사용한다.
		
		//---------------------------------------------------------------------------------------
		switch( score/10 ) {
		case 10 : 
		case 9 :
			System.out.println("A등급");
			break;
		case 8 :
			System.out.println("B등급");
			break;
		case 7 : 
			System.out.println("C등급");
			break;
		}
	}
}


