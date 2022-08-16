import java.util.PriorityQueue;
import java.util.Queue;

public class queueOperations {
	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<Integer>();

		q1.offer(56);
		q1.offer(65);
		q1.offer(41);
		q1.offer(29);
		q1.offer(35);
		q1.offer(44);
		q1.offer(20);
		q1.offer(52);
		System.out.println(q1);
		// To remove the element without exception if queue is empty
		q1.poll();
		System.out.println(q1);
		q1.remove(52);
		System.out.println(q1);
		// Head of the Queue
		System.out.println(q1.peek());
		System.out.println(q1.element());

	}
}
