package java06_class.getset;

public class GetSetEx {

	public static void main(String[] args) {

		Data data = new Data();
//		data.num = 10;
		//-----------------------------------------
		
		data.setNum( 10 );
		System.out.println(data.getNum());
		//-----------------------------------------
		data.setNum(444);
		data.setNum(888);
		data.setNum(999);
		
		int num = data.getNum();
		System.out.println("반환된 값 :" + num );
		//-----------------------------------------
		
		data.setName("Alice");
		System.out.println( data.getNAME());
	}
}
