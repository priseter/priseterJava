package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
		
		//반복횟수 : 15
		//반복구간 : 0 ~ 14

		int total = 0;
		for(int day = 1, money = 10; day<=15; day++, total += money, money *= 2);
		
	System.out.println(total);
			
	}

}
