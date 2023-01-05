package java04_control.loop;

public class While_03 {

	public static void main(String[] args) {

		int dan = 2;
		while(dan<=9) {
			int i = 1;
			while(i <= 9) {
				System.out.println(dan+" x " +i+" = "+(dan*i));
				
				
				
				i++;
			}System.out.println();
			dan++;
		}
		
	}

}
