package notAllStatic;

public class Outer {
public static void main(String[] args) {
	
	Outer o1=new Outer();
	o1.f1();
	
	Outer.Inner o2=new Outer.Inner();
	o2.f2();
}
void f1() {
	System.out.println("Inside Outer Class");
}
static class Inner{
	void f2() {
		System.out.print("Inside Inner class");
	}
}
}
