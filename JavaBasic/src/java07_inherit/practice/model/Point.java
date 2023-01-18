package java07_inherit.practice.model;

public class Point {
	protected int x;
	protected int y;
	protected int[][] Point;
	
	public Point() { 
		this.Point = new int[2][5];
	}
	public Point(int x,int y) { 
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int[][] getPoint() {
		return Point;
	}
	public void setPoint(int[][] point) {
		Point = point;
	}
	public void draw() {
		System.out.print("중심점 : ");
		System.out.println("("+ x +","+ y +")");
	}


}
