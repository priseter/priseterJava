package java07_inherit.practice2;

public abstract class Product {

	protected String model;
	protected int price;
	
	public Product() { }

	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	// abstract == 추상화 : 실제는 하되 실행할 수는 없다.
	// 추상화 메소드는 추상화된 클래스에서만 사용할 수 있다.
	public abstract void out();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
