package java06_class.diagram;

public class Car {
	private String model;// 모델
	private String color;// 색상
	
//	public Car() { } ctal + space 하면 나옴
	public Car() { }
	
	//alt + shift + s,o
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public void dispay() {
		System.out.println(model + " " + color);
	}
	

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
