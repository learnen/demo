package test;

public class Student {
	
	//封装
	private String name = "天山童姥";
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void smile() {
		System.out.println("心里是乐开了花啊");
	}
	
	private void cry() {
		System.out.println("哭得像个泪人");
	}
	
	protected void angry() {
		cry();
		System.out.println("气的像一只dog");
	}
	
	String sad() {
		return "爱是一道光";
	}
	
	public static void main(String[] args) {
//		cry();
	}
}
