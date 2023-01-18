package java07_inherit.practice.model;

public class Rectangle extends Point {
	protected int width;
	protected int height;
	
	public Rectangle() { }
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void draw() {
		super.draw();
		System.out.printf("면적 : %.1f%n" ,(double)(width*height));
		System.out.printf("둘레 : %.1f%n" ,(double)(2*(width+height)));
	}
}
