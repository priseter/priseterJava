package java03_scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FormattedDouble {

	public static void main(String[] args) {

		//소수점 자릿수를 지정하여 출력하기
		
		//방법 1
		//	System.out.printf(); 메소드 이용하기
		//	(printf - print formatted)
		
		// 출력 서식을 지정하여 화면에 데이터를 출력한다.
		
//		System.out.printf("문자열\n");
//		System.out.printf("서식문자를 포함하는 문자열");
		
		//	**서식문자 : 출력데이터의 형식을 지정하는 문자
		// %d 정수
		// %f 소수점
		// %s 문자열
		// %c 단일 문자 형식
		
		//** %와 형식지정글자 사이에 숫자를 이용하여 자릿수를 지정한다.
		System.out.printf("%s%n","안녕하세요");
		System.out.printf("총점 %d점%n", 289);
		System.out.printf("%s%d%n","HIHI",574);
		System.out.printf("%9.4f%n",32.8);
		System.out.printf("%.2f%n",89.66666666666666667);
		
		//-------------------------------------------------------------------------
		
		//방법 2. String format("서식문자 포함 문자열", [서식문자를 대체할 데이터])
		//-> 변환돤 문자열을 String타입으로 반환한다.
		
		String str = String.format(".2f", 33.3333333333333333333333);
		
		System.out.println("str : "+ str);
		
		
	}

}
