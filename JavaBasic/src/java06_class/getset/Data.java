package java06_class.getset;

public class Data {
	
	private int num;
	private String name;
	private String phone;
	
	// Setter 메소드
	public void setNum(int num) {
		this.num = num;
	}
	
	// Getter 메소드
	public int getNum() {
		return num;
		// this.을 멤버 필드나 다른 멤버 메소드의 변수를 찾는다.
		// this를 입력하지 않는다면 가장 가까운 변수를 지칭하게된다.
	}

	public String getNAME() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// Getters, Setters 만드는 단축키 : alt + s, r
	// 퀵메뉴 이용할땐 alt 대신 alt+shift
	
	//alt+shift+s, r
	//alt + a, r
	
}
