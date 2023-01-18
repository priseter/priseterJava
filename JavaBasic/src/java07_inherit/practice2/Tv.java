package java07_inherit.practice2;

public class Tv extends Product{

	public Tv() {
	}

	public Tv(String model, int price) {
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
