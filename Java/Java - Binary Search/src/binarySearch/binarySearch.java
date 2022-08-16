package binarySearch;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class binarySearch {
	public static void main(String[] args) {
		System.out.println("Enter the lenngth of an array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the elements of an array");
		int[] arr = new int[n];
		int found=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		System.out.println("Enter the element to be searched");
		int element = sc.nextInt();
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (element > arr[mid]) {
				low = mid + 1;
			} else {
				if (element < arr[mid]) {
					low = mid - 1;
				} else {
					if (element == arr[mid]) {
						found=1;
						break;
					}
				}
			}

		}
		if(found==1) {
			System.out.println("Element Found in an array");
		}
		else {
			System.out.println("Element Not found in an array");
		}
	}
}
