package java09_api;

public class StringEx {

	public static void main(String[] args) {

		
		String str1 = "Apple"; //리터럴 상수
		String str2 = new String("Banana"); //동적 할당한 문자열.
		String str3 = "Cherry";
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		
		System.out.println("Cherry의 길이" + "Cherry".length());
		
		//---------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n------- toLowerCase()--------------");
		
		String lower = str1.toLowerCase();
		
		System.out.println(str1);
		System.out.println(lower);
		
		System.out.println("\n------- toUpperCase()--------------");
		String upper = str2.toUpperCase();
		System.out.println(str2);
		System.out.println(upper);
		System.out.println("\n------- charAt(int)--------------");
		System.out.println(str1.charAt(3));
		System.out.println("\n------- replace(char,char)--------------");
		System.out.println(str2.replace('n', 'X'));
		System.out.println(str2.replace("na", "Xxx"));
		System.out.println(str2);
		
		System.out.println("\n------- contains()--------------");
		//특정 문자열을 포함하고 있는지 확인한다.
		
		boolean res1 = "Hello Java, Welcome.".contains("ava");
		System.out.println(res1);
		
		boolean res2 = str1.contains("PP");
		System.out.println(res2);
		
		System.out.println("\n------- substring()--------------");
		//문자열의 일부분을 *발췌*하여 반환한다.
		String substr1 = str1.substring(2);
		System.out.println(substr1);
		String substr2 = str2.substring(1,3); //1번째(포함)~3번째(미포함)인덱스 반환
		System.out.println(substr2);
		
	}

}
