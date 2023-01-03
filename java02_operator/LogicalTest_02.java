package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		
		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 = a < b || --a > c++;
		
		//컴퓨터는 차근차근 읽는다.
		// or나 and를 만나면 왼쪽에 있는 코드를 먼저 실행한다.
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		//논리연산자의 단축연산(shortcut)

		
		boolean res2;
		
		res2 = c<b++ && c-->++a; 
		
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		//AND연산은 왼쪽 피연산자가 false라면 오른쪽 항의 연산을 수행하지 않는다.
		//OR연산은 왼쪽 피연산자가 true라면 오른쪽 항의 연산을 수행하지 않는다.
		
		int d = 5, e = 6, f = 10;

		boolean res3;
		res3 = --d > f++ || d>e;
		
		//컴퓨터는 차근차근 읽는다.
		// or나 and를 만나면 왼쪽에 있는 코드를 먼저 실행한다.
		System.out.println("a=" + d + ", b=" + e + ", c=" + f);
		
	}
}









