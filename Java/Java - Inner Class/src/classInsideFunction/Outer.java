package classInsideFunction;

public class Outer {

	void f1() {
		System.out.println("Inside outer.f1()");
		
		class Inner{
			void f2(){
				System.out.println("Inside Inner.f2()");
			}
			
		}
		Inner i1=new Inner();
		i1.f2();
		
	}
}
