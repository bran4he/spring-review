package com.tutorialspoint1;

public class C {

	private String sex;

	public void show(){
		System.out.println("C is showing with :" + this.sex);
	}
	public C(){
		System.out.println("C constructor without para");
	}
	public C(String sex){
		System.out.println("C constructor with para");
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
