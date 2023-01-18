package java08_abstract;

// 자식 클래스

// 교수

public class Professor extends Person {
	
	private String major;
	
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}
	
//	public void print() {
//		System.out.println("[교수] " + name + ", " + "[전공] " + major);
//	}

	@Override
	public void display() {
		System.out.println("[교수] " + name + ", " + "[전공] " + major);
		
	}

}
