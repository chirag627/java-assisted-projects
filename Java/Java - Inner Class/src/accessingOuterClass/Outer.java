package accessingOuterClass;

public class Outer {
	private static int x=50;
	private int y;
	
	Outer(int y){
		this.y=y;
	}
	void f1(){
		System.out.println("Inside Outer Class");
		
	}
	class Inner{
		private static int x=60;
		private int y;
		Inner(int y){
			this.y=y;
			
		}
		void f2() {
			System.out.println(Outer.x);
			System.out.println(Outer.this.y);
			System.out.println(this.x);
			System.out.println(this.y);
		}
	}
}
