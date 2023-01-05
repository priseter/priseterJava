package java04_control.loop;

public class For_03 {

	public static void main(String[] args) {
		int num = 10;
		
		for(; num >=  1; num--) {
			System.out.println(num);
		} System.out.println("최종은 " + num);
		
		//반복횟수 : 10 ~ 1 10부터
		//반복구간 : 10번
		//최종 변수값은 0
		
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		//반복횟수 : 5번
		//반복구간 : 0,2,4,6,8
		
	}

}


