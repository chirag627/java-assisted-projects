package anoClass;

public class anormousInnerClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Anormous Class using thead");

			}
		});
		t1.start();

	}
}
