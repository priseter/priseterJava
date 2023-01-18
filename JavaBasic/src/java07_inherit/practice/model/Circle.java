package java07_inherit.practice.model;

public class Circle extends Point {
	protected int radius;
	
	public Circle() {
	}
	public Circle(int x,int y,int radius) {
		super(x, y);
		this.radius = radius;
		}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw () {
		super.draw();
		System.out.printf("원의 면적 : %.1f%n" ,(Math.PI*radius*radius));
		System.out.printf("원의 둘레 : %.1f%n" ,(Math.PI*radius*2));
	}

}
