package Autowire;

public class Parent {
  Child c;
	public Parent() {
		System.out.println("Parent is Created");
	}
	public Child getC() {
		return c;
	}
	public void setC(Child c) {
		this.c = c;
	}
	void print() {
		System.out.println("Hello Parent");
	}
	void display() {
		print();
		Child.print();
	}

}
