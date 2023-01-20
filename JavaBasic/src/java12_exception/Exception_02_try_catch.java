package java12_exception;

public class Exception_02_try_catch {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int i = 0;
		
			try {
				while(true) {
					arr[i] = i+1;
					i++;
					}
//				while(i<arr.length) {
//					arr[i] = i+1;
//					i++;
//				}
				
				}catch (ArrayIndexOutOfBoundsException e) {
					//표준 출력 스트림
					System.out.println("예외가 발생했습니다.");
					//표준 에러 스트림	
					System.err.println("[예외발생!]");
					e.printStackTrace();
					//Exception in 으로 시작되면 반드시 고쳐야한다. 의도한 바가 아니게 때문
					// e.printStackTrace();를 쓰면 Exception in
					
				}finally {
					System.out.println("예외 처리 후 실행");
				}
			System.out.println("프로그램 종료");
				
				
	}
				
}

