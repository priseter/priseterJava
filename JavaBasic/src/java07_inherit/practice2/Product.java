package java07_inherit.practice2;

public abstract class Product {
	// 추상적인 개념을 가진 클래스는 실체화 할수 없기때문에 (메소드가 실제로 존재하지 않기 때문에)
	// 클래스도 실체화를 할 수 없다. 인스턴스화는 되지않는다. 다만 존재는 한다.

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
