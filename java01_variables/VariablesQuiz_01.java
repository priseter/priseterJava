package java01_variables;

	public class VariablesQuiz_01 {
	
		public static void main(String[] args) {
		
			String name = "Yoon"; // String
			int age = 25; // int
			String gen = "남"; // char or String
			double hegi = 160.01; //double
			
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + gen);
			System.out.println(" 키  : " + hegi);
			
			System.out.println();
			
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + gen);
			System.out.println(" 키  : " + hegi);
			
			System.out.println();
			
			System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gen +  ", 키  : " + hegi);
			
			System.out.println();
			
			System.out.print("이름 : " + name);
			System.out.print(", 나이 : " + age);
			System.out.print(", 성별 : " + gen);
			System.out.println(", 키  : " + hegi);
			
			System.out.println();
			
			//아래와 같이 나타 낼 수도 있으나 보기좋은 코드가 좋은 코드다. 상황에 맞게 사용하자.
			
			System.out.printf("이름 : %s%n나이 : %d%n성별 : %s%n 키  : %.2f%n",name,age,gen,hegi);
			
			System.out.println();
			
			System.out.printf("제 나이는 %d살이고,%n이름은 %s입니다.%n저는 %s성입니다.%n", age,name,gen);
			System.out.printf("제 신장은 %.2f cm입니다.%n", hegi);
			
			System.out.println("Hi\nHELLO HOLA");
			
			System.out.println();
			
			System.out.println("이름 : " + name + "\n나이 : " + age + "\n성별 : " + gen +  "\n 키  : " + hegi);
			
			//** '\n' : 줄바꿈 문자, 개행문자
			// (ASCII 0 - LF, Line Feed)
			//println의 ln은 마지막에 \n을 추가한다 라는 뜻이다.
	 	
	}

}
