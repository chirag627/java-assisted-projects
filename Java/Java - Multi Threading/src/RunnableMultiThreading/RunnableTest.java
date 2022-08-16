package RunnableMultiThreading;

public class RunnableTest {
public static void main(String[] args) throws InterruptedException {
	RunnableThread r=new RunnableThread();
	System.out.println("Main method Starts");
	Thread T = new Thread(r);
	T.start();
	T.join();
	System.out.println("Main Method Ends");
}
}
