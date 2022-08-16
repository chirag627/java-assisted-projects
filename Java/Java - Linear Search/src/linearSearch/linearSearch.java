package linearSearch;

import java.util.Iterator;
import java.util.Scanner;

public class linearSearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array");
	int n=sc.nextInt();
	int[] arr=new int[n];
	int found=0;
	int index = 0;
	System.out.println("Enter the elements of the array");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Enter the element to be searched");
	int element=sc.nextInt();

	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==element) {
			found=1;
			index=i;
		}
		
	}
	if(found==1) {
		System.out.println(element +" found in an array at index "+index);  
	}
	else {
		System.out.println("Element not found");
	}
}
}
