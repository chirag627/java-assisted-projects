import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsOperation {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Chirag");
		m.put(2, "Sujal");
		m.put(3, "Mayank");
		m.put(4, "Shreya");
		m.put(5, "Rashi");
		m.put(6, "Yash");

		// Print values of key
		for (int i = 1; i <= m.size(); i++) {
			System.out.println(m.get(i));

		}

		//print all keys and values
		System.out.println(m);
		
		//print all keys
		Set<Integer> keys = m.keySet();
		System.out.println(keys);
		
		//print all values
		Collection<String> values = m.values();
		
		//check if key matches with value
		boolean b1=m.get(1).equals("Chirag");
		System.out.println(b1);
	}
}
