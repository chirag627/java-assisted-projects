import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {

		System.out.println("Enter the length of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("Enter the Elements of the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number to rotate the array");
		int d = sc.nextInt();

		System.out.println();

		antiClockWise(a, d, n);

	}

	private static void antiClockWise(int[] a, int d, int k) {
		int p = 1;
		while (p <= d) {
			int last = a[0];
			for (int i = 0; i < k - 1; i++) {
				a[i] = a[i + 1];
			}
			a[k - 1] = last;
			p++;
		}
		System.out.print("Rotation of array in anti clock wise:  ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

}
