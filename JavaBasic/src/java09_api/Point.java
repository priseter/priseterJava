package java09_api;

public class Point implements Cloneable {
	
	private int x;
	private int y;
	
	
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Point clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Point)super.clone();
	}
	
	
	@Override
	public String toString() {
//		return super.toString();// Object 값 출력, Object.toString();
		return ("x" + " = " + x);
	}
	
	public boolean equals(Object obj) {
		if( this.x == ((Point)obj).getX()&&
					this.y == ((Point)obj).getY()) {
			return true;
		}
		return false;
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


	

}


