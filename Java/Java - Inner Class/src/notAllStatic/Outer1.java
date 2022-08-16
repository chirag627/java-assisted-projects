package notAllStatic;

import notAllStatic.Outer.Inner;

public class Outer1 {
	public static void main(String[] args) {

		Outer1 o1=new Outer1();
		o1.f1();
		
		Outer1.Inner1 o2=o1.new Inner1();
		o2.f2();
	}
void f1() {
	System.out.println("Inside Outer Class");
}
class Inner1{
	void f2() {
		System.out.println("Inside inner class");
	}
}
}

