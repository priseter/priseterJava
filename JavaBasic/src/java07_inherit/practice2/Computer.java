package java07_inherit.practice2;

public class Computer extends Product {

	public Computer() {
		super();
	}

	public Computer(String model, int price) {
		super(model, price);
	}
	
	@Override // 오버라이딩으로 구현시켜버린다. 추상 코드를 구현시키지 않으면 진행이 안되도록한다.
	public void out() {
		System.out.print(getModel());
		System.out.print(", ");
		System.out.print(getPrice());
		System.out.println();
	}
	
	
}
