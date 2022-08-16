package methodCalling;

public class overLoadingMethod {
	void addNum(int a, int b) {
		System.out.println("adding two integer number " + (a + b));
	}

	void addNum() {
		System.out.println("There is no number to be added");
	}

	void addNum(float a, float b) {
		System.out.println("adding two float number " + (a + b));
	}
	
	public static void main(String[] args) {
		overLoadingMethod o=new overLoadingMethod();
		// no args 
		o.addNum();
		
		// 2 int args
		o.addNum(7, 9);
		
		//2 float args
		o.addNum(6.6886f,7.7878f);
		
		
	}

}
