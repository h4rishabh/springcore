package com.springcore.ref;

public class ClassA {
	private int x;
	private ClassB ob;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public ClassB getOb() {
		return ob;
	}
	public void setOb(ClassB ob) {
		this.ob = ob;
	}
	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ClassA [x=" + x + ", ob=" + ob + "]";
	}
}
