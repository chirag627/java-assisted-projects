package accessingOuterClass;

public class Test {
public static void main(String[] args) {
	Outer o1=new Outer(23);
	o1.f1();
	
	Outer.Inner o2=o1.new Inner(30);
	o2.f2();
}
}
