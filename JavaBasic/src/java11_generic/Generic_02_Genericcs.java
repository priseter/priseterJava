package java11_generic;

class Class02 <T> {
	protected T data;
	
	public T display(T data) {
		this.data = data;
		return data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
}
public class Generic_02_Genericcs {
	

	public static void main(String[] args) {
		
	
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		String fruit = c02.getData();
		
		System.out.println(fruit);
		
	}
}


