package java04_control.loop;

public class LabledBreak {

	public static void main(String[] args) {

		OuterLoop:
		for(int i = 0; i<5; i++) {
			
			InnerLoop:
			for(int j = 0; j<5; j++) {
				if(j>=2) {
					break OuterLoop;
				}
				
				System.out.println("i:" + i + ": j:" +j);
			}
			
			System.out.println();
		}
	}

}
