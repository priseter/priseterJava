package java08_abstract;

//자식 클래스

//학생

public class Student extends Person {
	
	private String subject; // 수강 과목
	
	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}

	@Override
	public void display() {
		System.out.println("[학생] " + name + ", " + subject + " 수강");
	}

}
