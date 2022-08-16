import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collections {
	public static void main(String[] args) {
		// ArrayList
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Chirag");
		s1.add("Manisha");
		s1.add("Avneet");
		s1.add("Neha");
		s1.add("Khushboo");
		s1.add("Maya");
		s1.add("Rashmi");
		s1.add("ArrayList");
		s1.add("");

		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		// LinkedList
		LinkedList<String> s2 = new LinkedList<String>();
		s2.add("Chirag");
		s2.add("Manisha");
		s2.add("Avneet");
		s2.add("Neha");
		s2.add("Khushboo");
		s2.add("Maya");
		s2.add("Rashmi");
		s2.add("LinkedList");
		s2.add("");

		Iterator<String> i2 = s2.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

		// Vector
		Vector<String> s3 = new Vector<String>();
		s3.add("Chirag");
		s3.add("Manisha");
		s3.add("Avneet");
		s3.add("Neha");
		s3.add("Khushboo");
		s3.add("Maya");
		s3.add("Rashmi");
		s3.add("Vector");
		s3.add("");
		
		Iterator<String> i3 = s3.iterator();
		while (i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		//stack
		Stack<String> s4 = new Stack<String>();
		s4.push("Chirag");
		s4.push("Manisha");
		s4.push("Avneet");
		s4.push("Neha");
		s4.push("Khushboo");
		s4.push("Maya");
		s4.push("Rashmi");
		s4.push("Stack");
		s4.push("");
		
		Iterator<String> i4 = s4.iterator();
		while (i4.hasNext()) {
			System.out.println(i4.next());
		}
		
	}

}
