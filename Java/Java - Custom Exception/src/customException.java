
public class customException {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int n = arr.length;

		try {
			if (n == arr.length - 1) {
				for (int i = 0; i <= n; i++) {
					System.out.println(arr[i]);
				}

			} else {
				throw (new IndexOutOfBoundsException("array starts from index 0 to arr.length-1"));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}
}
