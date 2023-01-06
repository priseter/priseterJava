package java05_array.srot;

public class Swap {
	public static void main(String[] args) {
		
		// 스왑, swap, 교환하기, 맞바꾸기
		
		int num1 = 11;
		int num2 = 22;
		// 지금 부터 num1과 num2 값을 서로 교환 하고자 한다.
		
		
//		num2 = num1;
//		num1 = num2; // 이렇게 하면 num2 값 (22) 이 사라지기 때문에 이렇게는 불가능하다.
		// 스왑은 1개의 변수를 추가해서 두 개의 값을 서로 교환 시키는 것이 목적이다.
		
		System.out.println(" [스왑 전] " + num1 + ", " + num2);
		// 스왑 코드
		int temp = num1;
		num1 = num2; // num1(11)은 temp가 가져갔으니 변경!
		num2 = temp; 
		// num2의값(22)은 원래 교환 하기로 목적이었던 num1이 가져갔으니 temp에 있던 num1의 원래값(11)을
		// num2로 이동 시켜서 교환 완료!
		
		System.out.println(" [스왑 후] " + num1 + ", " + num2);
		
	
	}

}
