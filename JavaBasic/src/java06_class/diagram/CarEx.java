package java06_class.diagram;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car("Ferrari", "Yellow");
		
		car.dispay();
		
		car.setModel("람보르기니");
		car.setColor("빨간색");
		
		car.dispay();
		System.out.println( car.getModel() +"\n"+ car.getColor());
	}

}
