package ThreadsUsingMultiThreading;
import java.util.Scanner;

public class MultiThreading extends Thread {
	private static int a;
	private static int b, sum;

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		MultiThreading.a = sc.nextInt();
		MultiThreading.b = sc.nextInt();
		MultiThreading.sum = 0;
		MultiThreading m = new MultiThreading();
		m.start();

		try {
			m.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum of " + MultiThreading.a + " and " + MultiThreading.b + " is "
				+ (MultiThreading.a + MultiThreading.b));

	}
}
