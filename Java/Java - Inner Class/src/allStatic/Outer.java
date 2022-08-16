package allStatic;

public class Outer {
 public static void main(String[] args) {
	Outer.f1();
	Outer.Inner.f2();
}
 static void f1() {
	 System.out.println("Inside Outer Class");
 }
 static class Inner{
	 static void f2() {
		 System.out.println("Inside Inner CLass");
	 }
 }
}
