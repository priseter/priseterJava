package java09_api;

public class StringBuilderEx {

	public static void main(String[] args) {
// 버퍼와 빌더 모두 기능은 완벽히 같다. 멀티스레드 세이프가 적용되었느냐 안되었느냐 정도의 차이이다.
//		StringBuilder sb;
		StringBuffer sb;
		String str;
		// 에러, String타입처럼 사용불가
//		sb = "Apple";
		
//		sb = new StringBuilder();
		sb = new StringBuffer();
		System.out.println("길이 : " + sb.length());
//		System.out.println("길이 : " + str.length());
		System.out.println("길이 : " + sb.capacity());
		
		System.out.println("\n---------Apple추가--------------------");
		sb.append("Apple");
		sb.append("1234");
		
		System.out.println(sb);
		System.out.println("길이 : " + sb.length());
		System.out.println("길이 : " + sb.capacity());
		
		System.out.println("\n---------맛있는Banana추가--------------------");
		sb.append("맛있는Banana");
		
		System.out.println(sb);
		System.out.println("길이 : " + sb.length());
		System.out.println("길이 : " + sb.capacity());
		
//		sb.replace(0, 33, "");
//		System.out.println(sb);
//		System.out.println("길이 : " + sb.length());
//		System.out.println("길이 : " + sb.capacity());
		System.out.println("\n---------trimToSize--------------------");
		// 불필요한공간 삭제
		sb.trimToSize();
		
		System.out.println(sb);
		System.out.println("길이 : " + sb.length());
		System.out.println("길이 : " + sb.capacity());
	
	}

}
