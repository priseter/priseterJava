package java07_inherit.practice2;

public class Computer extends Product {

	public Computer() {
		super();
	}

	public Computer(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.print(getModel());
		System.out.print(", ");
		System.out.print(getPrice());
		System.out.println();
	}
	
	
}
